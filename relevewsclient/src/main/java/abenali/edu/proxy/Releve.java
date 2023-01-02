
package abenali.edu.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="operations" type="{http://webservice.edu.abenali/}operations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RIB" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "operations"
})
public class Releve {

    @XmlElement(required = true)
    protected String dateReleve;
    protected double solde;
    protected Operations operations;
    @XmlAttribute(name = "RIB", required = true)
    protected String rib;

    /**
     * Gets the value of the dateReleve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReleve() {
        return dateReleve;
    }

    /**
     * Sets the value of the dateReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReleve(String value) {
        this.dateReleve = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the rib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIB() {
        return rib;
    }

    /**
     * Sets the value of the rib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIB(String value) {
        this.rib = value;
    }

}
