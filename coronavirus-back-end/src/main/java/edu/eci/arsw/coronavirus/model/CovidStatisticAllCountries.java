package edu.eci.arsw.coronavirus.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/29/2021
 */
public class CovidStatisticAllCountries extends CovidStatistic{
    private String city;
    private String province;
    private String country;
    private String lastUpdate;
    private String keyId;

    public CovidStatisticAllCountries(){

    }

    public CovidStatisticAllCountries(Integer recovered, Integer deaths, Integer confirmed, String city, String province, String country, String lastUpdate, String keyId ){
        super( recovered, deaths, confirmed);
        this.city = city;
        this.province=province;
        this.country=country;
        this.lastUpdate=lastUpdate;
        this.keyId=keyId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
}
