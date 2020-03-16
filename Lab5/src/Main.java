import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){
        Map<String,String> tagsForDoc1 = new HashMap<String,String>();
        List<Document> docsForCatalog = new ArrayList<Document>();
        tagsForDoc1.put("author","Ion Luca Caragiale");
        Path pathForDoc1 = Paths.get("C:\\Users\\alex_\\IdeaProjects\\Lab5\\CatalogFile.ser");
        Document doc1 = new Document(1,"book1",tagsForDoc1,pathForDoc1);
        Catalog catalog = new Catalog();

        docsForCatalog.add(doc1);
        catalog.setListOfDocs(docsForCatalog);

        Operations op = new Operations();
        try
        {
            op.save();
           Catalog catalog1 = op.load("C:\\Users\\alex_\\IdeaProjects\\Lab5\\CatalogFile.ser");
        }catch (IOException e){
            System.out.println(e);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        };
    }
}
