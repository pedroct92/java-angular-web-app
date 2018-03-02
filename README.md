# Tutorial of Building Java REST API using Spring Boot and MongoDB

This source code is part of [Tutorial of Building Java REST API using Spring Boot and MongoDB](https://www.djamware.com/post/59be51e780aca768e4d2b140/tutorial-of-building-java-rest-api-using-spring-boot-and-mongodb)

If you think this source code is useful, it will be great if you just give it star or just buy me a cup of cofee [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=Q5WK24UVWUGBN)

MAVEN SPRING BOOT MONGO DB PROJECT
This is a problem to instantiate the crud repository. *You have to add spring-boot-starter-data-rest* in order to automatically implement the interface. 
Then use the *MongoRepository* that extends CrudRepository class. 
Besides, to find with id use *findById* and not *findOne* (the reason are the input and object returned).
