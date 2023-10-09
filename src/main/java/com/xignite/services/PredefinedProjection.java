
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedProjection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PredefinedProjection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Orthogonal"/&gt;
 *     &lt;enumeration value="OrthogonalElevated"/&gt;
 *     &lt;enumeration value="OrthogonalHorizontalLeft"/&gt;
 *     &lt;enumeration value="OrthogonalHorizontalRight"/&gt;
 *     &lt;enumeration value="OrthogonalHalf"/&gt;
 *     &lt;enumeration value="OrthogonalHalfHorizontalLeft"/&gt;
 *     &lt;enumeration value="OrthogonalHalfHorizontalRight"/&gt;
 *     &lt;enumeration value="OrthogonalHalfRotated"/&gt;
 *     &lt;enumeration value="OrthogonalHalfElevated"/&gt;
 *     &lt;enumeration value="Perspective"/&gt;
 *     &lt;enumeration value="PerspectiveHorizontalLeft"/&gt;
 *     &lt;enumeration value="PerspectiveHorizontalRight"/&gt;
 *     &lt;enumeration value="PerspectiveRotated"/&gt;
 *     &lt;enumeration value="PerspectiveElevated"/&gt;
 *     &lt;enumeration value="PerspectiveTilted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredefinedProjection")
@XmlEnum
public enum PredefinedProjection {

    @XmlEnumValue("Orthogonal")
    ORTHOGONAL("Orthogonal"),
    @XmlEnumValue("OrthogonalElevated")
    ORTHOGONAL_ELEVATED("OrthogonalElevated"),
    @XmlEnumValue("OrthogonalHorizontalLeft")
    ORTHOGONAL_HORIZONTAL_LEFT("OrthogonalHorizontalLeft"),
    @XmlEnumValue("OrthogonalHorizontalRight")
    ORTHOGONAL_HORIZONTAL_RIGHT("OrthogonalHorizontalRight"),
    @XmlEnumValue("OrthogonalHalf")
    ORTHOGONAL_HALF("OrthogonalHalf"),
    @XmlEnumValue("OrthogonalHalfHorizontalLeft")
    ORTHOGONAL_HALF_HORIZONTAL_LEFT("OrthogonalHalfHorizontalLeft"),
    @XmlEnumValue("OrthogonalHalfHorizontalRight")
    ORTHOGONAL_HALF_HORIZONTAL_RIGHT("OrthogonalHalfHorizontalRight"),
    @XmlEnumValue("OrthogonalHalfRotated")
    ORTHOGONAL_HALF_ROTATED("OrthogonalHalfRotated"),
    @XmlEnumValue("OrthogonalHalfElevated")
    ORTHOGONAL_HALF_ELEVATED("OrthogonalHalfElevated"),
    @XmlEnumValue("Perspective")
    PERSPECTIVE("Perspective"),
    @XmlEnumValue("PerspectiveHorizontalLeft")
    PERSPECTIVE_HORIZONTAL_LEFT("PerspectiveHorizontalLeft"),
    @XmlEnumValue("PerspectiveHorizontalRight")
    PERSPECTIVE_HORIZONTAL_RIGHT("PerspectiveHorizontalRight"),
    @XmlEnumValue("PerspectiveRotated")
    PERSPECTIVE_ROTATED("PerspectiveRotated"),
    @XmlEnumValue("PerspectiveElevated")
    PERSPECTIVE_ELEVATED("PerspectiveElevated"),
    @XmlEnumValue("PerspectiveTilted")
    PERSPECTIVE_TILTED("PerspectiveTilted");
    private final String value;

    PredefinedProjection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedProjection fromValue(String v) {
        for (PredefinedProjection c: PredefinedProjection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
