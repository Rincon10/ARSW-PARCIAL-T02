package edu.eci.arsw.coronavirus.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.model.CovidCase;
import edu.eci.arsw.coronavirus.services.ICoronavirusService;
import edu.eci.arsw.coronavirus.services.IHttpConnectionServices;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Clase que se encargara de realizar los servicios de coronavirus
 */
@Service
public class CoronavirusService implements ICoronavirusService {
    @Autowired
    IHttpConnectionServices http;

    @Override
    public List<CovidCase> getAllCases() {
        return null;
    }

    @Override
    public CovidCase getCasesByCountry(String countryName) throws UnirestException {
        JSONObject data = http.getCasesByCountry(countryName);
        CovidCase covidCase = new CovidCase();


//
//        for (String attribute : attributes) {
//            data.
//        }
//        data.get()
        return null;
    }
}
