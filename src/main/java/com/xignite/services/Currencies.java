
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currencies.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Currencies"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARA"/&gt;
 *     &lt;enumeration value="ARE"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="ATS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AUN"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="AZN"/&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BEF"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BGL"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="BRC"/&gt;
 *     &lt;enumeration value="BRE"/&gt;
 *     &lt;enumeration value="BRI"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BRR"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYN"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CHK"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="CNH"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CSD"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DOE"/&gt;
 *     &lt;enumeration value="DOW"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FIM"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="FRF"/&gt;
 *     &lt;enumeration value="FRN"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GGP"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GHS"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRD"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IEP"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="ITL"/&gt;
 *     &lt;enumeration value="JEP"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRU"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LUF"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="M5P"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MAL"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MFG"/&gt;
 *     &lt;enumeration value="MGA"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MRU"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="MTP"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MXP"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NBL"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NLG"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NSO"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="OSO"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEI"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PES"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PLZ"/&gt;
 *     &lt;enumeration value="PTE"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RUR"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDG"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SDR"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJR"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMM"/&gt;
 *     &lt;enumeration value="TMT"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TVD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *     &lt;enumeration value="UYP"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VES"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VRL"/&gt;
 *     &lt;enumeration value="VRN"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XDR"/&gt;
 *     &lt;enumeration value="XEU"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="YUD"/&gt;
 *     &lt;enumeration value="YUM"/&gt;
 *     &lt;enumeration value="ZAL"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZMW"/&gt;
 *     &lt;enumeration value="ZRN"/&gt;
 *     &lt;enumeration value="ZRZ"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *     &lt;enumeration value="ZWL"/&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="NOCURRENCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Currencies")
@XmlEnum
public enum Currencies {

    USD("USD"),
    AED("AED"),
    AFA("AFA"),
    AFN("AFN"),
    ALL("ALL"),
    AMD("AMD"),
    ANG("ANG"),
    AOA("AOA"),
    ARA("ARA"),
    ARE("ARE"),
    ARS("ARS"),
    ATS("ATS"),
    AUD("AUD"),
    AUN("AUN"),
    AWG("AWG"),
    AZM("AZM"),
    AZN("AZN"),
    BAM("BAM"),
    BBD("BBD"),
    BDT("BDT"),
    BEF("BEF"),
    BEL("BEL"),
    BGL("BGL"),
    BGN("BGN"),
    BHD("BHD"),
    BIF("BIF"),
    BMD("BMD"),
    BND("BND"),
    BOB("BOB"),
    BOV("BOV"),
    BRC("BRC"),
    BRE("BRE"),
    BRI("BRI"),
    BRL("BRL"),
    BRR("BRR"),
    BSD("BSD"),
    BTN("BTN"),
    BWP("BWP"),
    BYN("BYN"),
    BYR("BYR"),
    BZD("BZD"),
    CAD("CAD"),
    CDF("CDF"),
    CHF("CHF"),
    CLF("CLF"),
    CHK("CHK"),
    CLP("CLP"),
    CNY("CNY"),
    CNH("CNH"),
    COP("COP"),
    CRC("CRC"),
    CSD("CSD"),
    CUP("CUP"),
    CVE("CVE"),
    CYP("CYP"),
    CZK("CZK"),
    DEM("DEM"),
    DJF("DJF"),
    DKK("DKK"),
    DOP("DOP"),
    DOE("DOE"),
    DOW("DOW"),
    DZD("DZD"),
    ECS("ECS"),
    EEK("EEK"),
    EGP("EGP"),
    ERN("ERN"),
    ESP("ESP"),
    ETB("ETB"),
    EUR("EUR"),
    FIM("FIM"),
    FJD("FJD"),
    FKP("FKP"),
    FRF("FRF"),
    FRN("FRN"),
    GBP("GBP"),
    GEL("GEL"),
    GGP("GGP"),
    GHC("GHC"),
    GHS("GHS"),
    GIP("GIP"),
    GMD("GMD"),
    GNF("GNF"),
    GRD("GRD"),
    GTQ("GTQ"),
    GYD("GYD"),
    HKD("HKD"),
    HNL("HNL"),
    HRD("HRD"),
    HRK("HRK"),
    HTG("HTG"),
    HUF("HUF"),
    IDR("IDR"),
    IEP("IEP"),
    ILS("ILS"),
    IMP("IMP"),
    INR("INR"),
    IQD("IQD"),
    IRR("IRR"),
    ISK("ISK"),
    ITL("ITL"),
    JEP("JEP"),
    JMD("JMD"),
    JOD("JOD"),
    JPY("JPY"),
    KES("KES"),
    KGS("KGS"),
    KHR("KHR"),
    KMF("KMF"),
    KPW("KPW"),
    KRU("KRU"),
    KRW("KRW"),
    KWD("KWD"),
    KYD("KYD"),
    KZT("KZT"),
    LAK("LAK"),
    LBP("LBP"),
    LKR("LKR"),
    LRD("LRD"),
    LSL("LSL"),
    LTL("LTL"),
    LUF("LUF"),
    LVL("LVL"),
    LYD("LYD"),
    @XmlEnumValue("M5P")
    M_5_P("M5P"),
    MAD("MAD"),
    MAL("MAL"),
    MDL("MDL"),
    MFG("MFG"),
    MGA("MGA"),
    MKD("MKD"),
    MMK("MMK"),
    MNT("MNT"),
    MOP("MOP"),
    MRO("MRO"),
    MRU("MRU"),
    MTL("MTL"),
    MTP("MTP"),
    MUR("MUR"),
    MVR("MVR"),
    MWK("MWK"),
    MXN("MXN"),
    MXP("MXP"),
    MXV("MXV"),
    MYR("MYR"),
    MZM("MZM"),
    MZN("MZN"),
    NAD("NAD"),
    NBL("NBL"),
    NGN("NGN"),
    NIC("NIC"),
    NIO("NIO"),
    NLG("NLG"),
    NOK("NOK"),
    NPR("NPR"),
    NSO("NSO"),
    NZD("NZD"),
    OMR("OMR"),
    OSO("OSO"),
    PAB("PAB"),
    PEI("PEI"),
    PEN("PEN"),
    PES("PES"),
    PGK("PGK"),
    PHP("PHP"),
    PKR("PKR"),
    PLN("PLN"),
    PLZ("PLZ"),
    PTE("PTE"),
    PYG("PYG"),
    QAR("QAR"),
    ROL("ROL"),
    RON("RON"),
    RSD("RSD"),
    RUB("RUB"),
    RUR("RUR"),
    RWF("RWF"),
    SAR("SAR"),
    SBD("SBD"),
    SCR("SCR"),
    SDD("SDD"),
    SDG("SDG"),
    SDP("SDP"),
    SDR("SDR"),
    SEK("SEK"),
    SGD("SGD"),
    SHP("SHP"),
    SIT("SIT"),
    SKK("SKK"),
    SLL("SLL"),
    SOS("SOS"),
    SPL("SPL"),
    SRD("SRD"),
    SRG("SRG"),
    STD("STD"),
    STN("STN"),
    SUR("SUR"),
    SVC("SVC"),
    SYP("SYP"),
    SZL("SZL"),
    THB("THB"),
    TJR("TJR"),
    TJS("TJS"),
    TMM("TMM"),
    TMT("TMT"),
    TND("TND"),
    TOP("TOP"),
    TRL("TRL"),
    TRY("TRY"),
    TTD("TTD"),
    TVD("TVD"),
    TWD("TWD"),
    TZS("TZS"),
    UAH("UAH"),
    UGX("UGX"),
    UNK("UNK"),
    UYP("UYP"),
    UYU("UYU"),
    UZS("UZS"),
    VEB("VEB"),
    VEF("VEF"),
    VES("VES"),
    VND("VND"),
    VRL("VRL"),
    VRN("VRN"),
    VUV("VUV"),
    WST("WST"),
    XAF("XAF"),
    XAG("XAG"),
    XAU("XAU"),
    XCD("XCD"),
    XDR("XDR"),
    XEU("XEU"),
    XOF("XOF"),
    XPD("XPD"),
    XPF("XPF"),
    XPT("XPT"),
    YER("YER"),
    YUD("YUD"),
    YUM("YUM"),
    ZAL("ZAL"),
    ZAR("ZAR"),
    ZMK("ZMK"),
    ZMW("ZMW"),
    ZRN("ZRN"),
    ZRZ("ZRZ"),
    ZWD("ZWD"),
    ZWL("ZWL"),
    BAD("BAD"),
    NOCURRENCY("NOCURRENCY");
    private final String value;

    Currencies(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Currencies fromValue(String v) {
        for (Currencies c: Currencies.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
