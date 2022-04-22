import logo from './logo.svg';
import Header from './components/Headers'
import './App.css';
import React from 'react';
import User from './components/User';

function App() {
  const name ="Gökhan";
  const surname ="Öztürk";
  const isLoggedIn = true;


  // return React.createElement('div', null, "hello")

  return (
    <div>
      <User 
      // name="Gökhan"
      surname='Öztürk' 
      isLoggedIn={isLoggedIn} 
      age={33}
      friends={ ["Ahmet", "Tayfun", "Gökhan", "Ayşe", "Fatma"]}
      address={{
        title: 'Ataşehir/Istanbul',
        zip:34755
      }}/>
  

    </div>
  );
}


export default App;
