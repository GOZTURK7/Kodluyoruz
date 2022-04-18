
let formDOM = document.querySelector("#userForm");

formDOM.addEventListener("submit", formSubmit)

function formSubmit(event){
    event.preventDefault(); // default işlemi englledik
    console.log("işlem gerçekleşti");
    let scoreInputDOM = document.querySelector("#score");
    console.log(scoreInputDOM.value);
    localStorage.setItem("score",scoreInputDOM.value )
}

// for (var i = 0; i < 3; i++) {
//     setTimeout(function() { alert(i); }, 1000 + i);
//   }

  (function() {
    var a = b = 5;
  })();
  
  console.log(typeof 'a');

  function LetterChanges(str) { 

    // code goes here 
    let alphabet = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"];

    let vowels = ["A", "E", "I", "O", "U",]
  
    let temp = [];    

    str = str.split("").map((v) =>{

        


        let index = alphabet.indexOf(v.toUpperCase());

        if(index === alphabet.length-1){
            index = 0;
            v = alphabet[index];

            vowels.includes(v) ? v=v.toUpperCase() : v=v.toLowerCase();

        }else if(index < 0){
            v = v;
        }else{
            v = alphabet[index+1];
            vowels.includes(v) ? v=v.toUpperCase() : v=v.toLowerCase();
        }

        console.log(index);
        str="";
        temp+=v;
        // console.log(temp);
        

    })

    console.log(temp);
    str = temp
    
  
    
  
    return str; 
  
  }



//  console.log(LetterChanges("fun times!")); 


function LetterCapitalize(str) { 

  // code goes here 

  let temp = str;

  console.log(str[0]);

  temp = temp.split(" ");

  let temp1 = temp.map(value => {
     value = value[0].toUpperCase() + value.substring(1);
     return value;
     
  });



  temp1 = temp1.join(" ");

  str = temp1;



  return str; 

};

console.log(LetterCapitalize("hello world"));
