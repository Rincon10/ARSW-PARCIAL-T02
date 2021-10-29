package edu.eci.arsw.coronavirus.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/29/2021
 */
public class CovidStatisticTotalNumber extends CovidStatistic{
    private String lastChecked;
    private String lastReported;
    private String location;

    public CovidStatisticTotalNumber(){

    }


    public CovidStatisticTotalNumber(Integer recovered, Integer deaths, Integer confirmed, String lastChecked, String lastReported, String location){
        super( recovered, deaths, confirmed);
        this.lastChecked=lastChecked;
        this.lastReported=lastReported;
        this.location=location;
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
