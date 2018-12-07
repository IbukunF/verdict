# Verdict - SE 575 Final Project

## Introduction

The purpose of this project is to build a web application that utilizes Yelp's API to present the user with three food options based off of search criteria. We utilize Docker and Kubernetes for deployment of this application.

## Steps to Run Application

1. Clone repository to destination of choice. This tutorial will assume cloning the repository into the C:\ drive, and using the C:\ drive as the working directory.
2. Start Minikube. We utilize VirtualBox as our virtual machine driver.<br />
  `minikube start --kubernetes-version="v1.12.0" --vm-driver="virtualbox"`
3. Enable Docker environment in Kubernetes<br />
  `eval $(minikube docker-env)` (on terminal)<br />
  `& minikube docker-env | Invoke-Expression` (on Powershell)<br />
4. Build Docker container to be visible to Kubernetes<br />
  `docker build -t verdict-service ./verdict`<br />
5. Deploy the Docker container to Kubernetes and create the service.<br />
  `kubectl create -f ./verdict/k8s/deploy.yml`<br />
6. Run the applciation.<br />
  `minikube service verdict-service-k`<br />

Optional Steps:
7. Scale the application.<br />
  `kubectl scale --replicas=n deployment/verdict-service-deployment` (replace n with desired amount of pods)
  
Here is a link to a demonstration: [DEMO](https://youtu.be/QSIYcegcRCI)

Here is a diagram representing the architecture of our software:

![alt text](https://raw.githubusercontent.com/IbukunF/verdict/master/Verdict_Software_Architecture.PNG)

