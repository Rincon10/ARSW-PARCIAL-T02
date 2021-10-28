package edu.eci.arsw.coronavirus.services.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.model.CovidStatistic;
import edu.eci.arsw.coronavirus.services.ICoronavirusService;
import edu.eci.arsw.coronavirus.services.IHttpConnectionServices;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Clase que se encargara de realizar los servicios de coronavirus
 *
 * Ejemplo de pasar un JSONObject a Object y con respuesta del Api asi
 *
 * API Response:
 *
 *        {
 *        "coord": {
 *        "lon": -122.08,
 *        "lat": 37.39
 *        },
 *        "weather": [
 *        {
 *        "id": 800,
 *        "main": "Clear",
 *        "description": "clear sky",
 *        "icon": "01d"
 *        }
 *        ],
 *        "base": "stations",
 *        "main": {
 *        "temp": 282.55,
 *        "feels_like": 281.86,
 *        "temp_min": 280.37,
 *        "temp_max": 284.26,
 *        "pressure": 1023,
 *        "humidity": 100
 *        },
 *        "visibility": 16093,
 *        "wind": {
 *        "speed": 1.5,
 *        "deg": 350
 *        },
 *        "clouds": {
 *        "all": 1
 *        },
 * JAVA:
 *         JSONObject jsonObject = rta.getJSONObject("coord");
 *         ObjectMapper mapper = new ObjectMapper();
 *         Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);
 *
 *         jsonObject = rta.getJSONArray("weather").getJSONObject(0);
 *         Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);
 */
@Service
public class CoronavirusService implements ICoronavirusService {
    private final String[] KEYS = {"recovered","deaths","confirmed","lastChecked","lastReported","location"};



    @Autowired
    IHttpConnectionServices http;

    private CovidStatistic createStatistic(JSONObject data ){
        CovidStatistic statistic = new CovidStatistic();
        for ( String key: KEYS ){
            Optional<Object> o = Optional.ofNullable(data.get( key )) ;

            switch ( key ){
                case "recovered":
                    o.orElse( new Integer(0));
                    statistic.setRecovered((Integer) o.get());
                    break;
                case "deaths":
                    o.orElse( new Integer(0));
                    statistic.setDeaths((Integer) o.get());
                    break;
                case "confirmed":
                    o.orElse( new Integer(0));
                    statistic.setConfirmed((Integer) o.get());
                    break;
                case "lastChecked":
                    o.orElse( "");
                    statistic.setLastChecked((String) o.get());
                    break;
                case "lastReported":
                    o.orElse( "");
                    statistic.setLastChecked((String) o.get());
                    break;
                case "location":
                    o.orElse( "");
                    statistic.setLocation((String) o.get());
                    break;
                default:
                    continue;
            }
        }
        System.out.println(statistic);
        return statistic;
    }

    @Override
    public List<CovidStatistic> getAllCases() throws UnirestException {
        JSONObject responseBody = http.getAllCases();
        CovidStatistic statistic = new CovidStatistic();

        System.out.println("*****************************************************************************");
        System.out.println(responseBody);
        System.out.println("*****************************************************************************");
        return null;

    }

    @Override
    public CovidStatistic getCasesByCountry(String countryName) throws UnirestException {
        JSONObject responseBody = http.getCasesByCountry(countryName);
        JSONObject data = responseBody.getJSONObject("data");

        System.out.println("*****************************************************************************");
        System.out.println(responseBody);
        System.out.println("*****************************************************************************");
        System.out.println(data);

        return createStatistic(data);
    }
}
