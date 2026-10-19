import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();
        games.push("Codm");//add games this the down one, set style insertion order is maintained
        games.push("Fortnite");
        games.push("GTAv");
        games.push("Freefire");
        games.push("PubG"); //the upermost

       // games.pop();//remove the top one
        //games.pop();//remove the second one freefire
        //String myFAvGAme = games.pop();
       // System.out.println(games.peek());//show th last game
       System.out.println(games.search("Freefire"));//starts with 1 not 0 and starts from the top,,bottom


        System.out.println(games);
    }
}

/*Used in undo/redo in text editors
used in browser back->forward in browsing */