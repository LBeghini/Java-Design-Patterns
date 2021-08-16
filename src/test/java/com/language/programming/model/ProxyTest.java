package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeAll;

public class ProxyTest {

    static Proxy proxy;

    @BeforeAll
    static void setUp() {
        proxy = new Proxy("192.168.100.200");
    }

    @Test
    public void shouldReturnServerInfo() {
        Client client = new Client("user", Role.ADMIN);

        assertThat(proxy.getInfo(client),
                matchesPattern("ipAddress:                   (.*)" + "\nMemTotal:                    (\\d*)kB"
                        + "\nMemAvailable:                (\\d*)kB" + "\ncpuUsage:                    (\\d*)%"
                        + "\nDiskUsage:                   (\\d*)%"));
    }

    @Test
    public void shouldShutdownServer() {
        Client client = new Client("user", Role.ADMIN);
        proxy.shutdown(client);
        assertFalse(proxy.isPowered());
    }

    @Test
    public void shouldFailShutdownServer() {
        Client client = new Client("user", Role.USER);

        assertThrows(IllegalAccessError.class, () -> {
            proxy.shutdown(client);
        });
    }

}
