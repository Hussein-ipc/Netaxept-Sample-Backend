package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import epayment.bbs.INetaxept;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-10-28T07:54:44.835Z
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "Netaxept", 
                  wsdlLocation = "https://test.epayment.nets.eu/netaxept.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class Netaxept extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Netaxept");
    public final static QName Endpoint = new QName("http://tempuri.org/", "Endpoint");
    static {
        URL url = null;
        try {
            url = new URL("https://test.epayment.nets.eu/netaxept.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Netaxept.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://test.epayment.nets.eu/netaxept.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Netaxept(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Netaxept(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Netaxept() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Netaxept(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Netaxept(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Netaxept(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns INetaxept
     */
    @WebEndpoint(name = "Endpoint")
    public INetaxept getEndpoint() {
        return super.getPort(Endpoint, INetaxept.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns INetaxept
     */
    @WebEndpoint(name = "Endpoint")
    public INetaxept getEndpoint(WebServiceFeature... features) {
        return super.getPort(Endpoint, INetaxept.class, features);
    }

}