# Tutorial of Building Java REST API using Spring Boot and MongoDB

This source code (https://github.com/didinj/springboot-mongodb-restapi-2017) is part of [Tutorial of Building Java REST API using Spring Boot and MongoDB](https://www.djamware.com/post/59be51e780aca768e4d2b140/tutorial-of-building-java-rest-api-using-spring-boot-and-mongodb)

|Please donate whether you wish support us to give more time to app's growth | [![](https://www.paypal.com/en_US/IT/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XTC895QYD28TC) |
|:------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------|

## MAVEN SPRING BOOT MONGO DB PROJECT
Web service with spring-boot and mongodb example project.
I have *"mavenized"* and fixed errors of the https://github.com/didinj/springboot-mongodb-restapi-2017 gradle project.

### Fixed problems of forked source repository tutorial project
There was a problem to instantiate the crud repository. *You have to add spring-boot-starter-data-rest* dependency in order to automatically implement the interface. 
Then use the *MongoRepository* that extends CrudRepository class, and not type override annotation on crud methods. 
Besides, to find with id use *findById* and not *findOne* (the reason is the input and object returned).
