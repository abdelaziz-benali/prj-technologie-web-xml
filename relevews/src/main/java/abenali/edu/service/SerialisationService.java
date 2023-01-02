package abenali.edu.service;

import abenali.edu.model.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

final public class SerialisationService {
    private static final ClassLoader loader = SerialisationService.class.getClassLoader();
    private static volatile SerialisationService instance;
    private Unmarshaller unmarshaller;
    private Marshaller marshaller;


    private SerialisationService() throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Releve.class);
        unmarshaller = context.createUnmarshaller();
        marshaller = context.createMarshaller();
    }

    public static SerialisationService getInstance () throws JAXBException {
        SerialisationService result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SerialisationService.class) {
            if (instance == null) {
                instance = new SerialisationService();
            }
            return instance;
        }
    }
    public Releve unmarshalReleve( String rib) throws JAXBException {
        System.out.println("unmarshalling: xlm file -> java objects ... ");
        //JAXBContext context=JAXBContext.newInstance(Releve.class);
        //Unmarshaller unmarshaller=context.createUnmarshaller();
        Releve relevefromXml=(Releve) unmarshaller.unmarshal(new File(loader.getResource("xml-store/releve-"+rib+".xml").getFile()));
        return relevefromXml;
    }

    public void marshalReleve(Releve releve) throws JAXBException {
        System.out.println("marshalling: java object -> xml file ... ");
        //Marshaller marshaller=context.createMarshaller();
        //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve, new File(loader.getResource("filestore/xml/from/releve-"+releve.getRib()+".xml").getFile()));

    }

}
