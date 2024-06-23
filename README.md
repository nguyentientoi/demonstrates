# Getting Started

### Guides

### Your environment computer:
- JDK 17 or higher
- Download IDE Spring tool 4.x https://spring.io/tools


### 1. Create a database with name `demonstrates`
- Run scripts.sql to create database and table

### 2.Configuration connection url in `src/main/resources/application.properties`
- Update configuration information `url, username, password` a with your local database
- spring.datasource.url=
- spring.datasource.username=
- spring.datasource.password=

### 3. Install dependencies for project
- Import project to Spring Tool: IDE -> File -> Import -> Maven -> Exists Maven Projects -> Select demo project
- Right click mouse -> Run As -> Maven install -> Console message `BULD SUCCESS`

### 4. Run Web API: On IDE
- Go to project demo
- Open Class /src/main/java/com/example/demo/DemoApplication.java
- Right click mouse -> Run As -> Spring Boot App

### 5. Access Web API
- On Brower (Chrome or Edge, ...) -> access URL: http://localhost:8089
- Account Login: 
	- username/password: test/test


