
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VozniPas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VozniPas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avtocesta" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Avtocesta" minOccurs="0"/>
 *         &lt;element name="Hitrost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriporocenaHitrost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Smer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VrstaPrometa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VozniPas", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "avtocesta",
    "hitrost",
    "priporocenaHitrost",
    "smer",
    "status",
    "vrstaPrometa"
})
public class VozniPas {

    @XmlElementRef(name = "Avtocesta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Avtocesta> avtocesta;
    @XmlElement(name = "Hitrost")
    protected Integer hitrost;
    @XmlElement(name = "PriporocenaHitrost")
    protected Integer priporocenaHitrost;
    @XmlElementRef(name = "Smer", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smer;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "VrstaPrometa", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vrstaPrometa;

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
     * Gets the value of the hitrost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHitrost() {
        return hitrost;
    }

    /**
     * Sets the value of the hitrost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHitrost(Integer value) {
        this.hitrost = value;
    }

    /**
     * Gets the value of the priporocenaHitrost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriporocenaHitrost() {
        return priporocenaHitrost;
    }

    /**
     * Sets the value of the priporocenaHitrost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriporocenaHitrost(Integer value) {
        this.priporocenaHitrost = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the vrstaPrometa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVrstaPrometa() {
        return vrstaPrometa;
    }

    /**
     * Sets the value of the vrstaPrometa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVrstaPrometa(JAXBElement<String> value) {
        this.vrstaPrometa = value;
    }

}
