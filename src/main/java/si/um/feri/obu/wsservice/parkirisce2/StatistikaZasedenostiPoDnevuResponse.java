
package si.um.feri.obu.wsservice.parkirisce2;

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
 *         &lt;element name="StatistikaZasedenostiPoDnevuResult" type="{http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11/ZasedenostPoDnevu}ZasedonostPoDnevu" minOccurs="0"/>
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
    "statistikaZasedenostiPoDnevuResult"
})
@XmlRootElement(name = "StatistikaZasedenostiPoDnevuResponse")
public class StatistikaZasedenostiPoDnevuResponse {

    @XmlElementRef(name = "StatistikaZasedenostiPoDnevuResult", namespace = "http://www.feri.uni-mb.si/SOA/Semicolon/Rezervacije/2015/11", type = JAXBElement.class, required = false)
    protected JAXBElement<ZasedonostPoDnevu> statistikaZasedenostiPoDnevuResult;

    /**
     * Gets the value of the statistikaZasedenostiPoDnevuResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZasedonostPoDnevu }{@code >}
     *     
     */
    public JAXBElement<ZasedonostPoDnevu> getStatistikaZasedenostiPoDnevuResult() {
        return statistikaZasedenostiPoDnevuResult;
    }

    /**
     * Sets the value of the statistikaZasedenostiPoDnevuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZasedonostPoDnevu }{@code >}
     *     
     */
    public void setStatistikaZasedenostiPoDnevuResult(JAXBElement<ZasedonostPoDnevu> value) {
        this.statistikaZasedenostiPoDnevuResult = value;
    }

}
