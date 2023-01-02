package abenali.edu.model;

import abenali.edu.helper.DateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlAttribute
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateDebut;
    @XmlAttribute
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateFin;
    @XmlElement(name = "operation")
    private List<Operation> operationList;

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operationList = new ArrayList<>();
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut='" + dateDebut + '\'' +
                ", dateFin='" + dateFin + '\'' +
                ", operationList=" + operationList +
                '}';
    }
}
