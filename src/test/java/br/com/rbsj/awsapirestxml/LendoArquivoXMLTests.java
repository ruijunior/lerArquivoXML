package br.com.rbsj.awsapirestxml;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import br.com.rbsj.model.Documento;
import br.com.rbsj.service.LeitorXML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class LendoArquivoXMLTests {


    private Documento documento;

    @BeforeEach
    public void setup() throws IOException {
        File file = new File("SLC001.xml");
        LeitorXML leitor = new LeitorXML(Documento.class, file.getCanonicalPath());
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
