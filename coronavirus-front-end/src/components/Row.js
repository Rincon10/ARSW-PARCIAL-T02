import React from 'react';

const Row = ( { country } ) => {
    const { location, deaths, confirmed , province } = country;
    const valTd = ( province === undefined )? location: province;
    
    return (
        <tr>
            <td>{valTd}</td>
            <td>{deaths}</td>
            <td>{confirmed}</td>
            <td>{confirmed -  deaths }</td>
        </tr>
    )
}

export default Row;
