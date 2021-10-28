package edu.eci.arsw.coronavirus.services;

import edu.eci.arsw.coronavirus.model.CovidCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public interface ICoronavirusService {
    //Get petition

    List<CovidCase> getAllCases();

    List<CovidCase> getCasesByCountry( String countryName );


}
