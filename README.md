# Annual Gross Microservice

The microservice calculates the Annual gross amount from the monthly gross salary.
The endpoints are available in the following endpoints using the HTTP POST method:

* http://localhost:8080/annual-gross/calculation/8000
* http://localhost:8098/annual-gross/calculation/8000

The response will look like as following:

{
"value": "391.99",
"description": "Annual gross"
}

The actuator will be accessible via the following links:

* http://localhost:8080/annual-gross/actuator
* http://localhost:8098/annual-gross/actuator


The first endpoint is accessible via Spring api Gateway and the second one through the server port.

Swagger it is available via the following endpoints:

* http://localhost:8080/swagger-ui/?urls.primaryName=annual-gross
* http://localhost:8098/annual-gross/v3/api-docs

The first endpoints is accessible via Spring api Gateway and the second ones through the server port.