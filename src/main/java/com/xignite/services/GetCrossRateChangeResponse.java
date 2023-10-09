
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCrossRateChangeResult" type="{http://www.xignite.com/services/}CrossRateChange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCrossRateChangeResult"
})
@XmlRootElement(name = "GetCrossRateChangeResponse")
public class GetCrossRateChangeResponse {

    @XmlElement(name = "GetCrossRateChangeResult")
    protected CrossRateChange getCrossRateChangeResult;

    /**
     * Gets the value of the getCrossRateChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRateChange }
     *     
     */
    public CrossRateChange getGetCrossRateChangeResult() {
        return getCrossRateChangeResult;
    }

    /**
     * Sets the value of the getCrossRateChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRateChange }
     *     
     */
    public void setGetCrossRateChangeResult(CrossRateChange value) {
        this.getCrossRateChangeResult = value;
    }

}
