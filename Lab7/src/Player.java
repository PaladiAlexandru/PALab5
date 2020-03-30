import java.util.List;

public class Player implements Runnable {
    String name;
    Board board;
    Token token;
    List<Integer> aritmProg;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public void makeAritProg(Token token){
        //aritmProg.add(token.getNumber());
        System.out.println("Making the aritmProg");
    }

    @Override
    public void run() {
        if(board.tokenList.isEmpty())
            System.out.println("Player: " + name + " won");
        while(!board.tokenList.isEmpty()) {

            token = board.getToken();
            board.removeToken(0);
            makeAritProg(token);

        }
    }

}
