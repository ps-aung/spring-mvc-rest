# Spring MVC Rest
RestFul Web Services with Spring MVC

## Requirements
- [JDK 12](https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

1. Clone a copy of git Public URL, replacing *YOUR-USERNAME* with your Github username.

   `git clone https://github.com/YOUR-USERNAME/spring-mvc-rest.git`
   
2. Run Project with at Terminal
   
   `mvn spring-boot:run`
   
## API EndPoints
All API endpoints are public and view by Swagger UI `http://localhost:8080/swagger-ui.html`

### Category API

1. Endpoint
  `http://localhost:8080/api/v1/categories`

2. Allowed HTTP Methods
  `GET`

3. GET accept optional parameter `name`
  Response Format is
  ```
  {
    "categories": [
      {
        "id": Long,
        "name": "string"
      }
    ]
  }
  ```
  
### Customer API

1. Endpoint
  `http://localhost:8080/api/v1/customers`
  
2. Allowed HTTP Methods
  `GET,POST,PUT,PATCH,DELETE`
  
3. GET accept optional parameter `id`
  Response Format is
  ```
  {
    "customers": [
      {
        "customer_url": "string",
        "firstname": "string",
        "lastname": "string"
      }
    ]
  }
  ```
4. POST accept JSON Array Body. Request Format is
```
{
  "firstname": "string",  //Required
  "lastname": "string"  //Required
}
```
Response Format is
```
{
  "customer_url": "string",
  "firstname": "string",
  "lastname": "string"
}
```
5. PUT require parameter `id` and accept JSON Array Body. Request Format is
```
{
  "firstname": "string",  //Required
  "lastname": "string"  //Required
}
```
Response Format is
```
{
  "customer_url": "string",
  "firstname": "string",
  "lastname": "string"
}
```
6. PATCH require parameter `id` and accept JSON Array Body. Request Format is
```
{
  "firstname": "string",  //Required
  "lastname": "string"  //Required
}
```
Response Format is
```
{
  "customer_url": "string",
  "firstname": "string",
  "lastname": "string"
}
```
7. DELETE require parameter `id`. 

### Vendor API

1. Endpoint
  `http://localhost:8080/api/v1/customers`
  
2. Allowed HTTP Methods
  `GET,POST,PUT,PATCH,DELETE`
  
3. GET accept optional parameter `id`
  Response Format is
  ```
  {
    "vendors": [
      {
        "name": "string",
        "vendor_url": "string"
      }
    ]
  }
  ```
4. POST accept JSON Array Body. Request Format is
```
{
  "name": "string",  //Required
}
```
Response Format is
```
{
  "name": "string",
  "vendor_url": "string"
}
```
5. PUT require parameter `id` and accept JSON Array Body. Request Format is
```
{
  "name": "string",  //Required
}
```
Response Format is
```
{
  "name": "string",
  "vendor_url": "string"
}
```
6. PATCH require parameter `id` and accept JSON Array Body. Request Format is
```
{
  "name": "string",  //Required
}
```
Response Format is
```
{
  "name": "string",
  "vendor_url": "string"
}
```
7. DELETE require parameter `id`. 

 

