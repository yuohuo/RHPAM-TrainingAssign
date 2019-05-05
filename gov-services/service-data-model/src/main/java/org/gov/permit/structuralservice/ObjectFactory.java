
package org.gov.permit.structuralservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.gov.permit.structuralservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.gov.permit.structuralservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PermitRequest }
     * 
     */
    public PermitRequest createPermitRequest() {
        return new PermitRequest();
    }

    /**
     * Create an instance of {@link PermitStatusResponse }
     * 
     */
    public PermitStatusResponse createPermitStatusResponse() {
        return new PermitStatusResponse();
    }

    /**
     * Create an instance of {@link PermitRecindResponse }
     * 
     */
    public PermitRecindResponse createPermitRecindResponse() {
        return new PermitRecindResponse();
    }

    /**
     * Create an instance of {@link PermitRequestResponse }
     * 
     */
    public PermitRequestResponse createPermitRequestResponse() {
        return new PermitRequestResponse();
    }

    /**
     * Create an instance of {@link PermitStatusRequest }
     * 
     */
    public PermitStatusRequest createPermitStatusRequest() {
        return new PermitStatusRequest();
    }

    /**
     * Create an instance of {@link PermitRecindRequest }
     * 
     */
    public PermitRecindRequest createPermitRecindRequest() {
        return new PermitRecindRequest();
    }

}
