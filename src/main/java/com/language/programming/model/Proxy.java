package com.language.programming.model;

public class Proxy implements Service {

    private Server server;
    private String ip;

    public Proxy(String ip) {
        this.ip = ip;
    }

    @Override
    public void shutdown(Client client) {

        if (!checkAccess(client)) {
            throw new IllegalAccessError("Unauthorized.");
        }

        if (this.server == null) {
            this.server = new Server(this.ip);
        }

        this.server.shutdown(client);
    }

    @Override
    public String getInfo(Client client) {

        if (this.server == null) {
            this.server = new Server(this.ip);
        }
        return this.server.getInfo(client);
    }

    public boolean checkAccess(Client client) {
        if (!client.getRole().equals(Role.ADMIN)) {
            return false;
        }

        return true;

    }

    @Override
    public boolean isPowered() {

        if (this.server == null) {
            this.server = new Server(this.ip);
        }

        return this.server.isPowered();
    }

}
