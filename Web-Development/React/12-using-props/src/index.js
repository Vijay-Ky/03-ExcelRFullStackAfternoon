import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Mahindra from './Mahindra';
import reportWebVitals from './reportWebVitals';

function Car(props)
{
       return <h2> Hello, I am a {props.color} and {props.model} model Car!</h2>
}

const root = ReactDOM.createRoot(document.getElementById('vijay'));
root.render(<Mahindra model="xuv300" color="white"/>);

// const root = ReactDOM.createRoot(document.getElementById('vijay'));
// root.render(<h1>{(x) < 10 ? "Hello": "Goodbye"}</h1>);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
