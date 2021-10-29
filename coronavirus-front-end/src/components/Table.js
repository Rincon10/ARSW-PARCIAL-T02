import React from 'react';
import Table from 'react-bootstrap/Table';
import Row from './Row';

const MyTable = ( {columns, countries } ) => {
    
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
                    countries.map( country =>  {
                        const { location } = country;
                        return <Row key={location} country={country} />
                    })
                }
            </tbody>
        </Table>
    )
}

export default MyTable;
