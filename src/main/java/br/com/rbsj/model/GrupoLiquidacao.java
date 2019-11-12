package br.com.rbsj.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "Grupo_SLC0001_Liquid")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "grupo_liquidacao")
public class GrupoLiquidacao extends GenericEntity{

    @XmlElement(name = "DtLiquid", required = true)
    private Date dataLiquidacao;

    @XmlElement(name = "NumSeqCicloLiquid", required = true)
    private int numeroSequencialCicloLiquidacao;

    @OneToMany(cascade = CascadeType.ALL)
    @XmlElement(name = "Grupo_SLC0001_Prodt", required = true)
    private List<GrupoProduto> gruposProdutos;

    public Date getDataLiquidacao() {
        return dataLiquidacao;
    }

    public void setDataLiquidacao(Date dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public int getNumeroSequencialCicloLiquidacao() {
        return numeroSequencialCicloLiquidacao;
    }

    public void setNumeroSequencialCicloLiquidacao(int numeroSequencialCicloLiquidacao) {
        this.numeroSequencialCicloLiquidacao = numeroSequencialCicloLiquidacao;
    }

    public List<GrupoProduto> getGruposProdutos() {
        return gruposProdutos;
    }

    public void setGruposProdutos(List<GrupoProduto> gruposProdutos) {
        this.gruposProdutos = gruposProdutos;
    }
}
