//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.04.04 às 06:49:10 PM BRT 
//


package br.com.sigo.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idEtapa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idProcesso",
    "idEtapa"
})
@XmlRootElement(name = "agendarProcessoRequest")
public class AgendarProcessoRequest {

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
