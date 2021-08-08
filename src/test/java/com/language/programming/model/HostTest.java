package com.language.programming.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.language.model.Host;

public class HostTest {

    @Test
    public void shouldRequestDNS() {
        Host host = new Host();
        assertEquals("Sending request... \n Response: DNS ADDRESS: 201.291.20.3", host.requestDeviceDNSAddress());

    }

    @Test
    public void shouldRequestDefaultGateway() {
        Host host = new Host();
        assertEquals("Sending request... \n Response: IP: 192.168.0.1", host.requestDefaultGateway("192.168.0.5"));

    }

}
