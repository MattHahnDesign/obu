
package si.um.feri.obu.wsservice.avtoservis2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificiranjeNapake complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificiranjeNapake">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="napaka" type="{http://smart.road.si/tehnicnaPomoc}napaka" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificiranjeNapake", propOrder = {
    "napaka"
})
public class IdentificiranjeNapake {

    protected Napaka napaka;

    /**
     * Gets the value of the napaka property.
     * 
     * @return
     *     possible object is
     *     {@link Napaka }
     *     
     */
    public Napaka getNapaka() {
        return napaka;
    }

    /**
     * Sets the value of the napaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Napaka }
     *     
     */
    public void setNapaka(Napaka value) {
        this.napaka = value;
    }

}
