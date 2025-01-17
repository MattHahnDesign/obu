
package si.um.feri.obu.wsservice.dars1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="lokacija" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Lokacija" minOccurs="0"/>
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
    "lokacija"
})
@XmlRootElement(name = "PridobiZaporeNaPoti")
public class PridobiZaporeNaPoti {

    @XmlElementRef(name = "lokacija", namespace = "http://um.si/SOA/v2/12/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<Lokacija> lokacija;

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
