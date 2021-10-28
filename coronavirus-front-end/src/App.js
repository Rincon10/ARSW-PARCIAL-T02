import React, { useState } from 'react'
import MyTable from './components/Table'

const App = () => {

    const [country, setCountry] = useState("");

    const handleChange = ( event ) =>{
        const { value } = event.target;
        setCountry( value ); 
    }
    return (
        <div>
            <div className="container-h1">
                <h1> COVID-19 CORONAVIRUS ARSW </h1>
            </div>
            <div>
                <MyTable />
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
