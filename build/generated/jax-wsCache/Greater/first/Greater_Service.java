
package first;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Greater", targetNamespace = "http://First/", wsdlLocation = "http://localhost:21478/SoapWebService/Greater?WSDL")
public class Greater_Service
    extends Service
{

    private final static URL GREATER_WSDL_LOCATION;
    private final static WebServiceException GREATER_EXCEPTION;
    private final static QName GREATER_QNAME = new QName("http://First/", "Greater");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:21478/SoapWebService/Greater?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GREATER_WSDL_LOCATION = url;
        GREATER_EXCEPTION = e;
    }

    public Greater_Service() {
        super(__getWsdlLocation(), GREATER_QNAME);
    }

    public Greater_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GREATER_QNAME, features);
    }

    public Greater_Service(URL wsdlLocation) {
        super(wsdlLocation, GREATER_QNAME);
    }

    public Greater_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GREATER_QNAME, features);
    }

    public Greater_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Greater_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Greater
     */
    @WebEndpoint(name = "GreaterPort")
    public Greater getGreaterPort() {
        return super.getPort(new QName("http://First/", "GreaterPort"), Greater.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greater
     */
    @WebEndpoint(name = "GreaterPort")
    public Greater getGreaterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://First/", "GreaterPort"), Greater.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GREATER_EXCEPTION!= null) {
            throw GREATER_EXCEPTION;
        }
        return GREATER_WSDL_LOCATION;
    }

}
