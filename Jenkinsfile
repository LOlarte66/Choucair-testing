#!groovy
import java.text.SimpleDateFormat

def formato = new SimpleDateFormat("yyyyMMddHHmm")
def fecha = new Date()
def tiempo = formato.format(fecha).toString()

pipeline {
    agent any
    stages {
        stage('Conexion Git') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '7cf31f98-dca5-495e-ab64-7cc2525e8c6e', url: 'https://github.com/Yazmin66/Choucair-testing.git']]])
            }
        }





        stage('Test') {
            steps {
                script {
                    try {
                        bat("gradle clean test aggregate")
                        echo 'Ejecucion exitosa de las pruebas'

                    } catch (e) {
                        echo 'Pruebas fallidas'

                    }
                }
            }
        }

        stage('Generar Evidencias') {
            steps {
                script {
                  
                        bat " rename \"${WORKSPACE}\\target\" serenity_${tiempo}"

                        publishHTML([allowMissing         : false,
                                     alwaysLinkToLastBuild: true,
                                     keepAll              : true,
                                     reportDir            : "${WORKSPACE}//serenity_${tiempo}/site/serenity",
                                     reportFiles          : 'index.html',
                                     reportName           : 'Test Demo serenity evidencias ',
                                     reportTitles         : 'Serenity demo Proyecto'])
                        echo 'Reporte generado exitosamente'
                    
                }
            }
        }


        stage('Analisis del sonar') {
            steps {
                script {
                    scannerHome = tool 'SonarQubeScanner'
                }
                withSonarQubeEnv('sonarQube')
                        {
                            bat 'sonar-scanner'
                        }
            }
        }
    }
}
