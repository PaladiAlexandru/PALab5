import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Document {
    int id;
    String name;
    Map<String, String> tags;
    Path path ;

    public Document(int id, String name, Map<String, String> tags, Path path) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public Path getPath() {
        return path;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}
