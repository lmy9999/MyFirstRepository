package textq;
import java.util.ArrayList;
import java.util.Scanner;
class Student{  
//  成员变量  
    private String name;  
    private int age;  
    private String id;
    public Student() {};
    public Student(String name,int age,String id) {
    	this.name=name;
    	this.age=age;
		this.id=id;
	}
    public String getName(){  
        return name;  
    }  
      
    public void setName(String name){  
        this.name=name;  
    }  
      
    public int getAge(){  
        return age;  
    }  
      
    public void setAge(int age){  
        this.age=age;  
    }  
    public String getID(){  
        return name;  
    }  
      
    public void setID(String id){  
        this.id=id;  
    }  
//  toString方法重写  
    @Override  
    public String toString() {  
        return "name=" + name + ", age=" + age + ", id="+id;  
    }  
}  
public class Test {  
    public static void main(String[] args) {  
        ArrayList<Student> list=new ArrayList<Student>(); 
        Scanner scn=new Scanner(System.in);
        Student []p=new Student[10];  
        Student p1=new Student();  
        p1.setName("小红");  
        p1.setAge(19); 
        p1.setID("1001");
        Student p2=new Student();  
        p2.setName("小明");  
        p2.setAge(17); 
        p2.setID("1002");
        Student p3=new Student();  
        p3.setName("小黄");  
        p3.setAge(18); 
        p3.setID("1003"); 
        list.add(p1);  
        list.add(p2);  
        list.add(p3);  
//      遍历  
        System.out.println("显示添加学生的信息："); 
        for(Student p1Info:list){  
            System.out.println(p1Info);  
        
     }  
        System.out.println(); 
        System.out.println("在末尾插入新同学p4的信息后显示："); 
        String name=scn.next();
        int age=scn.nextInt();
        String number=scn.next();
        Student p4=new Student(name,age,number);
        list.add(list.size(), p4);
        for(Student p1Info:list){  
            System.out.println(p1Info);  
        
     }  
        System.out.println(); 
        System.out.println("请输入想要删除第几个学生信息"); 
        int i=scn.nextInt();
        System.out.println("删除该生信息后显示："); 
        list.remove(i-1);
        for(Student p1Info:list){  
           System.out.println(p1Info);  
       
    }  
       System.out.println(); 
       System.out.println("请输入想要修改第几个学生信息：");
       int a=scn.nextInt();
       System.out.println("请输入该生修改后的信息：");
       String name2=scn.next();
       int age2=scn.nextInt();
       String number2=scn.next();
       Student p5=new Student(name2,age2,number2);
       list.set(a-1, p5);
       System.out.println("修改学生信息后显示：");  
       for(Student p1Info:list){  
           System.out.println(p1Info);  
       
    }  
       System.out.println(); 
       System.out.println("查找第几个学生的信息："); 
       int b=scn.nextInt();
       System.out.println(list.get(b-1));
    }  
}  





       
        
  
   