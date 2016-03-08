package com.example;

public class DataSource {

    private String server;
    private int port;

    public DataSource(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort() {
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer() {
        this.server = server;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "server='" + server + "', " +
                "port='" + port + "'}";
    }

}
