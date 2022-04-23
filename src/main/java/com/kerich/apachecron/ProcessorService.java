package com.kerich.apachecron;

import java.util.List;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProcessorService {

    final DataRepository repository;

    // Fetch data from database.
    public void lo(Exchange exchange) {
        log.info("message from exchange {}", exchange.getIn().getBody(String.class));
        createCsv(exchange.getIn().getBody(List.class));
        repository.getFamousLog();
    }

    // Create csv
    public void createCsv(List<String> list) {

    }

    // fetch token
    public String token() {
        return "";
    }

    // Send email
    public void callEngagementAPI() {

    }
}
