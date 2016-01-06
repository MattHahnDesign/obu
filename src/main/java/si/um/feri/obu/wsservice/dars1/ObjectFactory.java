
package si.um.feri.obu.wsservice.dars1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the si.um.feri.obu.wsservice.dars1 package. 
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

    private final static QName _VozniPas_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "VozniPas");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _Prehod_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Prehod");
    private final static QName _Avtocesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Avtocesta");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Zapora_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Zapora");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfVozniPas_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "ArrayOfVozniPas");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _BencinskaCrpalka_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "BencinskaCrpalka");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _VremenskaNapoved_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "VremenskaNapoved");
    private final static QName _ArrayOfZapora_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "ArrayOfZapora");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Lokacija_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Lokacija");
    private final static QName _ZaporaSmer_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Smer");
    private final static QName _ZaporaVrsta_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Vrsta");
    private final static QName _ZaporaOpombe_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Opombe");
    private final static QName _PridobiVremenskoNapovedAvtocesta_QNAME = new QName("http://um.si/SOA/v2/12/2015", "avtocesta");
    private final static QName _VozniPasStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Status");
    private final static QName _VozniPasVrstaPrometa_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "VrstaPrometa");
    private final static QName _AvtocestaVozniPasovi_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "VozniPasovi");
    private final static QName _AvtocestaOznaka_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Oznaka");
    private final static QName _PridobiNaslednjoBencinskoCrpalkoLokacija_QNAME = new QName("http://um.si/SOA/v2/12/2015", "lokacija");
    private final static QName _PridobiVseZaporeResponsePridobiVseZaporeResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiVseZaporeResult");
    private final static QName _PridobiZaporeNaPotiResponsePridobiZaporeNaPotiResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiZaporeNaPotiResult");
    private final static QName _VremenskaNapovedOpis_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Opis");
    private final static QName _PridobiNaslednjoBencinskoCrpalkoNaNazivResponsePridobiNaslednjoBencinskoCrpalkoNaNazivResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiNaslednjoBencinskoCrpalkoNaNazivResult");
    private final static QName _BencinskaCrpalkaIme_QNAME = new QName("http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", "Ime");
    private final static QName _StanjePrehodaResponseStanjePrehodaResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "StanjePrehodaResult");
    private final static QName _PridobiZaporeResponsePridobiZaporeResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiZaporeResult");
    private final static QName _PridobiNaslednjoBencinskoCrpalkoNaNazivNaziv_QNAME = new QName("http://um.si/SOA/v2/12/2015", "naziv");
    private final static QName _StanjePrehodaIme_QNAME = new QName("http://um.si/SOA/v2/12/2015", "ime");
    private final static QName _PridobiVremenskoNapovedResponsePridobiVremenskoNapovedResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiVremenskoNapovedResult");
    private final static QName _PridobiVremenskoNapovedNaPotiResponsePridobiVremenskoNapovedNaPotiResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiVremenskoNapovedNaPotiResult");
    private final static QName _PridobiNaslednjoBencinskoCrpalkoResponsePridobiNaslednjoBencinskoCrpalkoResult_QNAME = new QName("http://um.si/SOA/v2/12/2015", "PridobiNaslednjoBencinskoCrpalkoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: si.um.feri.obu.wsservice.dars1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PridobiZaporeNaPotiResponse }
     * 
     */
    public PridobiZaporeNaPotiResponse createPridobiZaporeNaPotiResponse() {
        return new PridobiZaporeNaPotiResponse();
    }

    /**
     * Create an instance of {@link ArrayOfZapora }
     * 
     */
    public ArrayOfZapora createArrayOfZapora() {
        return new ArrayOfZapora();
    }

    /**
     * Create an instance of {@link PridobiZaporeNaPoti }
     * 
     */
    public PridobiZaporeNaPoti createPridobiZaporeNaPoti() {
        return new PridobiZaporeNaPoti();
    }

    /**
     * Create an instance of {@link Lokacija }
     * 
     */
    public Lokacija createLokacija() {
        return new Lokacija();
    }

    /**
     * Create an instance of {@link StanjePrehoda }
     * 
     */
    public StanjePrehoda createStanjePrehoda() {
        return new StanjePrehoda();
    }

    /**
     * Create an instance of {@link PridobiVremenskoNapovedNaPoti }
     * 
     */
    public PridobiVremenskoNapovedNaPoti createPridobiVremenskoNapovedNaPoti() {
        return new PridobiVremenskoNapovedNaPoti();
    }

    /**
     * Create an instance of {@link StanjePrehodaResponse }
     * 
     */
    public StanjePrehodaResponse createStanjePrehodaResponse() {
        return new StanjePrehodaResponse();
    }

    /**
     * Create an instance of {@link Prehod }
     * 
     */
    public Prehod createPrehod() {
        return new Prehod();
    }

    /**
     * Create an instance of {@link PridobiVremenskoNapovedResponse }
     * 
     */
    public PridobiVremenskoNapovedResponse createPridobiVremenskoNapovedResponse() {
        return new PridobiVremenskoNapovedResponse();
    }

    /**
     * Create an instance of {@link VremenskaNapoved }
     * 
     */
    public VremenskaNapoved createVremenskaNapoved() {
        return new VremenskaNapoved();
    }

    /**
     * Create an instance of {@link PridobiNaslednjoBencinskoCrpalkoNaNaziv }
     * 
     */
    public PridobiNaslednjoBencinskoCrpalkoNaNaziv createPridobiNaslednjoBencinskoCrpalkoNaNaziv() {
        return new PridobiNaslednjoBencinskoCrpalkoNaNaziv();
    }

    /**
     * Create an instance of {@link PridobiZapore }
     * 
     */
    public PridobiZapore createPridobiZapore() {
        return new PridobiZapore();
    }

    /**
     * Create an instance of {@link Avtocesta }
     * 
     */
    public Avtocesta createAvtocesta() {
        return new Avtocesta();
    }

    /**
     * Create an instance of {@link PridobiZaporeResponse }
     * 
     */
    public PridobiZaporeResponse createPridobiZaporeResponse() {
        return new PridobiZaporeResponse();
    }

    /**
     * Create an instance of {@link PridobiVremenskoNapovedNaPotiResponse }
     * 
     */
    public PridobiVremenskoNapovedNaPotiResponse createPridobiVremenskoNapovedNaPotiResponse() {
        return new PridobiVremenskoNapovedNaPotiResponse();
    }

    /**
     * Create an instance of {@link PridobiNaslednjoBencinskoCrpalkoNaNazivResponse }
     * 
     */
    public PridobiNaslednjoBencinskoCrpalkoNaNazivResponse createPridobiNaslednjoBencinskoCrpalkoNaNazivResponse() {
        return new PridobiNaslednjoBencinskoCrpalkoNaNazivResponse();
    }

    /**
     * Create an instance of {@link BencinskaCrpalka }
     * 
     */
    public BencinskaCrpalka createBencinskaCrpalka() {
        return new BencinskaCrpalka();
    }

    /**
     * Create an instance of {@link PridobiNaslednjoBencinskoCrpalko }
     * 
     */
    public PridobiNaslednjoBencinskoCrpalko createPridobiNaslednjoBencinskoCrpalko() {
        return new PridobiNaslednjoBencinskoCrpalko();
    }

    /**
     * Create an instance of {@link PridobiVseZapore }
     * 
     */
    public PridobiVseZapore createPridobiVseZapore() {
        return new PridobiVseZapore();
    }

    /**
     * Create an instance of {@link PridobiVremenskoNapoved }
     * 
     */
    public PridobiVremenskoNapoved createPridobiVremenskoNapoved() {
        return new PridobiVremenskoNapoved();
    }

    /**
     * Create an instance of {@link PridobiNaslednjoBencinskoCrpalkoResponse }
     * 
     */
    public PridobiNaslednjoBencinskoCrpalkoResponse createPridobiNaslednjoBencinskoCrpalkoResponse() {
        return new PridobiNaslednjoBencinskoCrpalkoResponse();
    }

    /**
     * Create an instance of {@link PridobiVseZaporeResponse }
     * 
     */
    public PridobiVseZaporeResponse createPridobiVseZaporeResponse() {
        return new PridobiVseZaporeResponse();
    }

    /**
     * Create an instance of {@link VozniPas }
     * 
     */
    public VozniPas createVozniPas() {
        return new VozniPas();
    }

    /**
     * Create an instance of {@link ArrayOfVozniPas }
     * 
     */
    public ArrayOfVozniPas createArrayOfVozniPas() {
        return new ArrayOfVozniPas();
    }

    /**
     * Create an instance of {@link Zapora }
     * 
     */
    public Zapora createZapora() {
        return new Zapora();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VozniPas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "VozniPas")
    public JAXBElement<VozniPas> createVozniPas(VozniPas value) {
        return new JAXBElement<VozniPas>(_VozniPas_QNAME, VozniPas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prehod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Prehod")
    public JAXBElement<Prehod> createPrehod(Prehod value) {
        return new JAXBElement<Prehod>(_Prehod_QNAME, Prehod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Avtocesta")
    public JAXBElement<Avtocesta> createAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_Avtocesta_QNAME, Avtocesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zapora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Zapora")
    public JAXBElement<Zapora> createZapora(Zapora value) {
        return new JAXBElement<Zapora>(_Zapora_QNAME, Zapora.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVozniPas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "ArrayOfVozniPas")
    public JAXBElement<ArrayOfVozniPas> createArrayOfVozniPas(ArrayOfVozniPas value) {
        return new JAXBElement<ArrayOfVozniPas>(_ArrayOfVozniPas_QNAME, ArrayOfVozniPas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BencinskaCrpalka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "BencinskaCrpalka")
    public JAXBElement<BencinskaCrpalka> createBencinskaCrpalka(BencinskaCrpalka value) {
        return new JAXBElement<BencinskaCrpalka>(_BencinskaCrpalka_QNAME, BencinskaCrpalka.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VremenskaNapoved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "VremenskaNapoved")
    public JAXBElement<VremenskaNapoved> createVremenskaNapoved(VremenskaNapoved value) {
        return new JAXBElement<VremenskaNapoved>(_VremenskaNapoved_QNAME, VremenskaNapoved.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "ArrayOfZapora")
    public JAXBElement<ArrayOfZapora> createArrayOfZapora(ArrayOfZapora value) {
        return new JAXBElement<ArrayOfZapora>(_ArrayOfZapora_QNAME, ArrayOfZapora.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Lokacija")
    public JAXBElement<Lokacija> createLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_Lokacija_QNAME, Lokacija.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Smer", scope = Zapora.class)
    public JAXBElement<String> createZaporaSmer(String value) {
        return new JAXBElement<String>(_ZaporaSmer_QNAME, String.class, Zapora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Avtocesta", scope = Zapora.class)
    public JAXBElement<Avtocesta> createZaporaAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_Avtocesta_QNAME, Avtocesta.class, Zapora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Vrsta", scope = Zapora.class)
    public JAXBElement<String> createZaporaVrsta(String value) {
        return new JAXBElement<String>(_ZaporaVrsta_QNAME, String.class, Zapora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Lokacija", scope = Zapora.class)
    public JAXBElement<Lokacija> createZaporaLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_Lokacija_QNAME, Lokacija.class, Zapora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Opombe", scope = Zapora.class)
    public JAXBElement<String> createZaporaOpombe(String value) {
        return new JAXBElement<String>(_ZaporaOpombe_QNAME, String.class, Zapora.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "avtocesta", scope = PridobiVremenskoNapoved.class)
    public JAXBElement<Avtocesta> createPridobiVremenskoNapovedAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_PridobiVremenskoNapovedAvtocesta_QNAME, Avtocesta.class, PridobiVremenskoNapoved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Smer", scope = VozniPas.class)
    public JAXBElement<String> createVozniPasSmer(String value) {
        return new JAXBElement<String>(_ZaporaSmer_QNAME, String.class, VozniPas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Status", scope = VozniPas.class)
    public JAXBElement<String> createVozniPasStatus(String value) {
        return new JAXBElement<String>(_VozniPasStatus_QNAME, String.class, VozniPas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Avtocesta", scope = VozniPas.class)
    public JAXBElement<Avtocesta> createVozniPasAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_Avtocesta_QNAME, Avtocesta.class, VozniPas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "VrstaPrometa", scope = VozniPas.class)
    public JAXBElement<String> createVozniPasVrstaPrometa(String value) {
        return new JAXBElement<String>(_VozniPasVrstaPrometa_QNAME, String.class, VozniPas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Status", scope = Avtocesta.class)
    public JAXBElement<String> createAvtocestaStatus(String value) {
        return new JAXBElement<String>(_VozniPasStatus_QNAME, String.class, Avtocesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVozniPas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "VozniPasovi", scope = Avtocesta.class)
    public JAXBElement<ArrayOfVozniPas> createAvtocestaVozniPasovi(ArrayOfVozniPas value) {
        return new JAXBElement<ArrayOfVozniPas>(_AvtocestaVozniPasovi_QNAME, ArrayOfVozniPas.class, Avtocesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Oznaka", scope = Avtocesta.class)
    public JAXBElement<String> createAvtocestaOznaka(String value) {
        return new JAXBElement<String>(_AvtocestaOznaka_QNAME, String.class, Avtocesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "avtocesta", scope = PridobiZapore.class)
    public JAXBElement<Avtocesta> createPridobiZaporeAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_PridobiVremenskoNapovedAvtocesta_QNAME, Avtocesta.class, PridobiZapore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "lokacija", scope = PridobiNaslednjoBencinskoCrpalko.class)
    public JAXBElement<Lokacija> createPridobiNaslednjoBencinskoCrpalkoLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_PridobiNaslednjoBencinskoCrpalkoLokacija_QNAME, Lokacija.class, PridobiNaslednjoBencinskoCrpalko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiVseZaporeResult", scope = PridobiVseZaporeResponse.class)
    public JAXBElement<ArrayOfZapora> createPridobiVseZaporeResponsePridobiVseZaporeResult(ArrayOfZapora value) {
        return new JAXBElement<ArrayOfZapora>(_PridobiVseZaporeResponsePridobiVseZaporeResult_QNAME, ArrayOfZapora.class, PridobiVseZaporeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiZaporeNaPotiResult", scope = PridobiZaporeNaPotiResponse.class)
    public JAXBElement<ArrayOfZapora> createPridobiZaporeNaPotiResponsePridobiZaporeNaPotiResult(ArrayOfZapora value) {
        return new JAXBElement<ArrayOfZapora>(_PridobiZaporeNaPotiResponsePridobiZaporeNaPotiResult_QNAME, ArrayOfZapora.class, PridobiZaporeNaPotiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Avtocesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Avtocesta", scope = VremenskaNapoved.class)
    public JAXBElement<Avtocesta> createVremenskaNapovedAvtocesta(Avtocesta value) {
        return new JAXBElement<Avtocesta>(_Avtocesta_QNAME, Avtocesta.class, VremenskaNapoved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Opis", scope = VremenskaNapoved.class)
    public JAXBElement<String> createVremenskaNapovedOpis(String value) {
        return new JAXBElement<String>(_VremenskaNapovedOpis_QNAME, String.class, VremenskaNapoved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Lokacija", scope = VremenskaNapoved.class)
    public JAXBElement<Lokacija> createVremenskaNapovedLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_Lokacija_QNAME, Lokacija.class, VremenskaNapoved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BencinskaCrpalka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiNaslednjoBencinskoCrpalkoNaNazivResult", scope = PridobiNaslednjoBencinskoCrpalkoNaNazivResponse.class)
    public JAXBElement<BencinskaCrpalka> createPridobiNaslednjoBencinskoCrpalkoNaNazivResponsePridobiNaslednjoBencinskoCrpalkoNaNazivResult(BencinskaCrpalka value) {
        return new JAXBElement<BencinskaCrpalka>(_PridobiNaslednjoBencinskoCrpalkoNaNazivResponsePridobiNaslednjoBencinskoCrpalkoNaNazivResult_QNAME, BencinskaCrpalka.class, PridobiNaslednjoBencinskoCrpalkoNaNazivResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Ime", scope = BencinskaCrpalka.class)
    public JAXBElement<String> createBencinskaCrpalkaIme(String value) {
        return new JAXBElement<String>(_BencinskaCrpalkaIme_QNAME, String.class, BencinskaCrpalka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Lokacija", scope = BencinskaCrpalka.class)
    public JAXBElement<Lokacija> createBencinskaCrpalkaLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_Lokacija_QNAME, Lokacija.class, BencinskaCrpalka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prehod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "StanjePrehodaResult", scope = StanjePrehodaResponse.class)
    public JAXBElement<Prehod> createStanjePrehodaResponseStanjePrehodaResult(Prehod value) {
        return new JAXBElement<Prehod>(_StanjePrehodaResponseStanjePrehodaResult_QNAME, Prehod.class, StanjePrehodaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfZapora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiZaporeResult", scope = PridobiZaporeResponse.class)
    public JAXBElement<ArrayOfZapora> createPridobiZaporeResponsePridobiZaporeResult(ArrayOfZapora value) {
        return new JAXBElement<ArrayOfZapora>(_PridobiZaporeResponsePridobiZaporeResult_QNAME, ArrayOfZapora.class, PridobiZaporeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "lokacija", scope = PridobiZaporeNaPoti.class)
    public JAXBElement<Lokacija> createPridobiZaporeNaPotiLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_PridobiNaslednjoBencinskoCrpalkoLokacija_QNAME, Lokacija.class, PridobiZaporeNaPoti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "lokacija", scope = PridobiNaslednjoBencinskoCrpalkoNaNaziv.class)
    public JAXBElement<Lokacija> createPridobiNaslednjoBencinskoCrpalkoNaNazivLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_PridobiNaslednjoBencinskoCrpalkoLokacija_QNAME, Lokacija.class, PridobiNaslednjoBencinskoCrpalkoNaNaziv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "naziv", scope = PridobiNaslednjoBencinskoCrpalkoNaNaziv.class)
    public JAXBElement<String> createPridobiNaslednjoBencinskoCrpalkoNaNazivNaziv(String value) {
        return new JAXBElement<String>(_PridobiNaslednjoBencinskoCrpalkoNaNazivNaziv_QNAME, String.class, PridobiNaslednjoBencinskoCrpalkoNaNaziv.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "ime", scope = StanjePrehoda.class)
    public JAXBElement<String> createStanjePrehodaIme(String value) {
        return new JAXBElement<String>(_StanjePrehodaIme_QNAME, String.class, StanjePrehoda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VremenskaNapoved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiVremenskoNapovedResult", scope = PridobiVremenskoNapovedResponse.class)
    public JAXBElement<VremenskaNapoved> createPridobiVremenskoNapovedResponsePridobiVremenskoNapovedResult(VremenskaNapoved value) {
        return new JAXBElement<VremenskaNapoved>(_PridobiVremenskoNapovedResponsePridobiVremenskoNapovedResult_QNAME, VremenskaNapoved.class, PridobiVremenskoNapovedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VremenskaNapoved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiVremenskoNapovedNaPotiResult", scope = PridobiVremenskoNapovedNaPotiResponse.class)
    public JAXBElement<VremenskaNapoved> createPridobiVremenskoNapovedNaPotiResponsePridobiVremenskoNapovedNaPotiResult(VremenskaNapoved value) {
        return new JAXBElement<VremenskaNapoved>(_PridobiVremenskoNapovedNaPotiResponsePridobiVremenskoNapovedNaPotiResult_QNAME, VremenskaNapoved.class, PridobiVremenskoNapovedNaPotiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "lokacija", scope = PridobiVremenskoNapovedNaPoti.class)
    public JAXBElement<Lokacija> createPridobiVremenskoNapovedNaPotiLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_PridobiNaslednjoBencinskoCrpalkoLokacija_QNAME, Lokacija.class, PridobiVremenskoNapovedNaPoti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Ime", scope = Prehod.class)
    public JAXBElement<String> createPrehodIme(String value) {
        return new JAXBElement<String>(_BencinskaCrpalkaIme_QNAME, String.class, Prehod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Vrsta", scope = Prehod.class)
    public JAXBElement<String> createPrehodVrsta(String value) {
        return new JAXBElement<String>(_ZaporaVrsta_QNAME, String.class, Prehod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lokacija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SOAProject.DARS.DataContract", name = "Lokacija", scope = Prehod.class)
    public JAXBElement<Lokacija> createPrehodLokacija(Lokacija value) {
        return new JAXBElement<Lokacija>(_Lokacija_QNAME, Lokacija.class, Prehod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BencinskaCrpalka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.si/SOA/v2/12/2015", name = "PridobiNaslednjoBencinskoCrpalkoResult", scope = PridobiNaslednjoBencinskoCrpalkoResponse.class)
    public JAXBElement<BencinskaCrpalka> createPridobiNaslednjoBencinskoCrpalkoResponsePridobiNaslednjoBencinskoCrpalkoResult(BencinskaCrpalka value) {
        return new JAXBElement<BencinskaCrpalka>(_PridobiNaslednjoBencinskoCrpalkoResponsePridobiNaslednjoBencinskoCrpalkoResult_QNAME, BencinskaCrpalka.class, PridobiNaslednjoBencinskoCrpalkoResponse.class, value);
    }

}
