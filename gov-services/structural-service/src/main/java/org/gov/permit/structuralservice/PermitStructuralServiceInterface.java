
package org.gov.permit.structuralservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.gov.permit.structuralservice.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PermitStructuralServiceInterface", targetNamespace = "urn:permit.gov.org:structuralservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PermitStructuralServiceInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.gov.permit.structuralservice.PermitRequestResponse
     */
    @WebMethod(action = "urn:permit.gov.org:structuralservice:submitPermitRequest")
    @WebResult(name = "PermitRequestResponse", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
    public PermitRequestResponse submitPermitRequest(
        @WebParam(name = "PermitRequest", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
        PermitRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns org.gov.permit.structuralservice.PermitStatusResponse
     */
    @WebMethod(action = "urn:permit.gov.org:structuralservice:getPermitRequestStatus")
    @WebResult(name = "PermitStatusResponse", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
    public PermitStatusResponse getPermitRequestStatus(
        @WebParam(name = "PermitStatusRequest", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
        PermitStatusRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns org.gov.permit.structuralservice.PermitRecindResponse
     */
    @WebMethod(action = "urn:permit.gov.org:structuralservice:rescindPermit")
    @WebResult(name = "PermitRecindResponse", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
    public PermitRecindResponse rescindPermit(
        @WebParam(name = "PermitRecindRequest", targetNamespace = "urn:permit.gov.org:structuralservice", partName = "parameters")
        PermitRecindRequest parameters);

}