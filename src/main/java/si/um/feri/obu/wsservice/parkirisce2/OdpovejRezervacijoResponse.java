
package si.um.feri.obu.wsservice.parkirisce2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="OdpovejRezervacijoResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "odpovejRezervacijoResult"
})
@XmlRootElement(name = "OdpovejRezervacijoResponse")
public class OdpovejRezervacijoResponse {

    @XmlElement(name = "OdpovejRezervacijoResult")
    protected Boolean odpovejRezervacijoResult;

    /**
     * Gets the value of the odpovejRezervacijoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdpovejRezervacijoResult() {
        return odpovejRezervacijoResult;
    }

    /**
     * Sets the value of the odpovejRezervacijoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdpovejRezervacijoResult(Boolean value) {
        this.odpovejRezervacijoResult = value;
    }

}
