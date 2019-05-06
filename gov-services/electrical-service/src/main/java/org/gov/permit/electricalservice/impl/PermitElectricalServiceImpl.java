package org.gov.permit.electricalservice.impl;

import java.util.Random;

import javax.jws.WebService;

import org.gov.permit.electricalservice.PermitElectricalServiceInterface;
import org.gov.permit.electricalservice.PermitRecindRequest;
import org.gov.permit.electricalservice.PermitRecindResponse;
import org.gov.permit.electricalservice.PermitRequest;
import org.gov.permit.electricalservice.PermitRequestResponse;
import org.gov.permit.electricalservice.PermitStatusRequest;
import org.gov.permit.electricalservice.PermitStatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(serviceName = "PermitElectricalService", 
            endpointInterface = "org.gov.permit.electricalservice.PermitElectricalServiceInterface", 
            targetNamespace = "urn:permit.gov.org:electricalservice")
public class PermitElectricalServiceImpl implements PermitElectricalServiceInterface {
    
    public static final IdGenerator generator = new IdGenerator();
    
    public static final Logger log = LoggerFactory.getLogger("PermitEelectricalService");
    
    public String m_BadId = "";

	@Override
	public PermitRequestResponse submitPermitRequest(PermitRequest parameters) {
		
		System.out.println("Submit Electrical Permit Request: "+parameters.getName());
		PermitRequestResponse response = new PermitRequestResponse();
		response.setId(new IdGenerator().nextId());
		if ("Jason".equals(parameters.getName()))
		{
			m_BadId = response.getId();
		}
		
		System.out.println("Submit Electrical Permit Request id: "+response.getId() + " badId:" + m_BadId);
		response.setStatus("ACCEPTED");
		return response;
	}

	@Override
	public PermitStatusResponse getPermitRequestStatus(PermitStatusRequest parameters) {
		String id = parameters.getId();
		
		PermitStatusResponse response = new PermitStatusResponse();
		response.setId(id);
		System.out.println("Get Electrical Permit Status: "+id + " badId:" + m_BadId);
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
