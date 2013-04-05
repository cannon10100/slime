package ideas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: s619532
 * Date: 3/19/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */

//Class used to convert from int values to BlockTypes
public class ReverseEnumMap<V extends Enum<V> & EnumConverter> {
    private Map<Integer, V> map = new HashMap<Integer, V>();
    public ReverseEnumMap(Class<V> valueType) {
        for (V v : valueType.getEnumConstants()) {
            map.put(v.convert(), v);
        }
    }

    public V get(int num) {
        return map.get(num);
    }
}
