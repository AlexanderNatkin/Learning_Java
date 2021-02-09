import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class HelloOtus {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Multimap<Object, Object> map = HashMultimap.create();

        map.put("game", 1);
        map.put("game", 2);

        map.put("book", 4);
        map.put("book", 3);

        Iterable iter = map.get("book");
        map.replaceValues("game", iter);

        System.out.println(map);
    }

}
