import React, { Component } from 'react';
import './App.css';
import Header from './Header.js';
import Body from './Body.js';
import Footer from './Footer.js';


class App extends Component {
  render() {
    return (
      <div className="App">
	      <Header/>
	      <Body/>
	      <Footer/>
      </div>
    );
  }

}

export default App;
