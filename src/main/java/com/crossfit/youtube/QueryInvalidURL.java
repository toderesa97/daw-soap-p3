
package com.crossfit.youtube;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-22T16:29:47.549+01:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "invalidURL", targetNamespace = "http://crossfit.com/youtube/")
public class QueryInvalidURL extends Exception {
    
    private java.lang.String invalidURL;

    public QueryInvalidURL() {
        super();
    }
    
    public QueryInvalidURL(String message) {
        super(message);
    }
    
    public QueryInvalidURL(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryInvalidURL(String message, java.lang.String invalidURL) {
        super(message);
        this.invalidURL = invalidURL;
    }

    public QueryInvalidURL(String message, java.lang.String invalidURL, Throwable cause) {
        super(message, cause);
        this.invalidURL = invalidURL;
    }

    public java.lang.String getFaultInfo() {
        return this.invalidURL;
    }
}
