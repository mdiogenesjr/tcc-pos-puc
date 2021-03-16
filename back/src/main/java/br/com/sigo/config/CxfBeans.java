package br.com.sigo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfBeans {
	
	@Value("${endpoint.wsdl}")
	private String SOAP_URL;
	
	
	/*@Bean(name = "cxfProcesso")
	public CxfEndpoint buildCxfEndpoint() {
		CxfEndpoint cxf = new CxfEndpoint();
		cxf.setAddress(SOAP_URL);
		cxf.setServiceClass(ProcessosPort.class);
		return cxf;
	}*/
}
