
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutcomeTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OutcomeTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="SystemError"/&gt;
 *     &lt;enumeration value="RequestError"/&gt;
 *     &lt;enumeration value="RegistrationError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutcomeTypes")
@XmlEnum
public enum OutcomeTypes {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError"),
    @XmlEnumValue("RequestError")
    REQUEST_ERROR("RequestError"),
    @XmlEnumValue("RegistrationError")
    REGISTRATION_ERROR("RegistrationError");
    private final String value;

    OutcomeTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutcomeTypes fromValue(String v) {
        for (OutcomeTypes c: OutcomeTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
