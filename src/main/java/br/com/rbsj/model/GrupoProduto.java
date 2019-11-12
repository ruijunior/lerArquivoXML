package br.com.rbsj.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Grupo_SLC0001_Prodt")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "grupo_produto")
public class GrupoProduto extends GenericEntity{

    @XmlElement(name = "CodProdt", required = true)
    private String codigoProduto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_Grupo_SLC0001_Prodt__Grupo_SLC0001_LiquidProdt"))
    @XmlElement(name = "Grupo_SLC0001_LiquidProdt", required = true)
    private GrupoLiquidacaoProduto grupoLiquidacaoProduto;

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public GrupoLiquidacaoProduto getGrupoLiquidacaoProduto() {
        return grupoLiquidacaoProduto;
    }

    public void setGrupoLiquidacaoProduto(GrupoLiquidacaoProduto grupoLiquidacaoProduto) {
        this.grupoLiquidacaoProduto = grupoLiquidacaoProduto;
    }

    @Override
    public String toString() {
        return this.codigoProduto + "[ " + this.grupoLiquidacaoProduto + "]";
    }
}
