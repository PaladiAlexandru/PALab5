import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String args[])  {
        int m =3;
        int n = 7;
        int count=0;
        ArrayList<Token> tokenArrayListArr = new ArrayList<Token>();


        while( count < n){
            tokenArrayListArr.add(new Token(getRandom(m)));
            count++;
        }
        System.out.println(tokenArrayListArr.get(0).getNumber() + ", " + tokenArrayListArr.get(1).getNumber());
        Board board = new Board(tokenArrayListArr);
        Runnable player1 = new Player("Player1",board);
        Runnable player2 = new Player("Player2",board);
        Runnable player3 = new Player("Player3",board);

        new Thread(player1).start();
        new Thread(player2).start();
        new Thread(player3).start();















    }
    public static int getRandom(int m){
        Random r = new Random();
        int low = 1;
        int high = m + 1;
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
