
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
 *         &lt;element name="RezervirajParkirnoMestoResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "rezervirajParkirnoMestoResult"
})
@XmlRootElement(name = "RezervirajParkirnoMestoResponse")
public class RezervirajParkirnoMestoResponse {

    @XmlElement(name = "RezervirajParkirnoMestoResult")
    protected Integer rezervirajParkirnoMestoResult;

    /**
     * Gets the value of the rezervirajParkirnoMestoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRezervirajParkirnoMestoResult() {
        return rezervirajParkirnoMestoResult;
    }

    /**
     * Sets the value of the rezervirajParkirnoMestoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRezervirajParkirnoMestoResult(Integer value) {
        this.rezervirajParkirnoMestoResult = value;
    }

}
