#!/usr/bin/env groovy

def call (String imageName){
    echo "Building the Docker image"
            withCredentials([usernamePassword(credentialsId: "Dockerhub", usernameVariable: "user", passwordVariable: "pass")]){
                sh "docker build . -t  $imageName"
                sh "echo $pass | docker login -u $user --password-stdin"
                sh "docker push $imageName"
                    }
}