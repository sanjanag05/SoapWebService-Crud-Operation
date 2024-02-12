
package first;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the first package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Greater_QNAME = new QName("http://First/", "greater");
    private final static QName _GreaterResponse_QNAME = new QName("http://First/", "greaterResponse");
    private final static QName _Hello_QNAME = new QName("http://First/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://First/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: first
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Greater_Type }
     * 
     */
    public Greater_Type createGreater_Type() {
        return new Greater_Type();
    }

    /**
     * Create an instance of {@link GreaterResponse }
     * 
     */
    public GreaterResponse createGreaterResponse() {
        return new GreaterResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Greater_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://First/", name = "greater")
    public JAXBElement<Greater_Type> createGreater(Greater_Type value) {
        return new JAXBElement<Greater_Type>(_Greater_QNAME, Greater_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreaterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://First/", name = "greaterResponse")
    public JAXBElement<GreaterResponse> createGreaterResponse(GreaterResponse value) {
        return new JAXBElement<GreaterResponse>(_GreaterResponse_QNAME, GreaterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://First/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://First/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
