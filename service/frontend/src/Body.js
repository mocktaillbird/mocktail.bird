import React, { Component } from 'react';
import UserForm from './UserForm';

class Body extends Component {
  render() {
    return (
     
	      <div id= "body">
             <pre>
                <p className="lead"> <small>Single place to mock Http API's, JSON Compare, Validator & Formatter.</small></p>
            </pre><br/>
            <h4 className="lead"><b>Mock/Json:</b></h4><hr/>
            <UserForm/>      
	      </div>
    );
  }

}

export default Body;