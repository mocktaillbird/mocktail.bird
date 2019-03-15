# mocktail.bird

#### Overview:
____

An Open source Mock application for http REST services and JSON stuff. Helps to create mock server for mocking all the api for development, with in-build support of HTTP/2, cache, Authentication, Swagger, JSON validation and Formatting at one place. 



#### Pre Req:

--------------

java 8

maven 3.3.9 or latest

mongodb setup

#### Set Up:

------

1. java 8 installation, Check using ``` java -version```

2. mvn installation, Check using ``` mvn -version```

3. [mongoDB setup]( https://github.com/mocktaillbird/docs.mocktail.bird )

4. git clone 

5. Update application.properties file with you db configurations(if not default).

6.  **Starting application**

   * <i>Executable Jar</i>
     * ``` mvn package```
     * ``` cd services```
     * ``` java -jar target/mocktail-bird-service-0.0.1-SNAPSHOT.jar```

   * <i>Normal run</i>
     * Run ``` mvn clean install``` in root
     * ```cd services```
     * ```mvn spring-boot:run```

7. In the browser [Check](http://localhost:9080/swagger-ui.html) if application is running.

8. [Welcome page](http://localhost:9080/)

   

#### #Storie Board

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

* Cache implementation 

* swagger UI for API management (http://localhost:9080/swagger-ui.html#/)

* HTTP/2 Support

* Docker implementation

  

#### #Good to Have:

_______

* Staring/stopping services





