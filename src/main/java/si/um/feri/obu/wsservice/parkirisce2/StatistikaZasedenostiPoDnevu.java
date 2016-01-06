
package si.um.feri.obu.wsservice.parkirisce2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dan" type="{http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/Dnevi}Dnevi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dan"
})
@XmlRootElement(name = "StatistikaZasedenostiPoDnevu")
public class StatistikaZasedenostiPoDnevu {

    @XmlSchemaType(name = "string")
    protected Dnevi dan;

    /**
     * Gets the value of the dan property.
     * 
     * @return
     *     possible object is
     *     {@link Dnevi }
     *     
     */
    public Dnevi getDan() {
        return dan;
    }

    /**
     * Sets the value of the dan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dnevi }
     *     
     */
    public void setDan(Dnevi value) {
        this.dan = value;
    }

}
