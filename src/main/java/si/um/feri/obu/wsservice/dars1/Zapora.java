
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Zapora complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zapora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avtocesta" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Avtocesta" minOccurs="0"/>
 *         &lt;element name="DolzinaKolone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lokacija" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Lokacija" minOccurs="0"/>
 *         &lt;element name="Opombe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Smer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Zapora", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "avtocesta",
    "dolzinaKolone",
    "lokacija",
    "opombe",
    "smer",
    "vrsta"
})
public class Zapora {

    @XmlElementRef(name = "Avtocesta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Avtocesta> avtocesta;
    @XmlElement(name = "DolzinaKolone")
    protected Double dolzinaKolone;
    @XmlElementRef(name = "Lokacija", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Lokacija> lokacija;
    @XmlElementRef(name = "Opombe", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opombe;
    @XmlElementRef(name = "Smer", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smer;
    @XmlElementRef(name = "Vrsta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vrsta;

    /**
     * Gets the value of the avtocesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}
     *     
     */
    public JAXBElement<Avtocesta> getAvtocesta() {
        return avtocesta;
    }

    /**
     * Sets the value of the avtocesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}
     *     
     */
    public void setAvtocesta(JAXBElement<Avtocesta> value) {
        this.avtocesta = value;
    }

    /**
     * Gets the value of the dolzinaKolone property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDolzinaKolone() {
        return dolzinaKolone;
    }

    /**
     * Sets the value of the dolzinaKolone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDolzinaKolone(Double value) {
        this.dolzinaKolone = value;
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
     * Gets the value of the opombe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpombe() {
        return opombe;
    }

    /**
     * Sets the value of the opombe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpombe(JAXBElement<String> value) {
        this.opombe = value;
    }

    /**
     * Gets the value of the smer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmer() {
        return smer;
    }

    /**
     * Sets the value of the smer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmer(JAXBElement<String> value) {
        this.smer = value;
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
