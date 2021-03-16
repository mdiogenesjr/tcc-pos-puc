
package br.com.sigo.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de anonymous complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="idEtapa" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idProcesso",
    "idEtapa"
})
@XmlRootElement(name = "getProcessoRequest")
public class GetProcessoRequest {

    @XmlElement(required = true)
    protected String idProcesso;
    @XmlElement(required = true)
    protected String idEtapa;

    /**
     * Obtém o valor da propriedade idProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProcesso() {
        return idProcesso;
    }

    /**
     * Define o valor da propriedade idProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProcesso(String value) {
        this.idProcesso = value;
    }

    /**
     * Obtém o valor da propriedade idEtapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEtapa() {
        return idEtapa;
    }

    /**
     * Define o valor da propriedade idEtapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEtapa(String value) {
        this.idEtapa = value;
    }

}
