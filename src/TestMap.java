import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestMap
 * @Author: 邹双双
 * Date: 2020/6/3 8:17
 * @Description:
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();
        map.put("小可爱","哆啦A梦");
        map.put("憨憨","大雄");
        map.put("漂亮妹妹","静香");
        System.out.println(map.get("小可爱"));
        System.out.println(map.getOrDefault("胖子", "胖虎"));
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        map.remove("憨憨");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        map.clear();
        System.out.println(map.isEmpty());
    }
}
