
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BencinskaCrpalka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BencinskaCrpalka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lokacija" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Lokacija" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BencinskaCrpalka", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "ime",
    "lokacija"
})
public class BencinskaCrpalka {

    @XmlElementRef(name = "Ime", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ime;
    @XmlElementRef(name = "Lokacija", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Lokacija> lokacija;

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIme(JAXBElement<String> value) {
        this.ime = value;
    }

    /**
     * Gets the value of the lokacija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Lokacija }{@code >}
     *     
     */
    public JAXBElement<Lokacija> getLokacija() {
        return lokacija;
    }

    /**
     * Sets the value of the lokacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Lokacija }{@code >}
     *     
     */
    public void setLokacija(JAXBElement<Lokacija> value) {
        this.lokacija = value;
    }

}
