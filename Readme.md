## Spring fun

The project contains two client modules (`client-with-java-config`, `client-with-xml-config`) which both depend on the  `legacy-module` which uses Spring XML config.

The `legacy-module` defines a `GreetingService` with an implementation (`DutchGreetingService`) and also a client of this `GreetingService` which is `GreetingServiceClient`

Now in the two client modules we depend on the `legacy-module` and use the `GreetingServiceClient` but we would like to override the `GreetingService` with its own implementation. 

#### Client with XML Config

In the `client-with-xml-config` module we construct the application context like this:

```
ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:/META-INF/spring/module-context.xml",
                "classpath:/client-context.xml"
);
```

The ordering of the resources matter. In the above scenario the `DutchGreetingService` from `legacy-module` will be overridden by the `HungarianGreetingSerivce` since both have the same id `greetingService`.


#### Client with Java Config

In the `client-with-java-config` module with Java config we cannot override the `DutchGreetingService` from `legacy-module`. 
 
```
@SpringBootApplication
@ImportResource(value = "classpath*:/META-INF/spring/module-context.xml")
```
 



 