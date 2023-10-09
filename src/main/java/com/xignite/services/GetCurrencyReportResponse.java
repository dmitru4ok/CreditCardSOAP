
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
 *         &lt;element name="GetCurrencyReportResult" type="{http://www.xignite.com/services/}Report" minOccurs="0"/&gt;
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
    "getCurrencyReportResult"
})
@XmlRootElement(name = "GetCurrencyReportResponse")
public class GetCurrencyReportResponse {

    @XmlElement(name = "GetCurrencyReportResult")
    protected Report getCurrencyReportResult;

    /**
     * Gets the value of the getCurrencyReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link Report }
     *     
     */
    public Report getGetCurrencyReportResult() {
        return getCurrencyReportResult;
    }

    /**
     * Sets the value of the getCurrencyReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report }
     *     
     */
    public void setGetCurrencyReportResult(Report value) {
        this.getCurrencyReportResult = value;
    }

}
