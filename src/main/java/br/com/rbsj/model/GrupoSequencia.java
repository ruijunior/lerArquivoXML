package br.com.rbsj.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Grupo_Seq")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "grupo_sequencia")
public class GrupoSequencia extends GenericEntity{

    @XmlElement(name = "NumSeq", required = true)
    private int numeroSequencia;

    @XmlElement(name = "IndrCont", required = true)
    private String indicadorContinuacao;

    public int getNumeroSequencia() {
        return numeroSequencia;
    }

    public void setNumeroSequencia(int numeroSequencia) {
        this.numeroSequencia = numeroSequencia;
    }

    public String getIndicadorContinuacao() {
        return indicadorContinuacao;
    }

    public void setIndicadorContinuacao(String indicadorContinuacao) {
        this.indicadorContinuacao = indicadorContinuacao;
    }
}
