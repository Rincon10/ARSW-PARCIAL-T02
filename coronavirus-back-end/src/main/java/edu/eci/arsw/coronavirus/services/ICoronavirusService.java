package edu.eci.arsw.coronavirus.services;

import edu.eci.arsw.coronavirus.model.CovidCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public interface ICoronavirusService {
    List<CovidCase> getAllCases() throws CoronavirusServicesException;

    List<CovidCase> getCasesByCountry( String countryName ) throws CoronavirusServicesException;


}
