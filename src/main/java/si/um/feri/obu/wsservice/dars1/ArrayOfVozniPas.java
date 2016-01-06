
package si.um.feri.obu.wsservice.dars1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVozniPas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVozniPas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VozniPas" type="{http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract}VozniPas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVozniPas", namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", propOrder = {
    "vozniPas"
})
public class ArrayOfVozniPas {

    @XmlElement(name = "VozniPas", nillable = true)
    protected List<VozniPas> vozniPas;

    /**
     * Gets the value of the vozniPas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vozniPas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVozniPas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VozniPas }
     * 
     * 
     */
    public List<VozniPas> getVozniPas() {
        if (vozniPas == null) {
            vozniPas = new ArrayList<VozniPas>();
        }
        return this.vozniPas;
    }

}
