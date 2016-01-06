
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
 *         &lt;element name="PridobiVseZaporeResult" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}ArrayOfZapora" minOccurs="0"/>
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
    "pridobiVseZaporeResult"
})
@XmlRootElement(name = "PridobiVseZaporeResponse")
public class PridobiVseZaporeResponse {

    @XmlElementRef(name = "PridobiVseZaporeResult", namespace = "http://um.si/SOA/v2/12/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfZapora> pridobiVseZaporeResult;

    /**
     * Gets the value of the pridobiVseZaporeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}
     *     
     */
    public JAXBElement<ArrayOfZapora> getPridobiVseZaporeResult() {
        return pridobiVseZaporeResult;
    }

    /**
     * Sets the value of the pridobiVseZaporeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}
     *     
     */
    public void setPridobiVseZaporeResult(JAXBElement<ArrayOfZapora> value) {
        this.pridobiVseZaporeResult = value;
    }

}
