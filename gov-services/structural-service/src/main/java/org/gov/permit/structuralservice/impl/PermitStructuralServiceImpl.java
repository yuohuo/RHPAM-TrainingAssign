package org.gov.permit.structuralservice.impl;

import java.util.Random;

import javax.jws.WebService;

import org.gov.permit.structuralservice.PermitRecindRequest;
import org.gov.permit.structuralservice.PermitRecindResponse;
import org.gov.permit.structuralservice.PermitRequest;
import org.gov.permit.structuralservice.PermitRequestResponse;
import org.gov.permit.structuralservice.PermitStatusRequest;
import org.gov.permit.structuralservice.PermitStatusResponse;
import org.gov.permit.structuralservice.PermitStructuralServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(serviceName = "PermitStructuralService", 
            endpointInterface = "org.gov.permit.structuralservice.PermitStructuralServiceInterface", 
            targetNamespace = "urn:permit.gov.org:structuralservice")
public class PermitStructuralServiceImpl implements PermitStructuralServiceInterface {
    
    public static final IdGenerator generator = new IdGenerator();
    
    public static final Logger log = LoggerFactory.getLogger("PermitStructuralService");
    
    public String m_BadId = "";

	@Override
	public PermitRequestResponse submitPermitRequest(PermitRequest parameters) {
		System.out.println("Submit Structural Permit Request: "+parameters.getName());
		PermitRequestResponse response = new PermitRequestResponse();
		response.setId(new IdGenerator().nextId());
		if ("Diego".equals(parameters.getName()))
		{
			m_BadId = response.getId();
		}
		System.out.println("Submit Structural Permit Request id: "+response.getId() + " badId:" + m_BadId);
		response.setStatus("ACCEPTED");
		return response;
	}

	@Override
	public PermitStatusResponse getPermitRequestStatus(PermitStatusRequest parameters) {
		String id = parameters.getId();
		
		PermitStatusResponse response = new PermitStatusResponse();
		response.setId(id);
		System.out.println("Get Structural Permit Status: "+id + " badId:" + m_BadId);
		if (m_BadId.equals(id))
		{
			response.setStatus("RECIND");
		}
		else
		{
			response.setStatus(new Random().nextInt(5) == 1 ? "APPROVED" : "PROCESSING");
		}
		return response;
	}

	@Override
	public PermitRecindResponse rescindPermit(PermitRecindRequest parameters) {
		PermitRecindResponse response = new PermitRecindResponse();
		response.setId(parameters.getId());
		response.setStatus("RECIND");
		return response;
	}

   

}
