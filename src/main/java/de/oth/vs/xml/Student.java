package de.oth.vs.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlAttribute
    private int matrikelNr;
    private String vorname;
    private String nachname;
    private int ects;
    private Adresse anschrift;
    
    public Student() {}

    public Student(int sozialversicherungsNummer, String vorname, String nachname, int ects, Adresse anschrift) {
        this.matrikelNr = sozialversicherungsNummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.ects = ects;
        this.anschrift = anschrift;
    }

    @Override
    public String toString() {
        return "Student{" + "matrikelNr=" + matrikelNr + ", vorname=" + vorname + ", nachname=" + nachname + ", ects=" + ects + ", anschrift=" + anschrift + '}';
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    
}
