# microservices_lab
Testing microservices with spring-boot. Using an API Gateway, Naming Server with Eureka, and lots of interconnected spring-boot REST services

Each Service has a Dockerfile that must be built manually, before running docker-compose up, since the images are not on docker hub.

REST Calls:  
http://localhost:8765/user-service/users  
http://localhost:8765/booking-service/events  
http://localhost:8765/location-service/locations  
http://localhost:8765/billing-service/billing/525/2016-11-10T10:00:00/2016-11-11T11:00:00/SEK  
http://localhost:8765/exchange-service/convert/525/SEK/to/USD  
