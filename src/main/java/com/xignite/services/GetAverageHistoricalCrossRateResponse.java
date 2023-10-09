
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
 *         &lt;element name="GetAverageHistoricalCrossRateResult" type="{http://www.xignite.com/services/}AverageHistoricalCrossRate" minOccurs="0"/&gt;
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
    "getAverageHistoricalCrossRateResult"
})
@XmlRootElement(name = "GetAverageHistoricalCrossRateResponse")
public class GetAverageHistoricalCrossRateResponse {

    @XmlElement(name = "GetAverageHistoricalCrossRateResult")
    protected AverageHistoricalCrossRate getAverageHistoricalCrossRateResult;

    /**
     * Gets the value of the getAverageHistoricalCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link AverageHistoricalCrossRate }
     *     
     */
    public AverageHistoricalCrossRate getGetAverageHistoricalCrossRateResult() {
        return getAverageHistoricalCrossRateResult;
    }

    /**
     * Sets the value of the getAverageHistoricalCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageHistoricalCrossRate }
     *     
     */
    public void setGetAverageHistoricalCrossRateResult(AverageHistoricalCrossRate value) {
        this.getAverageHistoricalCrossRateResult = value;
    }

}
