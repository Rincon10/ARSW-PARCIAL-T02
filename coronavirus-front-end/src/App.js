import React, { useEffect, useState } from 'react'
import MyTable from './components/Table'
import 'bootstrap/dist/css/bootstrap.min.css';
import { covidStatsApiClient } from './services/covidStatsApiClient';
import '../src/assets/css/App.css'

const App = () => {

    const [country, setCountry] = useState("Global");
    const [countries, setCountries] = useState([]);
    const [regions, setRegions] = useState([]);
    
    useEffect(() => {
        covidStatsApiClient.getAllCases()
            .then( response=> {
                setCountries(response);
            })
            .catch( ()=> setCountries([]));
        
    }, []);

    useEffect(() => {
        covidStatsApiClient.getStatsByCountry( country )
            .then( response => {
                setRegions( response.filter( element => element.province !== null ) );
            })
            .catch( ()=> setRegions( "Colombia" ));
    }, [country])

    const handleBlur = ( event ) =>{
        const { value } = event.target;
        if ( value !== "") setCountry( value ); 
        
    }
    return (
        <div>
            <div className="container-h1">
                <center><h1> COVID-19 CORONAVIRUS ARSW </h1></center>
            </div>
            <div className="container">
                <MyTable 
                    columns={["Country","Num Deaths","Num Infected","Num cured"]}
                    values={countries}
                    />
                <input
                    id="countryInput" 
                    className="div-input"
                    onBlur={handleBlur} 
                    placeholder="Ingrese el pais a filtrar"></input>
            </div>
            <div className="flex-container container">
                <center><h2> Pais encontrado: {country} </h2></center>
                <MyTable 
                    columns={["Region","Num Deaths","Num Infected","Num cured"]}
                    values={regions}
                    />

            </div>
        </div>
    )
}

export default App
