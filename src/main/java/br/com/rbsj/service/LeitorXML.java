package br.com.rbsj.service;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class LeitorXML {

    private Class clazz;
    private String nomeArquivo;

    public LeitorXML(Class clazz, String nomeArquivo) {
        this.clazz = clazz;
        this.nomeArquivo = nomeArquivo;
    }

    public Object executa(){
        JAXBContext context = null;

        try {
            context = JAXBContext.newInstance(clazz);
            XMLInputFactory xif = XMLInputFactory.newFactory();
            xif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false);

            FileInputStream is = new FileInputStream(nomeArquivo);

            XMLStreamReader xmlStreamReader = xif.createXMLStreamReader(is);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(xmlStreamReader);

        } catch (JAXBException | FileNotFoundException | XMLStreamException  e) {
            e.printStackTrace();
        }

        return null;
        

    }

}
