import React, { Component } from 'react';

class Footer extends Component {
  render() {
    return (
	      <div id= "foter" className="row">
              <div className="col-md-5">
                <address>
                    <strong>Contact us</strong>
                    <br/>
                    <abbr title="Email">Email:</abbr> mocktailbird@gmail.com<br/>
                    
                </address>
              </div>
              <div className="col-md-5"> 
                <br/>
                Copyright (c) 2019-present, Mocktail Bird 
                <br/>
                <a>MIT License</a>
              </div>
              <div className="col-md-2"> 
                <strong>Support</strong><br/>
                <a href="https://github.com/mocktaillbird/docs.mocktail.bird">Documentation</a><br/>
                <a href= "https://github.com/mocktaillbird/mocktail.bird"> Code Base</a><br/>
              </div>
	      </div>
    );
  }

}

export default Footer;