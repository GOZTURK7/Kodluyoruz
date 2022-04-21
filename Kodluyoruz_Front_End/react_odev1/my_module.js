import axios from "axios";

async function getData(userid){
    let {data: user} = await axios("https://jsonplaceholder.typicode.com/users/" + userid);
    let {data: post} = await axios("https://jsonplaceholder.typicode.com/posts/" + userid);

  
    // user.posts = {...post};
    // console.log(user);
    user.posts = [{...post}];
    console.log(user);
    // user.posts = post;
    // console.log(user);
    // console.log(post);

};

export default getData;