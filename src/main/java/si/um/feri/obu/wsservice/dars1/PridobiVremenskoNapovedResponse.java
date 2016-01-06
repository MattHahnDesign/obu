
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
 *         &lt;element name="PridobiVremenskoNapovedResult" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}VremenskaNapoved" minOccurs="0"/>
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
    "pridobiVremenskoNapovedResult"
})
@XmlRootElement(name = "PridobiVremenskoNapovedResponse")
public class PridobiVremenskoNapovedResponse {

    @XmlElementRef(name = "PridobiVremenskoNapovedResult", namespace = "http://um.si/SOA/v2/12/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<VremenskaNapoved> pridobiVremenskoNapovedResult;

    /**
     * Gets the value of the pridobiVremenskoNapovedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VremenskaNapoved }{@code >}
     *     
     */
    public JAXBElement<VremenskaNapoved> getPridobiVremenskoNapovedResult() {
        return pridobiVremenskoNapovedResult;
    }

    /**
     * Sets the value of the pridobiVremenskoNapovedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VremenskaNapoved }{@code >}
     *     
     */
    public void setPridobiVremenskoNapovedResult(JAXBElement<VremenskaNapoved> value) {
        this.pridobiVremenskoNapovedResult = value;
    }

}
