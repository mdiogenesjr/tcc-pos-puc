package br.com.sigo.springsoap.gen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-06-18T19:22:16.900-03:00
 * Generated source version: 3.4.2
 *
 */
@WebServiceClient(name = "ProcessosPortService",
                  wsdlLocation = "file:/C:/projetos/tcc-pos-puc/back/src/main/resources/wsdl/processos.wsdl",
                  targetNamespace = "http://www.sigo.com.br/springsoap/gen")
public class ProcessosPortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.sigo.com.br/springsoap/gen", "ProcessosPortService");
    public final static QName ProcessosPortSoap11 = new QName("http://www.sigo.com.br/springsoap/gen", "ProcessosPortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/projetos/tcc-pos-puc/back/src/main/resources/wsdl/processos.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProcessosPortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/projetos/tcc-pos-puc/back/src/main/resources/wsdl/processos.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProcessosPortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProcessosPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcessosPortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ProcessosPortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProcessosPortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProcessosPortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ProcessosPort
     */
    @WebEndpoint(name = "ProcessosPortSoap11")
    public ProcessosPort getProcessosPortSoap11() {
        return super.getPort(ProcessosPortSoap11, ProcessosPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProcessosPort
     */
    @WebEndpoint(name = "ProcessosPortSoap11")
    public ProcessosPort getProcessosPortSoap11(WebServiceFeature... features) {
        return super.getPort(ProcessosPortSoap11, ProcessosPort.class, features);
    }

}
