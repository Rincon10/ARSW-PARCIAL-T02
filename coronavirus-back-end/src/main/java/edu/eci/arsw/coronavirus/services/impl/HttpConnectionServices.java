package edu.eci.arsw.coronavirus.services.impl;

import org.json.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.services.IHttpConnectionServices;
import com.mashape.unirest.http.Unirest;
import org.springframework.stereotype.Service;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 *
 * DOCUMENTATION: https://rapidapi.com/KishCom/api/covid-19-coronavirus-statistics
 */
@Service
public class HttpConnectionServices implements IHttpConnectionServices {
    private final String HOST = "covid-19-coronavirus-statistics.p.rapidapi.com";
    private final String KEY = "4f04707326msh95e7ff3629c20d0p119c81jsn52a936c0ca0a";
    private final String URL = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/total";

    public HttpConnectionServices(){

    }

    private HttpResponse<String> petition( String url ) throws UnirestException{
            return Unirest.get( url )
                    .header("x-rapidapi-host", HOST)
                    .header("x-rapidapi-key", KEY)
                    .asString();
    }

    @Override
    public JSONObject getCasesByCountry(String country) throws UnirestException {
        HttpResponse<String> response = petition( URL+"?country="+country );
        JSONObject jsonpObject = new JSONObject(response.getBody());
        return jsonpObject;
    }

    @Override
    public JSONObject getAllCases() throws UnirestException {
        HttpResponse<String> response = petition( URL );
        JSONObject jsonpObject = new JSONObject(response.getBody());
        return jsonpObject;
    }
}
