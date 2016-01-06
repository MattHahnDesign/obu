
package si.um.feri.obu.wsservice.avtoservis2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pregled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pregled">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="napaka" type="{http://smart.road.si/tehnicnaPomoc}napaka" minOccurs="0"/>
 *         &lt;element name="IDobu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pregled", propOrder = {
    "id",
    "datum",
    "status",
    "napaka",
    "iDobu"
})
public class Pregled {

    protected Integer id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datum;
    protected Boolean status;
    protected Napaka napaka;
    @XmlElement(name = "IDobu")
    protected String iDobu;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the napaka property.
     * 
     * @return
     *     possible object is
     *     {@link Napaka }
     *     
     */
    public Napaka getNapaka() {
        return napaka;
    }

    /**
     * Sets the value of the napaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Napaka }
     *     
     */
    public void setNapaka(Napaka value) {
        this.napaka = value;
    }

    /**
     * Gets the value of the iDobu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDobu() {
        return iDobu;
    }

    /**
     * Sets the value of the iDobu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDobu(String value) {
        this.iDobu = value;
    }

}
