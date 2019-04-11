import React from 'react';
import Clock from './Clock.js';


function Header() {
    return (
        <div  id= "header" className="row">
            <div className="col-md-10"><h1> <b>Mocktail.Bird</b> </h1></div>
            <div id="time" className="col-md-2"> <Clock/> </div>
        </div>
    );
}

export default Header;