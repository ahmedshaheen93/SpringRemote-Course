
package com.shaheen.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.shaheen.service package. 
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

    private final static QName _User_QNAME = new QName("http://service.shaheen.com", "user");
    private final static QName _GetNetSalary_QNAME = new QName("http://service.shaheen.com", "getNetSalary");
    private final static QName _GetNetSalaryResponse_QNAME = new QName("http://service.shaheen.com", "getNetSalaryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.shaheen.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNetSalaryResponse }
     * 
     */
    public GetNetSalaryResponse createGetNetSalaryResponse() {
        return new GetNetSalaryResponse();
    }

    /**
     * Create an instance of {@link GetNetSalary }
     * 
     */
    public GetNetSalary createGetNetSalary() {
        return new GetNetSalary();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.shaheen.com", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.shaheen.com", name = "getNetSalary")
    public JAXBElement<GetNetSalary> createGetNetSalary(GetNetSalary value) {
        return new JAXBElement<GetNetSalary>(_GetNetSalary_QNAME, GetNetSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNetSalaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.shaheen.com", name = "getNetSalaryResponse")
    public JAXBElement<GetNetSalaryResponse> createGetNetSalaryResponse(GetNetSalaryResponse value) {
        return new JAXBElement<GetNetSalaryResponse>(_GetNetSalaryResponse_QNAME, GetNetSalaryResponse.class, null, value);
    }

}
