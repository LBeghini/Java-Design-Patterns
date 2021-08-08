package com.language.model;

public interface Protocol {
    String requestDNS();

    String requestDefaultGateway(String network);
}
