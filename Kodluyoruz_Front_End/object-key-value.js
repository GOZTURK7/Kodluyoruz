

let laptop1 = {
    brand: "Apple",
    model: "Macbook Pro",
    "2kg": 2,
    modelName:"Makbook Bro"
};

console.log(laptop1);

console.log(laptop1.brand, laptop1["brand"]);
console.log(laptop1.model, laptop1["model"]);
console.log(laptop1["2kg"]);


laptop1.brand = "mac";
laptop1["brand"] = "Mac1"
console.log(laptop1);


laptop1.version = "10.15.7";
console.log(laptop1);


keys = Object.keys(laptop1);
console.log(keys);
console.log(Object.keys(laptop1));


keys.forEach(keyInfo => {
    console.log(keyInfo);
    console.log(laptop1[keyInfo]);
});


let values = Object.values(laptop1);
console.log(values);

console.log(Object.values(laptop1));

values.forEach(value=>{
    console.log(value);
});


let user1 = {
    firstName : "Bilgin",
    isActive : false,
    lastName : "Uzman",
    score:[1, 2, 3, 4],
    shortName: function(){return `${this.firstName[0].toUpperCase()}. ${this.lastName}`}
}

console.log(user1);


function Insan(isim, yas, boy, kilo){
    this.isim = isim;
    this.yas = yas;
    this.boy= boy;
    this.kilo = kilo;
};

let gokhan = new Insan("Gökhan", 33, 183, 85);
console.log(gokhan);

Insan.prototype.yeniFonk = ()=>{
    console.log("Merhaba yeniFonk");
}

gokhan.yeniFonk();
console.log(gokhan);

let settings = {
    userName: "LoremIpsum",
    password: "BadPassword",
    isActive: false,
    ip: "127.0.0.1",
    serverName:"kodluyoruz.org"
}

// let userName = settings.userName;
// console.log(userName);


//  rename && destructering !!!!!!!!!!!!!
let {userName: user, password, isActive, ip:serverIp, serverName} = settings;

console.log(user, password, isActive, serverIp, serverName);


let {userName:userName2, password:password2, isactive:isActive2, ...newSettings} =settings;  







