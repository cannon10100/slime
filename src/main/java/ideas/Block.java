/**
 * Created with IntelliJ IDEA.
 * User: s619532
 * Date: 3/18/13
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Block {
    private BlockTypes type;
    public Block(String word) {
        type = BlockTypes.valueOf(word);
    }

    public Block(BlockTypes type) {
        this.type = type;
    }

    public BlockTypes getType() {
        return type;
    }

    public void setType(BlockTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
