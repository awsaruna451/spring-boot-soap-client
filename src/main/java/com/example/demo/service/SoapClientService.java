package com.example.demo.service;

import com.example.demo.wsdl.GetExampleRequest;
import com.example.demo.wsdl.GetExampleResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class SoapClientService {

    private final WebServiceTemplate webServiceTemplate;

    public SoapClientService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public String getExample(String name) {
        GetExampleRequest request = new GetExampleRequest();
        request.setName(name);
        
        GetExampleResponse response = (GetExampleResponse) webServiceTemplate
            .marshalSendAndReceive(request, new SoapActionCallback(""));
                                 
        return response.getResult();
    }
} 