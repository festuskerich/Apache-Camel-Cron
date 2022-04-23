package com.kerich.apachecron;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CronService implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        log.info("this worls is useless");
        List<String> list = new ArrayList<>();
        list.add("kerich");
        list.add("kolo");
        exchange.getIn().setBody(list);
    }

}
