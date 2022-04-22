

import slugify from "slugify";

import hello, {topla, cikar, text, user, users} from "./my-module.js";


const title = slugify('some string gökhan lorem öztürk',"!" )

console.log(title);

console.log(topla(2, 4));
console.log(cikar(2, 4));
console.log(text);
console.log(user);
console.log(users);



hello("mehmet");