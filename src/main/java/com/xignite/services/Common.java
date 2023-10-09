
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Common complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Common"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Outcome" type="{http://www.xignite.com/services/}OutcomeTypes"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Delay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
    "outcome",
    "message",
    "identity",
    "delay"
})
@XmlSeeAlso({
    CurrencyList.class,
    OfficialRates.class,
    UnitOfAccount.class,
    ExchangeConversion.class,
    ForwardRate.class,
    CrossRate.class,
    Report.class,
    CrossRateTable.class,
    CrossRateTableWithBidAsk.class,
    CrossRateTableLineWithBidAsk.class,
    HTMLCrossRateTable.class,
    HistoricalCrossRate.class,
    FullHistoricalCrossRate.class,
    HistoricalCrossRates.class,
    FullHistoricalCrossRates.class,
    MultipleHistoricalCrossRates.class,
    AverageHistoricalCrossRate.class,
    CrossRateChange.class,
    ChartDesign.class,
    ChartBinary.class,
    SingleTick.class,
    Ticks.class,
    HighLowTick.class,
    CrossRateTableLine.class,
    ExchangeRate.class,
    Change.class,
    StockChart.class
})
public class Common {

    @XmlElement(name = "Outcome", required = true)
    @XmlSchemaType(name = "string")
    protected OutcomeTypes outcome;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Identity")
    protected String identity;
    @XmlElement(name = "Delay")
    protected double delay;

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeTypes }
     *     
     */
    public OutcomeTypes getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeTypes }
     *     
     */
    public void setOutcome(OutcomeTypes value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     */
    public double getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     */
    public void setDelay(double value) {
        this.delay = value;
    }

}
