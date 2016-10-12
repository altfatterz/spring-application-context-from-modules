# Spring fun

The project consists of tree modules.

* client - with Spring Java config
* service - with XML Spring config
* service2 - with XML Spring config

`client` module depends on both modules `service` and `service2`

The `service` defines `GreetingService` interface with a `DutchGreetingService` implementation. 
It defines a client to the `GreetingService` which is `ClientGreetingSerivce`
  
The `client` module is using this `ClientGreetingService` but would like to override the `GreetingService` with it's own implementation. (`HungarianGreetingService`)
 
How to accomplish that? `@Primary` construct is not working in this case. 
 
# -------------

Another weird thing:

`service2` also defines a `GreetingService` which is `GermanGreetingService`.
In the `client` app the order of `service` or `service2` maven dependencies dictate which of the `GreetingSerivce` implementations are chosen, since this modifies the classpath jar files order. 






 