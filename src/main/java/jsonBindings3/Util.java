package jsonBindings3;

import java.math.BigDecimal;
import java.util.Map;

public class Util {

    public static String StringValue(Object o) {
        return o == null ? null : o instanceof BigDecimal ? ((BigDecimal) o).toString() : (String) o;
    }

    public static Object findByKeyIgnoreCase(String key, Map<String, Object> map) {
        if (map == null)
            return null;
        for (String k : map.keySet()) {
            if (k.equalsIgnoreCase(key))
                return map.get(k);
        }
        return null;
    }

}
