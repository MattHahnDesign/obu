//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 11:43:08 AM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="carErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENGINE"/>
 *     &lt;enumeration value="COMPUTER"/>
 *     &lt;enumeration value="SENSOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carErrorType")
@XmlEnum
public enum CarErrorType {

    ENGINE,
    COMPUTER,
    SENSOR;

    public String value() {
        return name();
    }

    public static CarErrorType fromValue(String v) {
        return valueOf(v);
    }

}
