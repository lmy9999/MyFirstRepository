package textq;
import java.util.ArrayList;
import java.util.Scanner;
class Student{  
//  ��Ա����  
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
//  toString������д  
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
        p1.setName("С��");  
        p1.setAge(19); 
        p1.setID("1001");
        Student p2=new Student();  
        p2.setName("С��");  
        p2.setAge(17); 
        p2.setID("1002");
        Student p3=new Student();  
        p3.setName("С��");  
        p3.setAge(18); 
        p3.setID("1003"); 
        list.add(p1);  
        list.add(p2);  
        list.add(p3);  
//      ����  
        System.out.println("��ʾ���ѧ������Ϣ��"); 
        for(Student p1Info:list){  
            System.out.println(p1Info);  
        
     }  
        System.out.println(); 
        System.out.println("��ĩβ������ͬѧp4����Ϣ����ʾ��"); 
        String name=scn.next();
        int age=scn.nextInt();
        String number=scn.next();
        Student p4=new Student(name,age,number);
        list.add(list.size(), p4);
        for(Student p1Info:list){  
            System.out.println(p1Info);  
        
     }  
        System.out.println(); 
        System.out.println("��������Ҫɾ���ڼ���ѧ����Ϣ"); 
        int i=scn.nextInt();
        System.out.println("ɾ��������Ϣ����ʾ��"); 
        list.remove(i-1);
        for(Student p1Info:list){  
           System.out.println(p1Info);  
       
    }  
       System.out.println(); 
       System.out.println("��������Ҫ�޸ĵڼ���ѧ����Ϣ��");
       int a=scn.nextInt();
       System.out.println("����������޸ĺ����Ϣ��");
       String name2=scn.next();
       int age2=scn.nextInt();
       String number2=scn.next();
       Student p5=new Student(name2,age2,number2);
       list.set(a-1, p5);
       System.out.println("�޸�ѧ����Ϣ����ʾ��");  
       for(Student p1Info:list){  
           System.out.println(p1Info);  
       
    }  
       System.out.println(); 
       System.out.println("���ҵڼ���ѧ������Ϣ��"); 
       int b=scn.nextInt();
       System.out.println(list.get(b-1));
    }  
}  





       
        
  
   