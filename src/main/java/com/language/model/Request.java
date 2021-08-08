package com.language.model;

public class Request {

    private static Request instance = new Request();

    private Request() {
    }

    public static Request getInstance() {
        return instance;
    }

    public String requestDeviceMacAddress() {
        return "Sending request... \n Response: " + Router.getInstance().requestDNS();
    }

    public String requestDefaultGateway(String network) {
        return "Sending request... \n Response: " + Router.getInstance().requestDefaultGateway(network);
    }

}
