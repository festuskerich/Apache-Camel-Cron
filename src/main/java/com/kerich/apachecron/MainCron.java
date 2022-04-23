package com.kerich.apachecron;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MainCron extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("cron:tab?schedule=0/5+*+*+*+*+?")
                .process(new CronService())
                //.log("${body}")
                .bean(ProcessorService.class, "lo");

    }

}
