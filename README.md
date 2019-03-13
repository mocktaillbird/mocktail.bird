# 			mocktail.bird

**SetUp** 		**Storie Board** 		**Features** 		**Good to have**

______



An Open source Mock application for http REST services and JSON stuff. Helps to create mock server for mocking all the api  for development with in-build support of mongodb, HTTP/2, Authentication etc.

#### Pre Req:

--------------

java 8

maven 3.3.9 or latest

mongodb setup



#### Set Up:

------

1. java 8 installation, Check using ``` java -version```
2. mvn installation, Check using ``` mvn -version```
3. [mongoDB setup]( )
4. git clone 
5. Update application.properties file with you db configurations.
6. Run ``` mvn clean install``` in root
7. ```cd services```
8. ```mvn spring-boot:run```
9. In the browser [Check](http://localhost:9080/swagger-ui.html) if application is running.

####Storie Board

___

[Agile](https://trello.com/b/SYCJdKCZ/mocktailbird)

####  #Features:

-----------------

* JSON Validation (client side approach)

* JSON Formatter (client side approach)

* Mocking rest services (with random url or custom urls)

* File system or database management

* User url grouping

* User authentication

* Time delay for the api response time

* swagger UI for API management (http://localhost:9080/swagger-ui.html#/)

* HTTP/2 Support

* Docker implementation

  

#### #Good to Have:

_______

* Staring/stopping services





