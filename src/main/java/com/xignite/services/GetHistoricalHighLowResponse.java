
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
 *         &lt;element name="GetHistoricalHighLowResult" type="{http://www.xignite.com/services/}HighLowTick" minOccurs="0"/&gt;
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
    "getHistoricalHighLowResult"
})
@XmlRootElement(name = "GetHistoricalHighLowResponse")
public class GetHistoricalHighLowResponse {

    @XmlElement(name = "GetHistoricalHighLowResult")
    protected HighLowTick getHistoricalHighLowResult;

    /**
     * Gets the value of the getHistoricalHighLowResult property.
     * 
     * @return
     *     possible object is
     *     {@link HighLowTick }
     *     
     */
    public HighLowTick getGetHistoricalHighLowResult() {
        return getHistoricalHighLowResult;
    }

    /**
     * Sets the value of the getHistoricalHighLowResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLowTick }
     *     
     */
    public void setGetHistoricalHighLowResult(HighLowTick value) {
        this.getHistoricalHighLowResult = value;
    }

}
