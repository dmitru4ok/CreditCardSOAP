
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
 *         &lt;element name="GetRealTimeCrossRateResult" type="{http://www.xignite.com/services/}CrossRate" minOccurs="0"/&gt;
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
    "getRealTimeCrossRateResult"
})
@XmlRootElement(name = "GetRealTimeCrossRateResponse")
public class GetRealTimeCrossRateResponse {

    @XmlElement(name = "GetRealTimeCrossRateResult")
    protected CrossRate getRealTimeCrossRateResult;

    /**
     * Gets the value of the getRealTimeCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRate }
     *     
     */
    public CrossRate getGetRealTimeCrossRateResult() {
        return getRealTimeCrossRateResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRate }
     *     
     */
    public void setGetRealTimeCrossRateResult(CrossRate value) {
        this.getRealTimeCrossRateResult = value;
    }

}
