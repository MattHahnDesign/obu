
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VremenskaNapoved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VremenskaNapoved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avtocesta" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Avtocesta" minOccurs="0"/>
 *         &lt;element name="Lokacija" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Lokacija" minOccurs="0"/>
 *         &lt;element name="Megla" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MocVetra" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperatura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VremenskaNapoved", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "avtocesta",
    "lokacija",
    "megla",
    "mocVetra",
    "opis",
    "temperatura"
})
public class VremenskaNapoved {

    @XmlElementRef(name = "Avtocesta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Avtocesta> avtocesta;
    @XmlElementRef(name = "Lokacija", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<Lokacija> lokacija;
    @XmlElement(name = "Megla")
    protected Boolean megla;
    @XmlElement(name = "MocVetra")
    protected Double mocVetra;
    @XmlElementRef(name = "Opis", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opis;
    @XmlElement(name = "Temperatura")
    protected Double temperatura;

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
     * Gets the value of the megla property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMegla() {
        return megla;
    }

    /**
     * Sets the value of the megla property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMegla(Boolean value) {
        this.megla = value;
    }

    /**
     * Gets the value of the mocVetra property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMocVetra() {
        return mocVetra;
    }

    /**
     * Sets the value of the mocVetra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMocVetra(Double value) {
        this.mocVetra = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpis(JAXBElement<String> value) {
        this.opis = value;
    }

    /**
     * Gets the value of the temperatura property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemperatura() {
        return temperatura;
    }

    /**
     * Sets the value of the temperatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemperatura(Double value) {
        this.temperatura = value;
    }

}
