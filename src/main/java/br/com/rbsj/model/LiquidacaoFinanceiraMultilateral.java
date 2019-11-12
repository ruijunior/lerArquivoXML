package br.com.rbsj.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "SLC0001")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "liquidacao_financeira_multilateral")
public class LiquidacaoFinanceiraMultilateral extends GenericEntity{

    @XmlElement(name = "CodMsg", required = true)
    private String codigoMensagem;

    @XmlElement(name = "NumCtrlSLC", required = true)
    private String numeroControleSLC;

    @XmlElement(name = "ISPBIF", required = true)
    private String iSPBIF;

    @XmlElement(name = "TpInf", required = true)
    private String tipoInformacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_SLC0001__Grupo_SLC0001_Liquid"))
    @XmlElement(name = "Grupo_SLC0001_Liquid", required = true)
    private GrupoLiquidacao grupoLiquidacao;

    @XmlElement(name = "DtMovto", required = true)
    private Date dataMovimento;

    @XmlElement(name = "DtHrSLC", required = true)
    private Date dataHoraSLC;

    public String getCodigoMensagem() {
        return codigoMensagem;
    }

    public void setCodigoMensagem(String codigoMensagem) {
        this.codigoMensagem = codigoMensagem;
    }

    public String getNumeroControleSLC() {
        return numeroControleSLC;
    }

    public void setNumeroControleSLC(String numeroControleSLC) {
        this.numeroControleSLC = numeroControleSLC;
    }

    public String getiSPBIF() {
        return iSPBIF;
    }

    public void setiSPBIF(String iSPBIF) {
        this.iSPBIF = iSPBIF;
    }

    public String getTipoInformacao() {
        return tipoInformacao;
    }

    public void setTipoInformacao(String tipoInformacao) {
        this.tipoInformacao = tipoInformacao;
    }

    public GrupoLiquidacao getGrupoLiquidacao() {
        return grupoLiquidacao;
    }

    public void setGrupoLiquidacao(GrupoLiquidacao grupoLiquidacao) {
        this.grupoLiquidacao = grupoLiquidacao;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Date getDataHoraSLC() {
        return dataHoraSLC;
    }

    public void setDataHoraSLC(Date dataHoraSLC) {
        this.dataHoraSLC = dataHoraSLC;
    }
}
