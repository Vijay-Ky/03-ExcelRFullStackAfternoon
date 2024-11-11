import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

function Car()
{
       return <h2> Hello, I am a Car!</h2>
}
function Bike()
{
       return <h2> Hello, I am a Bike!</h2>
}
function Rat()
{
       return <h2> Hello, I am a Rat!</h2>
}
function Garage()
{
       return(
              <>
              <h1>Who lives in my Garage</h1>
              <Car/>
              <Bike/>
              <Rat/>
              </>
       );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Garage/>);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
