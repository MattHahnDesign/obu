//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the
// source schema.
// Generated on: 2015.11.20 at 10:30:57 AM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for receiveNotificationRequest complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p>
 * <pre>
 * &lt;complexType name="receiveNotificationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBUId" type="{http://www.w3
 *         .org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3
 *         .org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveNotificationRequest", propOrder = {
        "obuId",
        "message"
})
@XmlRootElement(name = "receiveNotificationRequest")
public class ReceiveNotificationRequest {

    @XmlElement(name = "OBUId", required = true)
    protected String obuId;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the obuId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOBUId() {
        return obuId;
    }

    /**
     * Sets the value of the obuId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOBUId(String value) {
        this.obuId = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
