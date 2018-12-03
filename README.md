## Container Demo - Starting with k8s

This project is a small starter project to demonstrate the
use of docker/grade along with a local kubernetes
cluster. 

To use the project:

1.  Build the docker container with the gradle project with the
command `gradle-docker`

2.  Run the local container in a Docker for Mac
kubernetes pod.  `kubectl create -f demo.yaml`

3.  Forward the k8s cluster port to your local Mac
with the `port-forward` command:

```aidl
kubectl port-forward service/demo-service 9376
```

This should spin up a small Spring Boot application
that runs within the local k8s cluster.

A couple of talking points:

* This solution is certainly very basic - a single 
container definition that reflects a simple 
exercise.

* The decision to start a k8s project will also require 
some thought into how to deploy apps.  (EKS has a handy
authentication mechanism built in.) 

* Deploying apps requires something of a re-design 
as to how we create and deploy applications.  The application
deployment is a 'kubernetes' application deployment.

* There needs to be some careful thought into the 
pros and cons of the effort required to build 
out kubernetes.