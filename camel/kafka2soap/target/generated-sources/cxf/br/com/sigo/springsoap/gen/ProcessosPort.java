package br.com.sigo.springsoap.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-06-18T19:29:20.248-03:00
 * Generated source version: 3.4.2
 *
 */
@WebService(targetNamespace = "http://www.sigo.com.br/springsoap/gen", name = "ProcessosPort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProcessosPort {

    @WebMethod
    @WebResult(name = "consultarProcessoResponse", targetNamespace = "http://www.sigo.com.br/springsoap/gen", partName = "consultarProcessoResponse")
    public ConsultarProcessoResponse consultarProcesso(

        @WebParam(partName = "consultarProcessoRequest", name = "consultarProcessoRequest", targetNamespace = "http://www.sigo.com.br/springsoap/gen")
        ConsultarProcessoRequest consultarProcessoRequest
    );

    @WebMethod
    @WebResult(name = "agendarProcessoResponse", targetNamespace = "http://www.sigo.com.br/springsoap/gen", partName = "agendarProcessoResponse")
    public AgendarProcessoResponse agendarProcesso(

        @WebParam(partName = "agendarProcessoRequest", name = "agendarProcessoRequest", targetNamespace = "http://www.sigo.com.br/springsoap/gen")
        AgendarProcessoRequest agendarProcessoRequest
    );
}
