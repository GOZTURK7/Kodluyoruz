
let users;


const userInfo = (callback)  => {
    fetch("https://jsonplaceholder.typicode.com/users")
    .then(response => response.json())
    .then(data => callback(data) )
    .catch(err => console.log(err));

    console.log(users);

};

// burada methodu çağırıp içine parametre verdim
userInfo(shows => {
    console.log(shows);
    let htmlShows = "";

    // Cardların oluşturulduğu yer
    shows.forEach((item, i) => {
      //console.log(item);
      htmlShows += `

            <tr>
                <th scope="row">${i+1}</th>
                <td>${shows[i].name}</td>
                <td>${shows[i].username}</td>
                <td>${shows[i].email}</td>
                <td>${shows[i].website}</td>
            </tr>
      
            `;
    });
    document.querySelector(".table tbody").innerHTML += htmlShows;
});