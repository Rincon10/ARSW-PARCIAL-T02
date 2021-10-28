package edu.eci.arsw.coronavirus.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public interface IHttpConnectionServices {
    JSONObject getCasesByCountry(String country ) throws UnirestException;

    JSONObject getAllCases() throws UnirestException;
}
