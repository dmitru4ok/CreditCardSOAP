
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xignite.com/services/}Common"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Currencies" type="{http://www.xignite.com/services/}ArrayOfCurrencyItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyList", propOrder = {
    "currencies"
})
public class CurrencyList
    extends Common
{

    @XmlElement(name = "Currencies")
    protected ArrayOfCurrencyItem currencies;

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrencyItem }
     *     
     */
    public ArrayOfCurrencyItem getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrencyItem }
     *     
     */
    public void setCurrencies(ArrayOfCurrencyItem value) {
        this.currencies = value;
    }

}
