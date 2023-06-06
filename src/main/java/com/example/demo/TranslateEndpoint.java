package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Element;

@Endpoint
public class TranslateEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/demo";

    private TranslateService translateService;

    @Autowired
    public TranslateEndpoint(TranslateService translateService) {
        this.translateService = translateService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TranslateRequest")
    @ResponsePayload
    public Element translate(@RequestPayload Element requestElement) {
        String day = requestElement.getTextContent();
        String translatedDay = translateService.translateDay(day);
    }
}

