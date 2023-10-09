
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinePattern.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LinePattern"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Solid"/&gt;
 *     &lt;enumeration value="Dot"/&gt;
 *     &lt;enumeration value="Dash"/&gt;
 *     &lt;enumeration value="DashDot"/&gt;
 *     &lt;enumeration value="DashDotDot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinePattern")
@XmlEnum
public enum LinePattern {

    @XmlEnumValue("Solid")
    SOLID("Solid"),
    @XmlEnumValue("Dot")
    DOT("Dot"),
    @XmlEnumValue("Dash")
    DASH("Dash"),
    @XmlEnumValue("DashDot")
    DASH_DOT("DashDot"),
    @XmlEnumValue("DashDotDot")
    DASH_DOT_DOT("DashDotDot");
    private final String value;

    LinePattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinePattern fromValue(String v) {
        for (LinePattern c: LinePattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
