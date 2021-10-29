import Pagination from "react-bootstrap/Pagination";
import React, { useState } from 'react'

const MyPagination = ( { regionsPerPage, totalRegions, paginate }) => {
    const items  = [];
    const [active, setActive] = useState(1);
    
    const handleClick = ( event )=>{
        const { value } = event.target;
        setActive(active);
        paginate(value);

    }

    for (let index = 1; index <= Math.ceil(totalRegions/regionsPerPage); index++) {
        items .push(
                <Pagination.Item 
                    key={index} 
                    active={index === active}
                    onClick={handleClick}
                    > {index}
                </Pagination.Item>
        );
    }

    return (
        <Pagination>
            {items}
        </Pagination>
    )
}

export default MyPagination
