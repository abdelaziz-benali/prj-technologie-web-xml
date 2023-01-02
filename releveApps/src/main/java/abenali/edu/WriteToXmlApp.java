package abenali.edu;

import abenali.edu.model.Operation;
import abenali.edu.model.Operations;
import abenali.edu.model.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteToXmlApp {
    static final ClassLoader loader = ReadFromXmlApp.class.getClassLoader();
    public static void main(String[] args) throws JAXBException, ParseException {
        /**
         * marshalling: java object -> xml file
         */
        System.out.println("marshalling: java object -> xml file ... ");
        JAXBContext context= JAXBContext.newInstance(Releve.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        Releve releveToXml= createReleve();
        marshaller.marshal(releveToXml,new File(loader.getResource("filestore/xml/to/releve"+releveToXml.getRib()+".xml").getFile()));
    }

    public static Releve createReleve() throws JAXBException, ParseException {

        Operations operations = new Operations(SimpleDateFormat.getDateInstance().parse("2022-03-01"),SimpleDateFormat.getDateInstance().parse("2022-06-01"));
        operations.getOperationList().add(new Operation("CREDIT", SimpleDateFormat.getDateInstance().parse("2022-03-15"), 9000, "virement reçu de 1"));
        operations.getOperationList().add(new Operation("DEBIT", SimpleDateFormat.getDateInstance().parse("2022-03-15"), 2000, "Achat en ligne "));
        operations.getOperationList().add(new Operation("CREDIT", SimpleDateFormat.getDateInstance().parse("2022-03-15"), 12000, "virement reçu de 2"));
        operations.getOperationList().add(new Operation("DEBIT", SimpleDateFormat.getDateInstance().parse("2022-03-15"), 4000, "virement transmis à 3"));
        operations.getOperationList().add(new Operation("CREDIT", SimpleDateFormat.getDateInstance().parse("2022-03-15"), 15000, "virement reçu de 4"));
        return new Releve("029876543210123456789000", 30000, new Date(), operations);
        /**
         * unmarshalling: xlm file -> java objects
         */
       /* JAXBContext context= JAXBContext.newInstance(Releve.class);
        System.out.println("unmarshalling: xlm file -> java objects ... ");
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Releve relevefromXml=(Releve) unmarshaller.unmarshal(new File(loader.getResource("filestore/xml/from/releve-valid-with-xsd.xml").getFile()));
        return relevefromXml;
        */
    }
}