# Spring MVC

In these example we show how your can setup an simple Hello world application with Spring MVC(with annotations) and with the user of SparkJava (without annotations)

## Spring MVC
An combination of Spring boot and Spring MVC is used to setup an application with 2 REST controllers. The application can be found in the `annotations` package.

### Testing
For testing we choose to add only integration test, because most functionality is added with annotations, so the application needs to run to prove that the application is setup properly.

## SparkJava
For the non annotation application we choosen the `SparkJava` framework, which enables us to setup an web application very fast. <br/>More information about the framework can be found at http://sparkjava.com/<br/>
This setup can be found in the package `nonannotations`.
  
### Testing
SparkJava doesn't use annotations, so almost the whole application can be unit tested. For testing of the correct request mapping we added an integration test.
