# Devices Tracking System - Service Discovery
The Service Discovery allows all microservices composing the application to register 
dynamically in a global repository and to find another instances on demand.

## Project status
[![Build Status](https://travis-ci.org/device-tracking-system/service-discovery.svg?branch=master)](https://travis-ci.org/device-tracking-system/service-discovery)
[![codebeat badge](https://codebeat.co/badges/ae8e7340-605f-4a22-84b0-74dac0919d11)](https://codebeat.co/projects/github-com-device-tracking-system-service-discovery-master)
    
## Prerequisites
You need to have the following tools installed and configured:
  - Java SE 1.8+
  - Maven 3.0+

## Installation and Commissioning
In order to run the service discovery, follow these steps:
  1. Run the [Configuration Server](https://github.com/device-tracking-system/configuration-server).
  2. Clone the latest production version of this repository from the `master` branch.
  3. Navigate to the cloned repository and install all dependencies by typing:
```
mvn install
``` 
  4. Run the built `*.jar` file passing the location of configuration files by typing:
```
java -jar target/service-discovery-1.0-SNAPSHOT.jar --spring.config.location=classpath:pl/edu/agh/iet/dts/discovery/
```

## Building the Docker image
When the `*.jar` file is successfully built, a Docker image for the production environment may be created by applying
following steps:
  1. Enter the root directory of this repository.
  2. Build the Docker image by typing:
```
docker build . -t service-discovery
```

  3. In order to run the image, type:
```
docker run -p 8080:8080 -p 44341:44321 -p 44343:44323 -t service-discovery
```
Please note that this docker container uses the Performance Co-Pilot (PCP) tool to gather data for system monitoring
metrics. These values are accessed via the `44341` and `44343` ports. In order to visualize performance of this
microservice, please enter the `[CONTAINER IP ADDRESS]:44343` value in the `Hostname` field placed in the Netflix Vector
dashboard.

## Testing
In order to test the application locally, run the built `*.jar` file by typing:
```
java -jar target/service-discovery-1.0-SNAPSHOT.jar --spring.profiles.active=test --spring.config.location=classpath:pl/edu/agh/iet/dts/discovery/
```
and then execute specific tests.
