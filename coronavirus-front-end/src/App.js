import React, { useEffect, useState } from 'react'
import MyTable from './components/Table'
import 'bootstrap/dist/css/bootstrap.min.css';
import { covidStatsApiClient } from './services/covidStatsApiClient';
import '../src/assets/css/App.css'

const App = () => {

    const [country, setCountry] = useState("");
    const [countries, setCountries] = useState([]);
    
    useEffect(() => {
        covidStatsApiClient.getAllCases().
            then( response=> {
                setCountries(response);
            });
        
    }, [countries]);

    const handleChange = ( event ) =>{
        const { value } = event.target;
        setCountry( value ); 
        
    }
    return (
        <div>
            <div className="container-h1">
                <center><h1> COVID-19 CORONAVIRUS ARSW </h1></center>
            </div>
            <div className="container">
                <MyTable 
                    columns={["Country","Num Deaths","Num Infected","Num cured"]}
                    countries={countries}
                    />
                <input
                    id="countryInput" 
                    className="div-input"
                    onChange={handleChange} 
                    value={country}
                    placeholder="Ingrese el pais a filtrar"></input>
            </div>
        </div>
    )
}

export default App
