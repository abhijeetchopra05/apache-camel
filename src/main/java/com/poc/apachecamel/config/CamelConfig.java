package com.poc.apachecamel.config;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class CamelConfig extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:say-hello?period={{timer.period}}").routeId("sayHello").routeGroup("sample")
                .transform().method("sampleMessage", "sayHello")
                .filter(simple("${body} contains 'bye'"))
                    .to("stream:out")
                .end()
                .to("stream:out");
    }
}
