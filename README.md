# apache-camel
Introduction to Camel - Hello World with some filtering

The example generates messages using timer trigger, writes them to standard output.

**Camel Routes**

The Camel route is located in the CamelConfig class. 
In this class the route starts from a timer, that triggers every 
2nd second and calls a Spring Bean sampleMessage which returns a message, 
that is routed to a stream endpoint which writes to standard output(sout).

**How to run**

`mvn spring-boot:run`

