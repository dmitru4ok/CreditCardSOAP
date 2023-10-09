
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForwardTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Overnight"/&gt;
 *     &lt;enumeration value="TomorrowNext"/&gt;
 *     &lt;enumeration value="SpotNext"/&gt;
 *     &lt;enumeration value="OneWeek"/&gt;
 *     &lt;enumeration value="TwoWeek"/&gt;
 *     &lt;enumeration value="ThreeWeek"/&gt;
 *     &lt;enumeration value="OneMonth"/&gt;
 *     &lt;enumeration value="TwoMonth"/&gt;
 *     &lt;enumeration value="ThreeMonth"/&gt;
 *     &lt;enumeration value="FourMonth"/&gt;
 *     &lt;enumeration value="FiveMonth"/&gt;
 *     &lt;enumeration value="SixMonth"/&gt;
 *     &lt;enumeration value="SevenMonth"/&gt;
 *     &lt;enumeration value="EightMonth"/&gt;
 *     &lt;enumeration value="NineMonth"/&gt;
 *     &lt;enumeration value="TenMonth"/&gt;
 *     &lt;enumeration value="ElevenMonth"/&gt;
 *     &lt;enumeration value="OneYear"/&gt;
 *     &lt;enumeration value="TwoYear"/&gt;
 *     &lt;enumeration value="ThreeYear"/&gt;
 *     &lt;enumeration value="FourYear"/&gt;
 *     &lt;enumeration value="FiveYear"/&gt;
 *     &lt;enumeration value="SixYear"/&gt;
 *     &lt;enumeration value="SevenYear"/&gt;
 *     &lt;enumeration value="TenYear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForwardTypes")
@XmlEnum
public enum ForwardTypes {

    @XmlEnumValue("Overnight")
    OVERNIGHT("Overnight"),
    @XmlEnumValue("TomorrowNext")
    TOMORROW_NEXT("TomorrowNext"),
    @XmlEnumValue("SpotNext")
    SPOT_NEXT("SpotNext"),
    @XmlEnumValue("OneWeek")
    ONE_WEEK("OneWeek"),
    @XmlEnumValue("TwoWeek")
    TWO_WEEK("TwoWeek"),
    @XmlEnumValue("ThreeWeek")
    THREE_WEEK("ThreeWeek"),
    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("TwoMonth")
    TWO_MONTH("TwoMonth"),
    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("FourMonth")
    FOUR_MONTH("FourMonth"),
    @XmlEnumValue("FiveMonth")
    FIVE_MONTH("FiveMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth"),
    @XmlEnumValue("SevenMonth")
    SEVEN_MONTH("SevenMonth"),
    @XmlEnumValue("EightMonth")
    EIGHT_MONTH("EightMonth"),
    @XmlEnumValue("NineMonth")
    NINE_MONTH("NineMonth"),
    @XmlEnumValue("TenMonth")
    TEN_MONTH("TenMonth"),
    @XmlEnumValue("ElevenMonth")
    ELEVEN_MONTH("ElevenMonth"),
    @XmlEnumValue("OneYear")
    ONE_YEAR("OneYear"),
    @XmlEnumValue("TwoYear")
    TWO_YEAR("TwoYear"),
    @XmlEnumValue("ThreeYear")
    THREE_YEAR("ThreeYear"),
    @XmlEnumValue("FourYear")
    FOUR_YEAR("FourYear"),
    @XmlEnumValue("FiveYear")
    FIVE_YEAR("FiveYear"),
    @XmlEnumValue("SixYear")
    SIX_YEAR("SixYear"),
    @XmlEnumValue("SevenYear")
    SEVEN_YEAR("SevenYear"),
    @XmlEnumValue("TenYear")
    TEN_YEAR("TenYear");
    private final String value;

    ForwardTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForwardTypes fromValue(String v) {
        for (ForwardTypes c: ForwardTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
