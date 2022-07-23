#!/usr/bin/env groovy

def call (){
    echo "Building The Application FOR BRANCH $BRANCH_NAME"
    sh "mvn package"
}