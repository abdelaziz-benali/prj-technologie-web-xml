package abenali.edu.model;

import abenali.edu.helper.DateAdapter;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;

@XmlType(
        propOrder = {"dateReleve", "solde", "operations"}
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Releve {
    @XmlAttribute(name = "RIB", required = true)
    private String rib;


    @XmlElement(required = true)
    private double solde;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateReleve;
    private Operations operations;

    public Releve() {
    }

    public Releve(String rib, double solde, Date dateReleve, Operations operations) {
        this.rib = rib;
        this.solde = solde;
        this.dateReleve = dateReleve;
        this.operations = operations;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "rib='" + rib + '\'' +
                ", solde=" + solde +
                ", dateReleve='" + dateReleve + '\'' +
                ", operations=" + operations +
                '}';
    }
}
