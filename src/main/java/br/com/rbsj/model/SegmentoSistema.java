package br.com.rbsj.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SISMSG  ")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "segmento_sistema")
public class SegmentoSistema extends GenericEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_SISMSG__SLC0001"))
    @XmlElement(name = "SLC0001", required = true)
    private LiquidacaoFinanceiraMultilateral liquidacaoFinanceiraMultilateral;

    public LiquidacaoFinanceiraMultilateral getLiquidacaoFinanceiraMultilateral() {
        return liquidacaoFinanceiraMultilateral;
    }

    public void setLiquidacaoFinanceiraMultilateral(LiquidacaoFinanceiraMultilateral liquidacaoFinanceiraMultilateral) {
        this.liquidacaoFinanceiraMultilateral = liquidacaoFinanceiraMultilateral;
    }
}


