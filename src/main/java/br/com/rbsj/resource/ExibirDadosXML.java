package br.com.rbsj.resource;

import br.com.rbsj.model.Documento;
import br.com.rbsj.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dados")
public class ExibirDadosXML {

    @Autowired
    private DocumentoRepository documentoRepository;

    @GetMapping
    public List<Documento> exibirDados(){
        return documentoRepository.findAll();
    }
}
