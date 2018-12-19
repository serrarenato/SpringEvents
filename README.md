## Simple example of Spring Event

This API received one Employee, save in database and send one event.

There are two subscribe to handler the event one of then send email and another to register a log.

### Prerequisites
In order to build and run the example application you need:

Java 8
Maven 3.x

### Getting Started
* Clone the repository

* Run `mvn clean install`

* Start the order service on port 8080 by running:
`java -jar target/events.jar`
* Add a new employee to database: 
    * POST http://localhost:8080

```json 
{
	"name":"Renato",
	"age":27,
	"email":"serra@13.com.br"
}
```

### Authors
Renato Serra - Initial work - Event - https://github.com/serrarenato/SpringEvents
