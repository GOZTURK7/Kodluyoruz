fetch("data/settings.json")
.then(response => {
    return response.json()
})
.then(responseJson => {
    console.log(responseJson);
    console.log(responseJson.userName);
})