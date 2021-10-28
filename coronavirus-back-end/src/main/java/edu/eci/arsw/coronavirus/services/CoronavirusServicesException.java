package edu.eci.arsw.coronavirus.services;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 */
public class CoronavirusServicesException extends Exception{
    public CoronavirusServicesException(String message) {
        super(message);
    }

    public CoronavirusServicesException(String message, Throwable cause) {
        super(message, cause);
    }
}
