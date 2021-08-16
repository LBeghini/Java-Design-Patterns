package com.language.programming.model;

import java.util.Random;

public class Server implements Service {

    private String ip;
    private Integer memory;
    private Integer CPU;
    private Integer disk;
    private boolean power;

    public Server(String ip) {
        Random random = new Random();

        this.ip = ip;

        this.memory = random.nextInt(8000);
        this.CPU = random.nextInt(100);
        this.disk = random.nextInt(100);
        this.power = true;

    }

    @Override
    public void shutdown(Client client) {
        this.power = false;
    }

    @Override
    public String getInfo(Client client) {
        return "ipAddress:                   " + this.ip + "\nMemTotal:                    " + 8000 + "kB"
                + "\nMemAvailable:                " + (8000 - this.memory) + "kB" + "\ncpuUsage:                    "
                + this.CPU + "%" + "\nDiskUsage:                   " + this.disk + "%";
    }

    public boolean isPowered() {
        return power;
    }

}
