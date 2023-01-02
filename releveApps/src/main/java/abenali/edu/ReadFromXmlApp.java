package abenali.edu;

import abenali.edu.model.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class ReadFromXmlApp {
    static final ClassLoader loader = ReadFromXmlApp.class.getClassLoader();
    public static void main(String[] args) throws JAXBException {
        System.out.println("Hello world!");

        JAXBContext context= JAXBContext.newInstance(Releve.class);
        /**
         * unmarshalling: xlm file -> java objects
         */
        System.out.println("unmarshalling: xlm file -> java objects ... ");
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Releve relevefromXml=(Releve) unmarshaller.unmarshal(new File(loader.getResource("xml/releve.xml").getFile()));
        System.out.println(relevefromXml);

    }
}