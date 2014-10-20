SpringMVC
=========

Spring MVC helps in building flexible and loosely coupled web applications. The Model-view-controller design pattern helps in seperating the business logic, presentation logic and navigation logic. Models are responsible for encapsulating the application data. The Views render response to the user with the help of the model object . Controllers are responsible for receiving the request from the user and calling the back-end services.

When a request is sent to the Spring MVC Framework the following sequence of events happen.

•	The DispatcherServlet first receives the request.

•	The DispatcherServlet consults the HandlerMapping and invokes the Controller associated with the request.

•	The Controller process the request by calling the appropriate service methods and returns a ModeAndView object to theDispatcherServlet. The ModeAndView object contains the model data and the view name.

•	The DispatcherServlet sends the view name to a ViewResolver to find the actual View to invoke.

•	Now the DispatcherServlet will pass the model object to the View to render the result.

•	The View with the help of the model data will render the result back to the user.

Project Description:

1.have a simple web project with maven  in Eclipse IDE.

2.first create a dummy database for our project, below is a mysql script to execute  query editor.

CREATE DATABASE IF NOT EXISTS `springhibernate_db` 

CREATE TABLE IF NOT EXISTS `employee` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `first_name` varchar(45) DEFAULT NULL,  
  `last_name` varchar(45) DEFAULT NULL,  
  `email` varchar(45) DEFAULT NULL,  
  `phone` varchar(45) DEFAULT NULL,  
  PRIMARY KEY (`id`)  ) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1; 
  
3. Add required dependencies to pom.xml

4. Add 'DispatcherServlet' to our web.xml file to tell the container that all upcoming requests will be handled by Spring itself.
5.  Add datasource bean in Spring-config.xml  which is getting values from a property file, secondly hibernate session factory is being configured and a view resolver is being added to render related jsp's.

6. Controller:Add a controller to the project, we have added all required request-mappings to it to perform CRUD operations.

7. Entity: Add an 'Entity' class to the project, this class represents the table in database. We have added '@Entity' annotation to make hibernate recognize that this POJO is a entity in db. Variable names are automatically mapped to table columns id they are same. In case of any difference we have to annotate the fields with '@Column' annotations. @Id represents surrogate key for table.

8. DAOLayer:All Hibernate related action goes here, operations related to 'Create, Insert, Update and Delete' are being performed in appropriate methods, we are getting session object from an autowired sessionfactory.

9. ServiceLayer: it makes the code more flexible and reusable, using an Service layer in your projects makes it easy to test the data layer.
10. form.jsp: this will render a user registration form. The data entered here will be persisted to the database table using Hibernate.
11. list.jsp:this view will show up a list of all employees stored in Database.

12. ,index.jsp: we have redirected the default flow from 'index.jsp' to our registration form so that 'form' will open on the start up of project

Build Instructions:

1.from Eclipse IDE right click on pom.xml and run as clean.

2.install

War file will copied to D:\apache-tomcat-7.0.56\webapps folder

3.Finally start the tomcat server and the application will deploy on server.

http://localhost:8080/SpringHibernateAnnotations/form 

Or

1.	Start your targeted tomcat server.

2.	Navigate to  project's parent folder and supply following commands.

3.	C:\Users\ptg\workspace\SpringHibernate> mvn install

4.	mvn clean

5.	mvn package

6.	mvn tomcat7:deploy

