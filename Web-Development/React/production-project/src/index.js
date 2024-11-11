import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './index.css';
import Flower from './components/Flower';
import Car from './components/Car';
import Bike from './components/Bike';
import Garage from './components/Garage';
import Rat from './components/Rat';
import Confirm from './components/Confirm';
import reportWebVitals from './reportWebVitals';


export default function RoutingApp()
{
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Confirm/>}>
                    <Route index element={<Car/>}/>
                    <Route path="bike" element={<Bike/>}/>
                    <Route path="rat" element={<Rat/>}/>
                    <Route path="flower" element={<Flower/>}/>
                    <Route path="*" element={<Garage/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    )
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<RoutingApp/>);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
