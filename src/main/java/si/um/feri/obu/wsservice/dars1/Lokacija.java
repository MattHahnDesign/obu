
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lokacija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lokacija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dolzina" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sirina" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lokacija", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "dolzina",
    "sirina"
})
public class Lokacija {

    @XmlElement(name = "Dolzina")
    protected Double dolzina;
    @XmlElement(name = "Sirina")
    protected Double sirina;

    /**
     * Gets the value of the dolzina property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDolzina() {
        return dolzina;
    }

    /**
     * Sets the value of the dolzina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDolzina(Double value) {
        this.dolzina = value;
    }

    /**
     * Gets the value of the sirina property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSirina() {
        return sirina;
    }

    /**
     * Sets the value of the sirina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSirina(Double value) {
        this.sirina = value;
    }

}
