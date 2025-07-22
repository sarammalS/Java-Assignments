
class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
class StudentDetails{
    public static void main(String[] args){
      
        Student s1=new Student("johnny",2);
        Student s2= new Student("sara",11);
        System.out.println("Name:"+s1.name+"Roll:"+s1.rollno);
         System.out.println("Name:"+s2.name+"Roll:"+s2.rollno);
    }
}
