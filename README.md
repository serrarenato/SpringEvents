## Exemplo do Spring Event que utiliza o padrão Observable para notificações


Prerequisites
In order to build and run the example application you need:

Java 8
Maven 3.x

### Getting Started
1. Clone the repository

2. Run `mvn clean install`

3. Start the order service on port 8080 by running:
`java -jar target/events.jar`
4. Do a call to localhost:8080/ - verb Post with body:
 
{
	"name":"Renato",
	"age":27,
	"email":"serra@13.com.br"
}

### Authors
Renato Serra - Initial work - Event