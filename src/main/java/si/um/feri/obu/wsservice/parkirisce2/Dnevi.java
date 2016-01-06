
package si.um.feri.obu.wsservice.parkirisce2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dnevi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Dnevi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ponedeljek"/>
 *     &lt;enumeration value="Torek"/>
 *     &lt;enumeration value="Sreda"/>
 *     &lt;enumeration value="Cetrtek"/>
 *     &lt;enumeration value="Petek"/>
 *     &lt;enumeration value="Sobota"/>
 *     &lt;enumeration value="Nedelja"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dnevi", namespace = "http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/Dnevi")
@XmlEnum
public enum Dnevi {

    @XmlEnumValue("Ponedeljek")
    PONEDELJEK("Ponedeljek"),
    @XmlEnumValue("Torek")
    TOREK("Torek"),
    @XmlEnumValue("Sreda")
    SREDA("Sreda"),
    @XmlEnumValue("Cetrtek")
    CETRTEK("Cetrtek"),
    @XmlEnumValue("Petek")
    PETEK("Petek"),
    @XmlEnumValue("Sobota")
    SOBOTA("Sobota"),
    @XmlEnumValue("Nedelja")
    NEDELJA("Nedelja");
    private final String value;

    Dnevi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dnevi fromValue(String v) {
        for (Dnevi c: Dnevi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
