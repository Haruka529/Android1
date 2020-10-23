import java.util.ArrayList;
import java.util.List;

public class Android1_Lv3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //加入元素Hello 和 word
        list.add("Hello");
        list.add("word");
        list.add("!");
        System.out.println(list);
        System.out.println("找出错误的单词：");
        //提出下标1对应的错误单词word
        Object i = list.get(1);
        System.out.println(i);
        //删除下标1对应的错误单词word （*：会影响数组的长度）
        list.remove(1);
        System.out.println("请更正：");
        //在下标1处加入正确单词world
        list.add(1,"world");
        System.out.println(list.get(1));
        System.out.println("该list里共有" + list.size() + "个元素");
        System.out.println("正确的整句话应该为：");
        System.out.println( " " + list.get(0) +" "+ list.get(1) + list.get(2));
    }
}
