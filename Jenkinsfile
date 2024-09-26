pipeline {
    agent any

    tools {
        git 'Git' // Remplacez par le nom de votre installation de Git si nécessaire
        maven 'M3' // Assurez-vous que ce nom correspond à votre configuration Maven
    }

    stages {
        stage('Checkout') {
            steps {
                // Ajoutez des options de credentials si nécessaire
                git url: 'https://github.com/mehdiKharij/TestTP', branch: 'main'
            }
        }

        stage('Display Message') {
            steps {
                echo 'Git checkout successful! Repository cloned.'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Build Success') {
            steps {
                echo 'mvn clean install completed successfully!'
            }
        }
    }
}
