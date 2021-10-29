import React from 'react';

const Row = ( { country } ) => {
    const { location, deaths, confirmed } = country;
    
    return (
        <tr>
            <td>{location}</td>
            <td>{deaths}</td>
            <td>{confirmed}</td>
            <td>{confirmed -  deaths }</td>
        </tr>
    )
}

export default Row;
