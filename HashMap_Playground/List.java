import java.util.HashMap;
import java.util.Map;

public class List{

    private String group;
    private Map<String, String> names;

    public List(String g){
        this.group = g;
        this.names = new HashMap<>();
        // コンストラクタが呼び出されると、HashMapが生成される
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String g) {
        this.group = g;
    }

    public String getNames(String position){
        return this.names.get(position);
        // HashMapの中の、Keyをパラメーター（position）としておき、
        // パスされると、それに対応したValueを返す。
    }

    public void setNames(String position, String n) {
        this.names.put(position, n);
    }

}