
package si.um.feri.obu.wsservice.parkirisce2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="serijskaStevilkaObu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "serijskaStevilkaObu",
    "odDateTime",
    "doDateTime"
})
@XmlRootElement(name = "RezervirajParkirnoMesto")
public class RezervirajParkirnoMesto {

    @XmlElementRef(name = "serijskaStevilkaObu", namespace = "http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serijskaStevilkaObu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar odDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doDateTime;

    /**
     * Gets the value of the serijskaStevilkaObu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerijskaStevilkaObu() {
        return serijskaStevilkaObu;
    }

    /**
     * Sets the value of the serijskaStevilkaObu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerijskaStevilkaObu(JAXBElement<String> value) {
        this.serijskaStevilkaObu = value;
    }

    /**
     * Gets the value of the odDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdDateTime() {
        return odDateTime;
    }

    /**
     * Sets the value of the odDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdDateTime(XMLGregorianCalendar value) {
        this.odDateTime = value;
    }

    /**
     * Gets the value of the doDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoDateTime() {
        return doDateTime;
    }

    /**
     * Sets the value of the doDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoDateTime(XMLGregorianCalendar value) {
        this.doDateTime = value;
    }

}
