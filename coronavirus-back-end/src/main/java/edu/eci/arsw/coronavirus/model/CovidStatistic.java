package edu.eci.arsw.coronavirus.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public class CovidStatistic {
    private Integer recovered;
    private Integer deaths;
    private Integer confirmed;
    private String lastChecked;
    private String lastReported;
    private String location;

    public CovidStatistic(){
    }

    public CovidStatistic(Integer recovered, Integer deaths, Integer confirmed, String lastChecked, String lastReported, String location){
        this.recovered=recovered;
        this.deaths=deaths;
        this.confirmed=confirmed;
        this.lastChecked=lastChecked;
        this.lastReported=lastReported;
        this.location=location;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
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
