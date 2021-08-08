package com.language.model;

public class Host {

    public Host() {

    }

    public String requestDeviceDNSAddress() {
        return Request.getInstance().requestDeviceMacAddress();
    }

    public String requestDefaultGateway(String network) {
        return Request.getInstance().requestDefaultGateway(network);
    }

}
