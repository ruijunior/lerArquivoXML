package br.com.rbsj.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name = "Grupo_SLC0001_LiquidProdt")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "grupo_liquidacao_produto")
public class GrupoLiquidacaoProduto extends GenericEntity{

    @XmlElement(name = "IdentdLinhaBilat", required = true)
    private String identificadorLinhaBilateral;

    @XmlElement(name = "CNPJNLiqdantDebtd", required = true)
    private String cnpjNaoLiquidanteDebitado;

    @XmlElement(name = "ISPBIFDebtd", required = true)
    private String iSPBIFDebitada;

    @XmlElement(name = "NomCliDebtd", required = true)
    private String nomeClienteDebitado;

    @XmlElement(name = "TpTranscSLC", required = true)
    private String tipoTransacaoSLC;

    @XmlElement(name = "VlrLanc", required = true)
    private BigDecimal valorLancamento;

    @XmlElement(name = "CNPJNLiqdantCredtd", required = true)
    private String cnpjNaoLiquidanteCreditado;

    @XmlElement(name = "TpDeb_Cred", required = true)
    private String tipoDebitoCredito;

    @XmlElement(name = "ISPBIFCredtd", required = true)
    private String iSPBIFCreditada;

    @XmlElement(name = "NomCliCredtd", required = true)
    private String nomeClienteCreditado;

    public String getIdentificadorLinhaBilateral() {
        return identificadorLinhaBilateral;
    }

    public void setIdentificadorLinhaBilateral(String identificadorLinhaBilateral) {
        this.identificadorLinhaBilateral = identificadorLinhaBilateral;
    }

    public String getCnpjNaoLiquidanteDebitado() {
        return cnpjNaoLiquidanteDebitado;
    }

    public void setCnpjNaoLiquidanteDebitado(String cnpjNaoLiquidanteDebitado) {
        this.cnpjNaoLiquidanteDebitado = cnpjNaoLiquidanteDebitado;
    }

    public String getiSPBIFDebitada() {
        return iSPBIFDebitada;
    }

    public void setiSPBIFDebitada(String iSPBIFDebitada) {
        this.iSPBIFDebitada = iSPBIFDebitada;
    }

    public String getNomeClienteDebitado() {
        return nomeClienteDebitado;
    }

    public void setNomeClienteDebitado(String nomeClienteDebitado) {
        this.nomeClienteDebitado = nomeClienteDebitado;
    }

    public String getTipoTransacaoSLC() {
        return tipoTransacaoSLC;
    }

    public void setTipoTransacaoSLC(String tipoTransacaoSLC) {
        this.tipoTransacaoSLC = tipoTransacaoSLC;
    }

    public BigDecimal getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(BigDecimal valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    public String getCnpjNaoLiquidanteCreditado() {
        return cnpjNaoLiquidanteCreditado;
    }

    public void setCnpjNaoLiquidanteCreditado(String cnpjNaoLiquidanteCreditado) {
        this.cnpjNaoLiquidanteCreditado = cnpjNaoLiquidanteCreditado;
    }

    public String getTipoDebitoCredito() {
        return tipoDebitoCredito;
    }

    public void setTipoDebitoCredito(String tipoDebitoCredito) {
        this.tipoDebitoCredito = tipoDebitoCredito;
    }

    public String getiSPBIFCreditada() {
        return iSPBIFCreditada;
    }

    public void setiSPBIFCreditada(String iSPBIFCreditada) {
        this.iSPBIFCreditada = iSPBIFCreditada;
    }

    public String getNomeClienteCreditado() {
        return nomeClienteCreditado;
    }

    public void setNomeClienteCreditado(String nomeClienteCreditado) {
        this.nomeClienteCreditado = nomeClienteCreditado;
    }

    @Override
    public String toString() {
        return this.cnpjNaoLiquidanteCreditado + " - " +
               this.cnpjNaoLiquidanteDebitado + " - " +
               this.identificadorLinhaBilateral + " - " +
               this.iSPBIFCreditada + " - " +
               this.iSPBIFDebitada + " - " +
               this.nomeClienteCreditado + " - " +
               this.nomeClienteDebitado + " - " +
               this.tipoDebitoCredito + " - " +
               this.tipoTransacaoSLC + " - " +
               this.valorLancamento;
    }
}
