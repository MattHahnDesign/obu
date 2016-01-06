
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Avtocesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Avtocesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oznaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VozniPasovi" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}ArrayOfVozniPas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avtocesta", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "oznaka",
    "status",
    "vozniPasovi"
})
public class Avtocesta {

    @XmlElementRef(name = "Oznaka", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oznaka;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "VozniPasovi", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVozniPas> vozniPasovi;

    /**
     * Gets the value of the oznaka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOznaka() {
        return oznaka;
    }

    /**
     * Sets the value of the oznaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOznaka(JAXBElement<String> value) {
        this.oznaka = value;
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
     * Gets the value of the vozniPasovi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVozniPas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVozniPas> getVozniPasovi() {
        return vozniPasovi;
    }

    /**
     * Sets the value of the vozniPasovi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVozniPas }{@code >}
     *     
     */
    public void setVozniPasovi(JAXBElement<ArrayOfVozniPas> value) {
        this.vozniPasovi = value;
    }

}
