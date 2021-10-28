package edu.eci.arsw.coronavirus.controllers;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Clase que se encargara de manejar las peticions Http que realize el front
 */

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.coronavirus.services.CoronavirusServicesException;
import edu.eci.arsw.coronavirus.services.ICoronavirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/Coronavirus/")
@CrossOrigin( origins = "*" )
public class CoronavirusStatsController {
    @Autowired
    private ICoronavirusService service;

    //Get petition's

    @RequestMapping( path="/cases" , method = RequestMethod.GET )
    public ResponseEntity<?> getAllCases() {
        try {
            return new ResponseEntity<>(service.getAllCases(), HttpStatus.CREATED);
        } catch (CoronavirusServicesException ex) {
            Logger.getLogger(CoronavirusStatsController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping( path="/cases/{country}" , method = RequestMethod.GET )
    public ResponseEntity<?> getCasesByCountry(@PathVariable String country) {
        try {
            return new ResponseEntity<>(service.getCasesByCountry(country), HttpStatus.CREATED);
        } catch (CoronavirusServicesException ex) {
            Logger.getLogger(CoronavirusStatsController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } catch (UnirestException e) {
            e.printStackTrace();
            Logger.getLogger(CoronavirusStatsController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        }
    }

}
