package com.crossfit.youtube;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-21T19:58:41.237+01:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://crossfit.com/youtube/", name = "youtube")
@XmlSeeAlso({ObjectFactory.class})
public interface Youtube {

    @WebMethod(operationName = "ChangeVideo", action = "http://crossfit.com/youtube/ChangeVideo")
    @RequestWrapper(localName = "ChangeVideo", targetNamespace = "http://crossfit.com/youtube/", className = "com.crossfit.youtube.ChangeVideo")
    @ResponseWrapper(localName = "ChangeVideoResponse", targetNamespace = "http://crossfit.com/youtube/", className = "com.crossfit.youtube.ChangeVideoResponse")
    @WebResult(name = "video_id", targetNamespace = "")
    public java.lang.String changeVideo(
        @WebParam(name = "url", targetNamespace = "")
        java.lang.String url
    );
}
