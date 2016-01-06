
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prehod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prehod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dolzina" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lokacija" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Lokacija" minOccurs="0"/>
 *         &lt;element name="Prevozen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Vrsta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prehod", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "dolzina",
    "ime",
    "lokacija",
    "prevozen",
    "vrsta"
})
public class Prehod {

    @XmlElement(name = "Dolzina")
    protected Double dolzina;
    @XmlElementRef(name = "Ime", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ime;
    @XmlElementRef(name = "Lokacija", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Lokacija> lokacija;
    @XmlElement(name = "Prevozen")
    protected Boolean prevozen;
    @XmlElementRef(name = "Vrsta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vrsta;

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

    /**
     * Gets the value of the prevozen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevozen() {
        return prevozen;
    }

    /**
     * Sets the value of the prevozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevozen(Boolean value) {
        this.prevozen = value;
    }

    /**
     * Gets the value of the vrsta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVrsta() {
        return vrsta;
    }

    /**
     * Sets the value of the vrsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVrsta(JAXBElement<String> value) {
        this.vrsta = value;
    }

}
