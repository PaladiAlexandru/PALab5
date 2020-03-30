import java.io.Serializable;

public class Token implements Serializable {
    private int number;

    public Token(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
