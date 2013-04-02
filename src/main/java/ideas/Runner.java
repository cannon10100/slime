import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: s619532
 * Date: 3/18/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {
        boolean running = true;

        World testWorld = new World("U:\\GameIdeas\\src\\map.txt");
        Scanner scanner = new Scanner(System.in);
        while(running) {
            testWorld.update();
            if(scanner.next().equals("exit")) {
                running = false;
            }
        }
    }
}
