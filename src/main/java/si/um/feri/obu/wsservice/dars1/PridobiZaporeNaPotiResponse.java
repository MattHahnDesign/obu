
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
 *         &lt;element name="PridobiZaporeNaPotiResult" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}ArrayOfZapora" minOccurs="0"/>
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
    "pridobiZaporeNaPotiResult"
})
@XmlRootElement(name = "PridobiZaporeNaPotiResponse")
public class PridobiZaporeNaPotiResponse {

    @XmlElementRef(name = "PridobiZaporeNaPotiResult", namespace = "http://um.si/SOA/v2/12/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfZapora> pridobiZaporeNaPotiResult;

    /**
     * Gets the value of the pridobiZaporeNaPotiResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}
     *     
     */
    public JAXBElement<ArrayOfZapora> getPridobiZaporeNaPotiResult() {
        return pridobiZaporeNaPotiResult;
    }

    /**
     * Sets the value of the pridobiZaporeNaPotiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}
     *     
     */
    public void setPridobiZaporeNaPotiResult(JAXBElement<ArrayOfZapora> value) {
        this.pridobiZaporeNaPotiResult = value;
    }

}
