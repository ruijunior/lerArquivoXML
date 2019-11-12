package br.com.rbsj.awsapirestxml;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import br.com.rbsj.model.Documento;
import br.com.rbsj.service.LeitorXML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LendoArquivoXMLTests {

    private String arquivoXML = "src/main/resources/SLC001.xml";
    private Documento documento;

    @BeforeEach
    public void setup(){
        LeitorXML leitor = new LeitorXML(Documento.class, arquivoXML);
        documento = (Documento) leitor.executa();
    }

    @Test
    public void conseguiu_ler_o_arquivo(){
        assertThat(documento, is(notNullValue()));
    }

    @Test
    public void leu_a_tag_documento(){
        assertThat(documento.getSegmentoControle(), is(notNullValue()));
        assertThat(documento.getSegmentoSistema(), is(notNullValue()));
    }

    @Test
    public void total_lista_grupo_produto(){
        int tamanhoListaGrupoProduto = documento.getSegmentoSistema().getLiquidacaoFinanceiraMultilateral().getGrupoLiquidacao().getGruposProdutos().size();
        assertThat(tamanhoListaGrupoProduto, equalTo(4));
    }

}
