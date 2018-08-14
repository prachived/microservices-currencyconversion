### Currency conversion Application
SpringBoot web application based on two microservices:
   1. Forex microservice(FS) : Acts as the Service Provider. It provides currency exchange values for various currencies
   2. Currency Conversion microservice(CCS): Acts as the Service Consumer. Converts one currency to other. It uses Forex Service to get           current currency exchange values.


All instances of the components (CCS and FS) register with the Eureka Naming Server. When FS needs to call the CCS, it will ask Eureka Naming Server for the active instances. Ribbon is used to do Client Side Load Balancing between the different instances of FS.


### Steps to run the application:
- Download the zip or clone the Git repository.
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application
