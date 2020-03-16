import java.awt.*;
import java.io.*;

public class Operations implements Serializable {

    Catalog catalog;

    public void save() throws IOException {
        FileOutputStream fos = new FileOutputStream("CatalogFile.ser");
        ObjectOutputStream bos = new ObjectOutputStream(fos);
        bos.writeObject(catalog);
        bos.flush();
        bos.close();
        fos.close();

    }

    public Catalog load(String path) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(file);
        Catalog object1 =(Catalog)in.readObject();
        in.close();
        file.close();
        return object1;
    }

    public void view() {

    }
}
