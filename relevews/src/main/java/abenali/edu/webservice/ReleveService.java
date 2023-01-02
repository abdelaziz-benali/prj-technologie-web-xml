package abenali.edu.webservice;


import abenali.edu.model.Operation;
import abenali.edu.model.Releve;
import abenali.edu.service.SerialisationService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBException;

@WebService(serviceName = "ReleveWS")
public class ReleveService {

    @WebMethod
    public Releve getReleve(@WebParam String rib) throws JAXBException {
        return SerialisationService.getInstance().unmarshalReleve(rib);
    }
    /*
    @WebMethod
    public void saveReleve(@WebParam Releve releve) throws JAXBException {
        SerialisationService.getInstance().marshalReleve(releve);
    }
    @WebMethod
    public void addOperation(@WebParam String rib, @WebParam Operation operation) throws JAXBException {
        System.out.println("operation: " + operation);
        Releve releve = SerialisationService.getInstance().unmarshalReleve(rib);
        releve.getOperations().getOperationList().add(operation);:
        SerialisationService.getInstance().marshalReleve(releve);
    }*/
}
