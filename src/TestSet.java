
/*
*2.29.46
*                               Set
*
*
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //1.add添加元素
        set.add("绿色");//如果添加相同元素 打印所有元素时 也只会打印一遍
        set.add("绿色");//并且在set中只存在一份（去重）
        set.add("黄色");
        set.add("紫色");
        set.add("红色");
        set.add("蓝色");

        //2.Set的典型应用，判断某个元素是否在Set中存在
        System.out.println(set.contains("蓝色"));

        //3.删除元素
        set.remove("黄色");
        System.out.println(set.contains("黄色"));

        //4.打印所有元素
        System.out.println(set);

        //5.遍历Set 用for each遍历
        for (String s : set) {
            System.out.println(s);
        }


        //6.使用地带器俩比那里集合类
        //创建一个iterator 去接受set.iterator方法 返回的一个Iterator对象
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
