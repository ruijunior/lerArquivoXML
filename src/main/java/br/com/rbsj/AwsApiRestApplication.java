package br.com.rbsj;

import br.com.rbsj.model.Documento;
import br.com.rbsj.service.LeitorXML;
import br.com.rbsj.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AwsApiRestApplication {

	@Autowired
	private DocumentoRepository documentoRepository;

	private String arquivoXML = "src/main/resources/SLC001.xml";

	@PostConstruct
	public void start() {
		LeitorXML leitor = new LeitorXML(Documento.class, arquivoXML);
		Documento documento = (Documento) leitor.executa();

		this.documentoRepository.save(documento);
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsApiRestApplication.class, args);
	}

}
