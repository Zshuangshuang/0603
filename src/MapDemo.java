import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MapDemo
 * @Author: 邹双双
 * Date: 2020/6/3 7:32
 * @Description:
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建Map参数，第一个参数是key的类型，第二个是value参数类型
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        //插入一些键值对
        map.put("及时雨","宋江");
        map.put("神奇宝贝","哆啦A梦");
        map.put("大笨熊","熊二");
        //使用get方法取出键值对
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("神奇宝贝"));
        System.out.println(map.get("喵喵"));
        System.out.println(map.getOrDefault("三岁", "双双"));
        System.out.println(map.containsKey("神奇宝贝"));
        System.out.println(map.containsKey("熊二"));
        System.out.println(map.containsValue("宋江"));
        System.out.println(map.size());
        for (Map.Entry<String ,String > entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
