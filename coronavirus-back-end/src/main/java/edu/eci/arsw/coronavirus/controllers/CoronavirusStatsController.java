package edu.eci.arsw.coronavirus.controllers;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Clase que se encargara de manejar las peticions Http que realize el front
 */

import edu.eci.arsw.coronavirus.services.ICoronavirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Coronavirus/")
@CrossOrigin( origins = "*" )
public class CoronavirusStatsController {
    @Autowired
    private ICoronavirusService service;

}
