
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
 *         &lt;element name="SteviloPremikajocihAvtomobilovResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "steviloPremikajocihAvtomobilovResult"
})
@XmlRootElement(name = "SteviloPremikajocihAvtomobilovResponse")
public class SteviloPremikajocihAvtomobilovResponse {

    @XmlElement(name = "SteviloPremikajocihAvtomobilovResult")
    protected Integer steviloPremikajocihAvtomobilovResult;

    /**
     * Gets the value of the steviloPremikajocihAvtomobilovResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSteviloPremikajocihAvtomobilovResult() {
        return steviloPremikajocihAvtomobilovResult;
    }

    /**
     * Sets the value of the steviloPremikajocihAvtomobilovResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSteviloPremikajocihAvtomobilovResult(Integer value) {
        this.steviloPremikajocihAvtomobilovResult = value;
    }

}
