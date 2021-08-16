package com.language.programming.model;

public interface Service {
    void shutdown(Client client);

    String getInfo(Client client);

    boolean isPowered();

}
