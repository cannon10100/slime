import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: s619532
 * Date: 3/18/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class World {
    private ArrayList<ArrayList<Block>> rows;
    public World(String mapFile) {
        String line = "";
        String[] words;
        rows = new ArrayList<ArrayList<Block>>();
        try {
            BufferedReader filereader = new BufferedReader(new FileReader(mapFile));
            ReverseEnumMap<BlockTypes> intToType = new ReverseEnumMap<BlockTypes>(BlockTypes.class);
            while((line = filereader.readLine()) != null) {
                line = line.toUpperCase();
                words = line.replaceAll("\\s","").split(",");
                ArrayList<Block> blocks = new ArrayList<Block>();
                int typeInt;
                for (String word : words) {
                    typeInt = Integer.parseInt(word);
                    blocks.add(new Block(intToType.get(typeInt)));
                }
                rows.add(blocks);
            }
            filereader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        for(ArrayList<Block> row : rows) {
            for(Block block : row) {
                System.out.printf("%-12s",block.toString());
            }
            System.out.println("\n");
        }
    }
}
