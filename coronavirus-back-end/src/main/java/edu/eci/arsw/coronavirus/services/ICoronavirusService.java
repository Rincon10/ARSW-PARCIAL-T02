package edu.eci.arsw.coronavirus.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.model.CovidStatistic;
import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public interface ICoronavirusService {
    List<CovidStatistic> getAllCases() throws CoronavirusServicesException, UnirestException;

    CovidStatistic getCasesByCountry( String countryName ) throws CoronavirusServicesException, UnirestException;

    List<CovidStatistic> getStatsByCountry( String countryName ) throws CoronavirusServicesException, UnirestException;

}
