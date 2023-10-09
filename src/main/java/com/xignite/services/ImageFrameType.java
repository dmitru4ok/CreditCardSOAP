
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageFrameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageFrameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Colonial"/&gt;
 *     &lt;enumeration value="Common"/&gt;
 *     &lt;enumeration value="Embed"/&gt;
 *     &lt;enumeration value="Emboss"/&gt;
 *     &lt;enumeration value="FrameOpenRight"/&gt;
 *     &lt;enumeration value="FrameOpenRL"/&gt;
 *     &lt;enumeration value="OneBarGradient"/&gt;
 *     &lt;enumeration value="RoundedUp"/&gt;
 *     &lt;enumeration value="SlimRoundedShadowed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageFrameType")
@XmlEnum
public enum ImageFrameType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Colonial")
    COLONIAL("Colonial"),
    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("Embed")
    EMBED("Embed"),
    @XmlEnumValue("Emboss")
    EMBOSS("Emboss"),
    @XmlEnumValue("FrameOpenRight")
    FRAME_OPEN_RIGHT("FrameOpenRight"),
    @XmlEnumValue("FrameOpenRL")
    FRAME_OPEN_RL("FrameOpenRL"),
    @XmlEnumValue("OneBarGradient")
    ONE_BAR_GRADIENT("OneBarGradient"),
    @XmlEnumValue("RoundedUp")
    ROUNDED_UP("RoundedUp"),
    @XmlEnumValue("SlimRoundedShadowed")
    SLIM_ROUNDED_SHADOWED("SlimRoundedShadowed");
    private final String value;

    ImageFrameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageFrameType fromValue(String v) {
        for (ImageFrameType c: ImageFrameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
