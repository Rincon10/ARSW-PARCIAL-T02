package edu.eci.arsw.coronavirus.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public class CovidStatistic {
    private int recovered;
    private int deaths;
    private int confirmed;
    private String lastChecked;
    private String lastReported;
    private String location;

    public CovidStatistic(){

    }

    public CovidStatistic(int recovered, int deaths, int confirmed, String lastChecked, String lastReported, String location){
        this.recovered=recovered;
        this.deaths=deaths;
        this.confirmed=confirmed;
        this.lastChecked=lastChecked;
        this.lastReported=lastReported;
        this.location=location;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public String getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(String lastChecked) {
        this.lastChecked = lastChecked;
    }

    public String getLastReported() {
        return lastReported;
    }

    public void setLastReported(String lastReported) {
        this.lastReported = lastReported;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
