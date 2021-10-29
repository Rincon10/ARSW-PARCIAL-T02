import React from 'react';

const Row = ( { country } ) => {
    const { location, deaths, confirmed, recovered } = country;
    
    return (
        <tr>
            <td>{location}</td>
            <td>{deaths}</td>
            <td>{confirmed}</td>
            <td>{recovered}</td>
        </tr>
    )
}

export default Row;
