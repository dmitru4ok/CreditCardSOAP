
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
 *         &lt;element name="GetRealTimeCrossRateTableWithBidAskResult" type="{http://www.xignite.com/services/}CrossRateTableWithBidAsk" minOccurs="0"/&gt;
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
    "getRealTimeCrossRateTableWithBidAskResult"
})
@XmlRootElement(name = "GetRealTimeCrossRateTableWithBidAskResponse")
public class GetRealTimeCrossRateTableWithBidAskResponse {

    @XmlElement(name = "GetRealTimeCrossRateTableWithBidAskResult")
    protected CrossRateTableWithBidAsk getRealTimeCrossRateTableWithBidAskResult;

    /**
     * Gets the value of the getRealTimeCrossRateTableWithBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRateTableWithBidAsk }
     *     
     */
    public CrossRateTableWithBidAsk getGetRealTimeCrossRateTableWithBidAskResult() {
        return getRealTimeCrossRateTableWithBidAskResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRateTableWithBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRateTableWithBidAsk }
     *     
     */
    public void setGetRealTimeCrossRateTableWithBidAskResult(CrossRateTableWithBidAsk value) {
        this.getRealTimeCrossRateTableWithBidAskResult = value;
    }

}
