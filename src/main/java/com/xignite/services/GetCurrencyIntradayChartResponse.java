
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
 *         &lt;element name="GetCurrencyIntradayChartResult" type="{http://www.xignite.com/services/}CurrencyChartIntraday" minOccurs="0"/&gt;
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
    "getCurrencyIntradayChartResult"
})
@XmlRootElement(name = "GetCurrencyIntradayChartResponse")
public class GetCurrencyIntradayChartResponse {

    @XmlElement(name = "GetCurrencyIntradayChartResult")
    protected CurrencyChartIntraday getCurrencyIntradayChartResult;

    /**
     * Gets the value of the getCurrencyIntradayChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyChartIntraday }
     *     
     */
    public CurrencyChartIntraday getGetCurrencyIntradayChartResult() {
        return getCurrencyIntradayChartResult;
    }

    /**
     * Sets the value of the getCurrencyIntradayChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyChartIntraday }
     *     
     */
    public void setGetCurrencyIntradayChartResult(CurrencyChartIntraday value) {
        this.getCurrencyIntradayChartResult = value;
    }

}
