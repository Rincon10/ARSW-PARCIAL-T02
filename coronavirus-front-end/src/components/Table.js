import React from 'react';
import Table from 'react-bootstrap/Table';
import Row from './Row';
import Pagination from "react-bootstrap/Pagination";

const MyTable = ( {columns, values  } ) => {

    return (
        <Table striped bordered hover variant="dark" >
            <thead>
                <tr>
                    { columns.map( column =>{
                        return <th key={column}> { column } </th>;
                    })}
                </tr>
            </thead>
            <tbody>
                {
                    values.map( country =>  {
                        const { location, keyId } = country;
                        if( keyId ) return <Row key={keyId} country={country} />;
                        else return <Row key={location} country={country} /> 
                        
                    })
                }
            </tbody>
        </Table>
    )
}

export default MyTable;
