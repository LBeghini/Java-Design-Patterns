package com.language.model;

public class Router implements Protocol {

    private static Router instance = new Router();

    private Router() {
    };

    public static Router getInstance() {
        return instance;
    }

    @Override
    public String requestDNS() {
        return "DNS ADDRESS: 201.291.20.3";
    }

    @Override
    public String requestDefaultGateway(String network) {
        if (network.contains("192.168")) {
            return "IP: 192.168.0.1";
        }

        if (network.contains("172.16")) {
            return "IP: 192.168.0.1";
        }

        if (network.contains("10")) {
            return "IP: 192.168.0.1";
        }

        return "APIPA: 169.254.0.1";
    }

}
