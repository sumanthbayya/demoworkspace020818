# SpringBoot , Angular JS,Bootstrap, PCF


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

## For Jars:

* Install Java 1.8 and setup class path.
* Now run both jars with cmd prompt by using command : 
  For Example C:\product_workspace\demoworkspace020818\product_ui_web_demo>java -jar product_service_demo-0.0.1-SNAPSHOT.jar 

## For Code to Run and up in localhost
* Eclipse IDE
* Gradle
* Java 1.8
* Web Browser(haha i know this will be there but yeah ! just saying)
Then Import as Existing projects into IDE with project root workspace and start as Spring Boot Application(Internal tomact Server is Up to run)

## URL For UI
* http://localhost:9030/DemoUiWeb



### Deployment
## Pivotal cloud foundry deployment.
* Install pivotal cloud foundry(PCF) console in .msi format for windows.
* Login to pcf
	
cmd line for running - cf login -a api.run.pivotal.io
command will ask username and password

* Pushing jar
			    (project-name)
  cf push restsumantht -p demo-restful-1.0.0-spring-boot.jar
 
 * Get the end point route url from pivotal console and run ! 
 



## Built With
* Bootstrap 3.3.7 - Styling
* Angular Js - Web Framework
* Spring Boot
* Java
* Spring Data JPA
* Gradle(mavenCentral()) - Dependency Management
* Log4j - Logging framework
* Selenium - Automation testing
* Spring actuator - Application Montoring tools.




## Authors

* **Sumanth Bayya** - (https://github.com/sumanthbayya)



