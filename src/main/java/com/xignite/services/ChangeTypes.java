
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChangeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneMonth"/&gt;
 *     &lt;enumeration value="ThreeMonth"/&gt;
 *     &lt;enumeration value="SixMonth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeTypes")
@XmlEnum
public enum ChangeTypes {

    @XmlEnumValue("OneMonth")
    ONE_MONTH("OneMonth"),
    @XmlEnumValue("ThreeMonth")
    THREE_MONTH("ThreeMonth"),
    @XmlEnumValue("SixMonth")
    SIX_MONTH("SixMonth");
    private final String value;

    ChangeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypes fromValue(String v) {
        for (ChangeTypes c: ChangeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
