import React from 'react';
import { Table } from 'react-bootstrap';

const MyTable = () => {
    const columns = ["Country","Num Deaths","Num Infected","Num cured"];
    
    return (
        <Table striped bordered hover variant="dark">
            <thead>
                <tr>
                    { columns.map( column =>{
                        console.log(column);
                        return <th key={column}> { column } </th>;

                    })}
                </tr>
            </thead>
            <tbody>
                
            </tbody>
        </Table>
    )
}

export default MyTable;
