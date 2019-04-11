import React, { Component } from 'react';

class Body extends Component {
  render() {
    return (
     
	      <div id= "body">
             <pre>
                <p className="lead"> <small>Single place to mock Http API's, JSON Compare, Validator & Formatter.</small></p>
            </pre><br/>
            <h4 className="lead"><b>Mock/Json:</b></h4><hr/>
            <form className="form-horizontal">
                <div className="form-group">
                    <label htmlFor="statuscode" className="col-sm-2 control-label">Status Code</label>
                    <div className="col-sm-4">
                        <select id="statuscodelist" className="form-control">
                            <option>200 OK</option>
                        </select>
                    </div>
                </div>
                <div className="form-group">
                    <div className="col-sm-offset-2 col-sm-10">
                    <button type="submit" className="btn btn-default">Sign in</button>
                    </div>
                </div>
            </form>               
	      </div>
    );
  }

}

export default Body;