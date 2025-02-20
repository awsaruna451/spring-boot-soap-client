package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SoapClientService {

    private final WebServiceTemplate webServiceTemplate;

    public SoapClientService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public Object callSoapService(Object request) {
        try {
            log.info("Sending SOAP request: {}", request);
            Object response = webServiceTemplate.marshalSendAndReceive(request);
            log.info("Received SOAP response: {}", response);
            return response;
        } catch (Exception e) {
            log.error("Error calling SOAP service: ", e);
            throw new RuntimeException("Failed to call SOAP service", e);
        }
    }
} 