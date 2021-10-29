const URL = 'https://coronavirus-back-end.herokuapp.com/';

export const covidStatsApiClient =( () =>{

    return {
        getAllCases : async () =>{
            return await fetch(`${URL}/coronavirus/cases` )
                .then(response => {
                    if (!response.ok) throw new Error('The response Failed');
                    return response.json();
                })
        },
        getCasesByCountry : async country =>{
            return await fetch(`${URL}/coronavirus/cases/${country}` )
                .then(response => {
                    if (!response.ok) throw new Error('The response Failed');
                    return response.json();
                })
        },
    }
    
})();
