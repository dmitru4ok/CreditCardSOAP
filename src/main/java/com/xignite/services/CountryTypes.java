
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CountryTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mexico"/&gt;
 *     &lt;enumeration value="UnitedStatesAM"/&gt;
 *     &lt;enumeration value="UnitedStatesPM"/&gt;
 *     &lt;enumeration value="Canada"/&gt;
 *     &lt;enumeration value="Europe"/&gt;
 *     &lt;enumeration value="Russia"/&gt;
 *     &lt;enumeration value="Poland"/&gt;
 *     &lt;enumeration value="Romania"/&gt;
 *     &lt;enumeration value="Hungary"/&gt;
 *     &lt;enumeration value="Chile"/&gt;
 *     &lt;enumeration value="Czech"/&gt;
 *     &lt;enumeration value="Australia"/&gt;
 *     &lt;enumeration value="Brazil"/&gt;
 *     &lt;enumeration value="Bulgaria"/&gt;
 *     &lt;enumeration value="China"/&gt;
 *     &lt;enumeration value="Uruguay"/&gt;
 *     &lt;enumeration value="UnitedStates"/&gt;
 *     &lt;enumeration value="Colombia"/&gt;
 *     &lt;enumeration value="Argentina"/&gt;
 *     &lt;enumeration value="MexicoDoF"/&gt;
 *     &lt;enumeration value="Serbia"/&gt;
 *     &lt;enumeration value="Macedonia"/&gt;
 *     &lt;enumeration value="Turkey"/&gt;
 *     &lt;enumeration value="India"/&gt;
 *     &lt;enumeration value="Philippines"/&gt;
 *     &lt;enumeration value="EuropeItalyEUR"/&gt;
 *     &lt;enumeration value="Thailand"/&gt;
 *     &lt;enumeration value="EuropeItalyUSD"/&gt;
 *     &lt;enumeration value="UnitedArabEmirates"/&gt;
 *     &lt;enumeration value="Kazakhstan"/&gt;
 *     &lt;enumeration value="Peru"/&gt;
 *     &lt;enumeration value="Oman"/&gt;
 *     &lt;enumeration value="DominicanRepublic"/&gt;
 *     &lt;enumeration value="Croatia"/&gt;
 *     &lt;enumeration value="CroatiaEUR"/&gt;
 *     &lt;enumeration value="EuropeFranceEUR"/&gt;
 *     &lt;enumeration value="Ukraine"/&gt;
 *     &lt;enumeration value="Tunisia"/&gt;
 *     &lt;enumeration value="SouthKorea"/&gt;
 *     &lt;enumeration value="CostaRica"/&gt;
 *     &lt;enumeration value="NewZealand"/&gt;
 *     &lt;enumeration value="Indonesia"/&gt;
 *     &lt;enumeration value="Japan900"/&gt;
 *     &lt;enumeration value="Japan1700"/&gt;
 *     &lt;enumeration value="SouthAfrica"/&gt;
 *     &lt;enumeration value="Israel"/&gt;
 *     &lt;enumeration value="Norway"/&gt;
 *     &lt;enumeration value="SaudiArabia"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryTypes")
@XmlEnum
public enum CountryTypes {

    @XmlEnumValue("Mexico")
    MEXICO("Mexico"),
    @XmlEnumValue("UnitedStatesAM")
    UNITED_STATES_AM("UnitedStatesAM"),
    @XmlEnumValue("UnitedStatesPM")
    UNITED_STATES_PM("UnitedStatesPM"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    @XmlEnumValue("Russia")
    RUSSIA("Russia"),
    @XmlEnumValue("Poland")
    POLAND("Poland"),
    @XmlEnumValue("Romania")
    ROMANIA("Romania"),
    @XmlEnumValue("Hungary")
    HUNGARY("Hungary"),
    @XmlEnumValue("Chile")
    CHILE("Chile"),
    @XmlEnumValue("Czech")
    CZECH("Czech"),
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    @XmlEnumValue("Brazil")
    BRAZIL("Brazil"),
    @XmlEnumValue("Bulgaria")
    BULGARIA("Bulgaria"),
    @XmlEnumValue("China")
    CHINA("China"),
    @XmlEnumValue("Uruguay")
    URUGUAY("Uruguay"),
    @XmlEnumValue("UnitedStates")
    UNITED_STATES("UnitedStates"),
    @XmlEnumValue("Colombia")
    COLOMBIA("Colombia"),
    @XmlEnumValue("Argentina")
    ARGENTINA("Argentina"),
    @XmlEnumValue("MexicoDoF")
    MEXICO_DO_F("MexicoDoF"),
    @XmlEnumValue("Serbia")
    SERBIA("Serbia"),
    @XmlEnumValue("Macedonia")
    MACEDONIA("Macedonia"),
    @XmlEnumValue("Turkey")
    TURKEY("Turkey"),
    @XmlEnumValue("India")
    INDIA("India"),
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),
    @XmlEnumValue("EuropeItalyEUR")
    EUROPE_ITALY_EUR("EuropeItalyEUR"),
    @XmlEnumValue("Thailand")
    THAILAND("Thailand"),
    @XmlEnumValue("EuropeItalyUSD")
    EUROPE_ITALY_USD("EuropeItalyUSD"),
    @XmlEnumValue("UnitedArabEmirates")
    UNITED_ARAB_EMIRATES("UnitedArabEmirates"),
    @XmlEnumValue("Kazakhstan")
    KAZAKHSTAN("Kazakhstan"),
    @XmlEnumValue("Peru")
    PERU("Peru"),
    @XmlEnumValue("Oman")
    OMAN("Oman"),
    @XmlEnumValue("DominicanRepublic")
    DOMINICAN_REPUBLIC("DominicanRepublic"),
    @XmlEnumValue("Croatia")
    CROATIA("Croatia"),
    @XmlEnumValue("CroatiaEUR")
    CROATIA_EUR("CroatiaEUR"),
    @XmlEnumValue("EuropeFranceEUR")
    EUROPE_FRANCE_EUR("EuropeFranceEUR"),
    @XmlEnumValue("Ukraine")
    UKRAINE("Ukraine"),
    @XmlEnumValue("Tunisia")
    TUNISIA("Tunisia"),
    @XmlEnumValue("SouthKorea")
    SOUTH_KOREA("SouthKorea"),
    @XmlEnumValue("CostaRica")
    COSTA_RICA("CostaRica"),
    @XmlEnumValue("NewZealand")
    NEW_ZEALAND("NewZealand"),
    @XmlEnumValue("Indonesia")
    INDONESIA("Indonesia"),
    @XmlEnumValue("Japan900")
    JAPAN_900("Japan900"),
    @XmlEnumValue("Japan1700")
    JAPAN_1700("Japan1700"),
    @XmlEnumValue("SouthAfrica")
    SOUTH_AFRICA("SouthAfrica"),
    @XmlEnumValue("Israel")
    ISRAEL("Israel"),
    @XmlEnumValue("Norway")
    NORWAY("Norway"),
    @XmlEnumValue("SaudiArabia")
    SAUDI_ARABIA("SaudiArabia");
    private final String value;

    CountryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryTypes fromValue(String v) {
        for (CountryTypes c: CountryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
