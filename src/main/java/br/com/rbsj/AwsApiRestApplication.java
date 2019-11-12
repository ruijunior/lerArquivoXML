package br.com.rbsj;

import br.com.rbsj.model.Documento;
import br.com.rbsj.repository.DocumentoRepository;
import br.com.rbsj.service.LeitorXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class AwsApiRestApplication {

	@Autowired
	private DocumentoRepository documentoRepository;

	@PostConstruct
	public void start() throws IOException {
		File file = new File("SLC001.xml");
		LeitorXML leitor = new LeitorXML(Documento.class, file.getCanonicalPath());
		Documento documento = (Documento) leitor.executa();

		this.documentoRepository.save(documento);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AwsApiRestApplication.class, args);
	}


}
