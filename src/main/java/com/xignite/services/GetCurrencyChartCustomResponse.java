
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
 *         &lt;element name="GetCurrencyChartCustomResult" type="{http://www.xignite.com/services/}HistoricalChart" minOccurs="0"/&gt;
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
    "getCurrencyChartCustomResult"
})
@XmlRootElement(name = "GetCurrencyChartCustomResponse")
public class GetCurrencyChartCustomResponse {

    @XmlElement(name = "GetCurrencyChartCustomResult")
    protected HistoricalChart getCurrencyChartCustomResult;

    /**
     * Gets the value of the getCurrencyChartCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChart }
     *     
     */
    public HistoricalChart getGetCurrencyChartCustomResult() {
        return getCurrencyChartCustomResult;
    }

    /**
     * Sets the value of the getCurrencyChartCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChart }
     *     
     */
    public void setGetCurrencyChartCustomResult(HistoricalChart value) {
        this.getCurrencyChartCustomResult = value;
    }

}
