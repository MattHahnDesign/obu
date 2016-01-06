
package si.um.feri.obu.wsservice.parkirisce2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZasedonostPoDnevu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZasedonostPoDnevu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DanVTednu" type="{http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/Dnevi}Dnevi" minOccurs="0"/>
 *         &lt;element name="SteviloProstihMestObUri" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfdoubleint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZasedonostPoDnevu", namespace = "http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/ZasedenostPoDnevu", propOrder = {
    "danVTednu",
    "steviloProstihMestObUri"
})
public class ZasedonostPoDnevu {

    @XmlElement(name = "DanVTednu")
    @XmlSchemaType(name = "string")
    protected Dnevi danVTednu;
    @XmlElementRef(name = "SteviloProstihMestObUri", namespace = "http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/ZasedenostPoDnevu", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfdoubleint> steviloProstihMestObUri;

    /**
     * Gets the value of the danVTednu property.
     * 
     * @return
     *     possible object is
     *     {@link Dnevi }
     *     
     */
    public Dnevi getDanVTednu() {
        return danVTednu;
    }

    /**
     * Sets the value of the danVTednu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dnevi }
     *     
     */
    public void setDanVTednu(Dnevi value) {
        this.danVTednu = value;
    }

    /**
     * Gets the value of the steviloProstihMestObUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfdoubleint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfdoubleint> getSteviloProstihMestObUri() {
        return steviloProstihMestObUri;
    }

    /**
     * Sets the value of the steviloProstihMestObUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfdoubleint }{@code >}
     *     
     */
    public void setSteviloProstihMestObUri(JAXBElement<ArrayOfKeyValueOfdoubleint> value) {
        this.steviloProstihMestObUri = value;
    }

}
