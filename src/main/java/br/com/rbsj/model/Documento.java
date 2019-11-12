package br.com.rbsj.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DOC")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "documento")
public class Documento extends GenericEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_DOC_BCMSG"))
    @XmlElement(name = "BCMSG", required = true)
    private SegmentoControle segmentoControle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_DOC_SISMSG"))
    @XmlElement(name = "SISMSG", required = true)
    private SegmentoSistema segmentoSistema;


    public SegmentoControle getSegmentoControle() {
        return segmentoControle;
    }

    public void setSegmentoControle(SegmentoControle segmentoControle) {
        this.segmentoControle = segmentoControle;
    }

    public SegmentoSistema getSegmentoSistema() {
        return segmentoSistema;
    }

    public void setSegmentoSistema(SegmentoSistema segmentoSistema) {
        this.segmentoSistema = segmentoSistema;
    }
}
