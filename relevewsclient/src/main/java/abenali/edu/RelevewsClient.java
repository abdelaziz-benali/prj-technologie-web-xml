package abenali.edu;

import abenali.edu.proxy.*;

public class RelevewsClient {

    public static void main(String[] args) throws JAXBException_Exception {
        System.out.println("Consulting releve from remote webservice ...");
        ReleveService stub = new ReleveWS().getReleveServicePort();
        Releve releve = stub.getReleve("011112222333344445555666");
        displayReleve(releve);
    }

    private static void displayReleve(Releve releve) {
        System.out.println("------------------------");
        System.out.println("Relevé bancaire");
        System.out.println("------------------------");
        System.out.println("RIB: "+releve.getRIB());
        System.out.println("Date: "+releve.getDateReleve());
        System.out.println("Solde: "+releve.getSolde());

        System.out.println("-------------------------------------------------");
        System.out.println("Opérations effectuées du "+releve.getOperations().getDateDebut()+" au "+releve.getOperations().getDateFin());

        System.out.println("-------------------------------------------------");
        for (Operation op: releve.getOperations().getOperation()) {

            System.out.print(op.getType());
            System.out.print("  |  ");
            System.out.print(op.getDate());
            System.out.print("  |  ");
            System.out.print(op.getMontant());
            System.out.print("  |  ");
            System.out.println(op.getDescription());
            System.out.println("------------------------");

        }
    }
}
