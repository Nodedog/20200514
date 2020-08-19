import java.util.HashMap;
import java.util.Map;
/*
*
*
*                   Map
*
*
* */
class Student{
    public String name;
    public int age;
    public String  grade;
    public String school;

    public Student(String name, int age, String grade, String school) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}



public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("曹操",20,"一年级","西工院");
        Student student2 = new Student("关羽",30,"二年级","清华");
        Student student3 = new Student("刘备",40,"三年级","北大");

        Map<String ,Student> studentMap = new HashMap<>();
        studentMap.put(student1.name,student1);
        studentMap.put(student2.name,student2);
        studentMap.put(student3.name,student3);

        //当前键值对 name -> student，给定姓名可以查到学生的所有信息
        String name = "曹操";
        Student s1 = studentMap.get(name);
        System.out.println(s1);

        //Map要求key不能重复 put的时候如果key已经存在，就会修改value的值
        Student student4 = new Student("曹操",50,"四年级","复旦");
        studentMap.put(student4.name,student4);
        Student s3 = studentMap.get(name);
        System.out.println(s3);


        //一个Map只能映射一种对应关系，如果想按照其他的映射来查找 例如 年龄的话 就要重新写一个Map
        Map<Integer,Student> studentMap2 = new HashMap<>();
        studentMap2.put(student1.age,student1);
        studentMap2.put(student2.age,student2);
        studentMap2.put(student3.age,student3);

        int age = 40;
        Student s2 = studentMap2.get(age);
        System.out.println(s2);


        //遍历一个Map
        //Entry直接翻译是 条目  ，也就是 键值对
        for (Map.Entry<String ,Student>entry:studentMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }


}
