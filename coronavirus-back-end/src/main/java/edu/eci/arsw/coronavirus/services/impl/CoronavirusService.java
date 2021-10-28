package edu.eci.arsw.coronavirus.services.impl;

import edu.eci.arsw.coronavirus.model.CovidCase;
import edu.eci.arsw.coronavirus.services.ICoronavirusService;

import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Clase que se encargara de realizar los servicios de coronavirus
 */
public class CoronavirusService implements ICoronavirusService {

    @Override
    public List<CovidCase> getAllCases() {
        return null;
    }

    @Override
    public List<CovidCase> getCasesByCountry(String countryName) {
        return null;
    }
}
