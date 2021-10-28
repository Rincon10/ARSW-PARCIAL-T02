package edu.eci.arsw.coronavirus.services.impl;

import org.json.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.services.IHttpConnectionServices;
import com.mashape.unirest.http.Unirest;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public class HttpConnectionServices implements IHttpConnectionServices {
    private final String URL = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats";
    private final String APIid= "4f04707326msh95e7ff3629c20d0p119c81jsn52a936c0ca0a";

    public HttpConnectionServices(){

    }

    @Override
    public JSONObject getCasesByCountry(String country) throws UnirestException {
        HttpResponse<String> response = Unirest.get( URL+"?country="+country+"&appid="+APIid ).asString();

        JSONObject jsonpObject = new JSONObject(response.getBody());
        return jsonpObject;
    }

    @Override
    public JSONObject getAllCases() throws UnirestException {
        HttpResponse<String> response = Unirest.get( URL+"?appid="+APIid ).asString();
        JSONObject jsonpObject = new JSONObject(response.getBody());
        return jsonpObject;
    }
}
