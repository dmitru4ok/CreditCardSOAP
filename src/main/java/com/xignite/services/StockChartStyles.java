
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockChartStyles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StockChartStyles"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Line"/&gt;
 *     &lt;enumeration value="Candle"/&gt;
 *     &lt;enumeration value="Stick"/&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="Percentage"/&gt;
 *     &lt;enumeration value="LinePercentage"/&gt;
 *     &lt;enumeration value="CandlePercentage"/&gt;
 *     &lt;enumeration value="StickPercentage"/&gt;
 *     &lt;enumeration value="AreaPercentage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StockChartStyles")
@XmlEnum
public enum StockChartStyles {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Candle")
    CANDLE("Candle"),
    @XmlEnumValue("Stick")
    STICK("Stick"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),
    @XmlEnumValue("LinePercentage")
    LINE_PERCENTAGE("LinePercentage"),
    @XmlEnumValue("CandlePercentage")
    CANDLE_PERCENTAGE("CandlePercentage"),
    @XmlEnumValue("StickPercentage")
    STICK_PERCENTAGE("StickPercentage"),
    @XmlEnumValue("AreaPercentage")
    AREA_PERCENTAGE("AreaPercentage");
    private final String value;

    StockChartStyles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockChartStyles fromValue(String v) {
        for (StockChartStyles c: StockChartStyles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
