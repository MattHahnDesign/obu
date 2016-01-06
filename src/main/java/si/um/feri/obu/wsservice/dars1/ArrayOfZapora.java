
package si.um.feri.obu.wsservice.dars1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZapora complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZapora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zapora" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}Zapora" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZapora", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "zapora"
})
public class ArrayOfZapora {

    @XmlElement(name = "Zapora", nillable = true)
    protected List<Zapora> zapora;

    /**
     * Gets the value of the zapora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zapora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZapora().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zapora }
     * 
     * 
     */
    public List<Zapora> getZapora() {
        if (zapora == null) {
            zapora = new ArrayList<Zapora>();
        }
        return this.zapora;
    }

}
