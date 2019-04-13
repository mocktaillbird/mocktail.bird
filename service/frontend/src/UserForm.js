import React, { Component } from 'react';
import TextBox from './TextBox.js';

class UserForm extends Component {

     constructor(props) {
        super(props);
         this.state = {
                bodycontent: this.props.content
            };

        // This binding is necessary to make `this` work in the callback
        this.jsonValidate = this.jsonValidate.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    jsonValidate(event) {
      alert(this.state.bodycontent);
    }

    handleSubmit(event){

        event.preventDefault();
    }
    
    
    prettyPrint() {
        var ugly = document.getElementById('myTextArea').value;
        var obj = JSON.parse(ugly);
        var pretty = JSON.stringify(obj, undefined, 4);
        document.getElementById('myTextArea').value = pretty;
    }

    render() {
       return (
             <form className="form-horizontal" onSubmit={this.handleSubmit}>

                    <label htmlFor="statuscode" className="col-sm-2 control-label">Status Code</label>
                    <div className="col-sm-4">
                        <select id="statuscodelist" className="form-control">
                            <option>200 OK</option>
                        </select>
                    </div>

                    <label htmlFor="contentType" className="col-sm-2 control-label">Content Type</label>
                    <div className="col-sm-4">
                        <select id="contentTypelist" className="form-control">
                            <option>application/json</option>
                        </select>
                         <select id="encoding" className="form-control">
                            <option>UTF8</option>
                        </select>
                    </div>
                    <TextBox/>
               
                <div className="form-group">
                    <div className="col-sm-offset-2 col-sm-10">
                        <button type="submit" className="btn btn-info">Mock</button>
                
                        <button type="button" onClick={this.jsonValidate} className="btn btn-info">Validate</button>
                    </div>
                </div>

            </form>        
       );
    }

}

export default UserForm;