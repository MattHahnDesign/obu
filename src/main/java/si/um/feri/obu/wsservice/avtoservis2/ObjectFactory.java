
package si.um.feri.obu.wsservice.avtoservis2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the si.um.feri.obu.wsservice.avtoservis2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdentificiranjeNapakeResponse_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "identificiranjeNapakeResponse");
    private final static QName _AktivacijaAvtovlekeResponse_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "aktivacijaAvtovlekeResponse");
    private final static QName _AktivacijaAvtovleke_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "aktivacijaAvtovleke");
    private final static QName _IdentificiranjeNapake_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "identificiranjeNapake");
    private final static QName _OdpravljanjeNapake_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "odpravljanjeNapake");
    private final static QName _OdpravljanjeNapakeResponse_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "odpravljanjeNapakeResponse");
    private final static QName _ObvescanjeONapaki_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "obvescanjeONapaki");
    private final static QName _ObvescanjeONapakiResponse_QNAME = new QName("http://smart.road.si/tehnicnaPomoc", "obvescanjeONapakiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: si.um.feri.obu.wsservice.avtoservis2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObvescanjeONapaki }
     * 
     */
    public ObvescanjeONapaki createObvescanjeONapaki() {
        return new ObvescanjeONapaki();
    }

    /**
     * Create an instance of {@link ObvescanjeONapakiResponse }
     * 
     */
    public ObvescanjeONapakiResponse createObvescanjeONapakiResponse() {
        return new ObvescanjeONapakiResponse();
    }

    /**
     * Create an instance of {@link OdpravljanjeNapakeResponse }
     * 
     */
    public OdpravljanjeNapakeResponse createOdpravljanjeNapakeResponse() {
        return new OdpravljanjeNapakeResponse();
    }

    /**
     * Create an instance of {@link OdpravljanjeNapake }
     * 
     */
    public OdpravljanjeNapake createOdpravljanjeNapake() {
        return new OdpravljanjeNapake();
    }

    /**
     * Create an instance of {@link IdentificiranjeNapake }
     * 
     */
    public IdentificiranjeNapake createIdentificiranjeNapake() {
        return new IdentificiranjeNapake();
    }

    /**
     * Create an instance of {@link AktivacijaAvtovleke }
     * 
     */
    public AktivacijaAvtovleke createAktivacijaAvtovleke() {
        return new AktivacijaAvtovleke();
    }

    /**
     * Create an instance of {@link AktivacijaAvtovlekeResponse }
     * 
     */
    public AktivacijaAvtovlekeResponse createAktivacijaAvtovlekeResponse() {
        return new AktivacijaAvtovlekeResponse();
    }

    /**
     * Create an instance of {@link IdentificiranjeNapakeResponse }
     * 
     */
    public IdentificiranjeNapakeResponse createIdentificiranjeNapakeResponse() {
        return new IdentificiranjeNapakeResponse();
    }

    /**
     * Create an instance of {@link Pregled }
     * 
     */
    public Pregled createPregled() {
        return new Pregled();
    }

    /**
     * Create an instance of {@link Napaka }
     * 
     */
    public Napaka createNapaka() {
        return new Napaka();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificiranjeNapakeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "identificiranjeNapakeResponse")
    public JAXBElement<IdentificiranjeNapakeResponse> createIdentificiranjeNapakeResponse(IdentificiranjeNapakeResponse value) {
        return new JAXBElement<IdentificiranjeNapakeResponse>(_IdentificiranjeNapakeResponse_QNAME, IdentificiranjeNapakeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktivacijaAvtovlekeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "aktivacijaAvtovlekeResponse")
    public JAXBElement<AktivacijaAvtovlekeResponse> createAktivacijaAvtovlekeResponse(AktivacijaAvtovlekeResponse value) {
        return new JAXBElement<AktivacijaAvtovlekeResponse>(_AktivacijaAvtovlekeResponse_QNAME, AktivacijaAvtovlekeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktivacijaAvtovleke }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "aktivacijaAvtovleke")
    public JAXBElement<AktivacijaAvtovleke> createAktivacijaAvtovleke(AktivacijaAvtovleke value) {
        return new JAXBElement<AktivacijaAvtovleke>(_AktivacijaAvtovleke_QNAME, AktivacijaAvtovleke.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificiranjeNapake }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "identificiranjeNapake")
    public JAXBElement<IdentificiranjeNapake> createIdentificiranjeNapake(IdentificiranjeNapake value) {
        return new JAXBElement<IdentificiranjeNapake>(_IdentificiranjeNapake_QNAME, IdentificiranjeNapake.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpravljanjeNapake }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "odpravljanjeNapake")
    public JAXBElement<OdpravljanjeNapake> createOdpravljanjeNapake(OdpravljanjeNapake value) {
        return new JAXBElement<OdpravljanjeNapake>(_OdpravljanjeNapake_QNAME, OdpravljanjeNapake.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdpravljanjeNapakeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "odpravljanjeNapakeResponse")
    public JAXBElement<OdpravljanjeNapakeResponse> createOdpravljanjeNapakeResponse(OdpravljanjeNapakeResponse value) {
        return new JAXBElement<OdpravljanjeNapakeResponse>(_OdpravljanjeNapakeResponse_QNAME, OdpravljanjeNapakeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObvescanjeONapaki }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "obvescanjeONapaki")
    public JAXBElement<ObvescanjeONapaki> createObvescanjeONapaki(ObvescanjeONapaki value) {
        return new JAXBElement<ObvescanjeONapaki>(_ObvescanjeONapaki_QNAME, ObvescanjeONapaki.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObvescanjeONapakiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smart.road.si/tehnicnaPomoc", name = "obvescanjeONapakiResponse")
    public JAXBElement<ObvescanjeONapakiResponse> createObvescanjeONapakiResponse(ObvescanjeONapakiResponse value) {
        return new JAXBElement<ObvescanjeONapakiResponse>(_ObvescanjeONapakiResponse_QNAME, ObvescanjeONapakiResponse.class, null, value);
    }

}
