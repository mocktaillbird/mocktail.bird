import React, { Component } from 'react';

class TextBox extends Component {

    constructor(props) {
        super(props);
            this.state = {
                value: ''
            };
         this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    render() {
        const content = this.props.value;
       return (
        <div className="form-group">
            <label htmlFor="content">Body:</label>
            <textarea className="form-control" rows="10" id="content" value={this.state.value} onChange={this.handleChange}></textarea>
        </div>
       );
    }
}

export default TextBox;