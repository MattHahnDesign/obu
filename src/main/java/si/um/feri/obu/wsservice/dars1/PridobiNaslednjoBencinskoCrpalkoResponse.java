
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
 *         &lt;element name="PridobiNaslednjoBencinskoCrpalkoResult" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}BencinskaCrpalka" minOccurs="0"/>
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
    "pridobiNaslednjoBencinskoCrpalkoResult"
})
@XmlRootElement(name = "PridobiNaslednjoBencinskoCrpalkoResponse")
public class PridobiNaslednjoBencinskoCrpalkoResponse {

    @XmlElementRef(name = "PridobiNaslednjoBencinskoCrpalkoResult", namespace = "http://um.si/SOA/v2/12/2015", type = JAXBElement.class, required = false)
    protected JAXBElement<BencinskaCrpalka> pridobiNaslednjoBencinskoCrpalkoResult;

    /**
     * Gets the value of the pridobiNaslednjoBencinskoCrpalkoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BencinskaCrpalka }{@code >}
     *     
     */
    public JAXBElement<BencinskaCrpalka> getPridobiNaslednjoBencinskoCrpalkoResult() {
        return pridobiNaslednjoBencinskoCrpalkoResult;
    }

    /**
     * Sets the value of the pridobiNaslednjoBencinskoCrpalkoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BencinskaCrpalka }{@code >}
     *     
     */
    public void setPridobiNaslednjoBencinskoCrpalkoResult(JAXBElement<BencinskaCrpalka> value) {
        this.pridobiNaslednjoBencinskoCrpalkoResult = value;
    }

}
