
package si.um.feri.obu.wsservice.avtoservis2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for napaka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="napaka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDobu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="komanda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stanjeKomande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "napaka", propOrder = {
    "id",
    "datum",
    "opis",
    "iDobu",
    "komanda",
    "stanjeKomande"
})
public class Napaka {

    protected Integer id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datum;
    protected String opis;
    @XmlElement(name = "IDobu")
    protected String iDobu;
    protected String komanda;
    protected String stanjeKomande;

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
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
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

    /**
     * Gets the value of the komanda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKomanda() {
        return komanda;
    }

    /**
     * Sets the value of the komanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKomanda(String value) {
        this.komanda = value;
    }

    /**
     * Gets the value of the stanjeKomande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanjeKomande() {
        return stanjeKomande;
    }

    /**
     * Sets the value of the stanjeKomande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanjeKomande(String value) {
        this.stanjeKomande = value;
    }

}
