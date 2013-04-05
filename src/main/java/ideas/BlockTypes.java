package ideas;

/**
 * Created with IntelliJ IDEA.
 * User: s619532
 * Date: 3/18/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public enum BlockTypes implements EnumConverter {
    AIR(0),
    WATER(1),
    ;

    private final int id;

    public int getId() {

        return id;
    }

    private BlockTypes(int id) {
        this.id = id;

    }

    public int convert() {
        return id;
    }
}
