package br.com.rbsj.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BCMSG")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "segmento_controle")
public class SegmentoControle extends GenericEntity{

    @XmlElement(name = "IdentdEmissor", required = true)
    private String identificadorEmissor;

    @XmlElement(name = "IdentdDestinatario", required = true)
    private String identifcadorDestinatario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_BCMSG_Grupo_Seq"))
    @XmlElement(name = "Grupo_Seq", required = true)
    private GrupoSequencia grupoSequencia;

    @XmlElement(name = "DomSist", required = true)
    private String dominioSistema;

    @XmlElement(name = "NUOp", required = true)
    private String  numeroUnicoOperacao;

    public String getIdentificadorEmissor() {
        return identificadorEmissor;
    }

    public void setIdentificadorEmissor(String identificadorEmissor) {
        this.identificadorEmissor = identificadorEmissor;
    }

    public String getIdentifcadorDestinatario() {
        return identifcadorDestinatario;
    }

    public void setIdentifcadorDestinatario(String identifcadorDestinatario) {
        this.identifcadorDestinatario = identifcadorDestinatario;
    }

    public String getDominioSistema() {
        return dominioSistema;
    }

    public void setDominioSistema(String dominioSistema) {
        this.dominioSistema = dominioSistema;
    }

    public String getNumeroUnicoOperacao() {
        return numeroUnicoOperacao;
    }

    public void setNumeroUnicoOperacao(String numeroUnicoOperacao) {
        this.numeroUnicoOperacao = numeroUnicoOperacao;
    }

    public GrupoSequencia getGrupoSequencia() {
        return grupoSequencia;
    }

    public void setGrupoSequencia(GrupoSequencia grupoSequencia) {
        this.grupoSequencia = grupoSequencia;
    }
}
