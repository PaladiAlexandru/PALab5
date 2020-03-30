import java.util.List;

public class Board {
    List<Token> tokenList;

    public Board(List<Token> tokenList) {
        this.tokenList = tokenList;
    }

    public synchronized Token getToken() {
        return tokenList.get(0);
    }

    public void setTokenList(List<Token> tokenList) {
        this.tokenList = tokenList;
    }
    public void removeToken(int index){
        tokenList.remove(index);
    }
}
