package abenali.edu;

import abenali.edu.model.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class GenerateXSDApp {

    public static void main(String[] args) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Releve.class);
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) {
                File f = new File("generated/releve.xsd");
                StreamResult result = new StreamResult(f);
                result.setSystemId(f.getAbsolutePath());
                return result;
            }
        });
    }
}
