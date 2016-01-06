
package si.um.feri.obu.wsservice.avtoservis2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obvescanjeONapakiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obvescanjeONapakiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obvestilo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obvescanjeONapakiResponse", propOrder = {
    "obvestilo"
})
public class ObvescanjeONapakiResponse {

    protected String obvestilo;

    /**
     * Gets the value of the obvestilo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObvestilo() {
        return obvestilo;
    }

    /**
     * Sets the value of the obvestilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObvestilo(String value) {
        this.obvestilo = value;
    }

}
