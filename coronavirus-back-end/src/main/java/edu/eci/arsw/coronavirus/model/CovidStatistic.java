package edu.eci.arsw.coronavirus.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public class CovidStatistic {
    private Integer recovered;
    private Integer deaths;
    private Integer confirmed;

    public CovidStatistic(){
    }

    public CovidStatistic(Integer recovered, Integer deaths, Integer confirmed){
        this.recovered=recovered;
        this.deaths=deaths;
        this.confirmed=confirmed;
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
}

