
package org.example.youtubeservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-05-20T23:52:01.465+01:00
 * Generated source version: 2.7.18
 * 
 */
public final class YoutubeService_YoutubeServiceSOAP_Client {

    private static final QName SERVICE_NAME = new QName("http://www.example.org/youtubeService/", "youtubeService");

    private YoutubeService_YoutubeServiceSOAP_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = YoutubeService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        YoutubeService_Service ss = new YoutubeService_Service(wsdlURL, SERVICE_NAME);
        YoutubeService port = ss.getYoutubeServiceSOAP();  
        
        {
        System.out.println("Invoking changeYoutubeVideo...");
        java.lang.String _changeYoutubeVideo_in = "";
        javax.xml.ws.Holder<java.lang.String> _changeYoutubeVideo_url = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<java.lang.String> _changeYoutubeVideo_videoId = new javax.xml.ws.Holder<java.lang.String>();
        port.changeYoutubeVideo(_changeYoutubeVideo_in, _changeYoutubeVideo_url, _changeYoutubeVideo_videoId);

        System.out.println("changeYoutubeVideo._changeYoutubeVideo_url=" + _changeYoutubeVideo_url.value);
        System.out.println("changeYoutubeVideo._changeYoutubeVideo_videoId=" + _changeYoutubeVideo_videoId.value);

        }

        System.exit(0);
    }

}
