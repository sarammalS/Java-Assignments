
class Student{
    String name;
    int rollno;
    String phoneno;
    String address;
    Student(String name,int rollno,String phoneno,String address){
        this.name=name;
        this.rollno=rollno;
        this.phoneno=phoneno;
        this.address=address;
    }
}
class StudentDetails{
    public static void main(String[] args){
      
        Student s1=new Student("johnny",2,"7655876980","123 Main st");
        Student s2= new Student("sam",11,"98076987882","456 eli street");
        System.out.println("Name: "+s1.name+" Roll:"+s1.rollno+" Phone: "+s1.phoneno+" Address:"+s1.address);
         System.out.println("Name:"+s2.name+"Roll:"+s2.rollno+" Phone: "+s2.phoneno+" Address:"+s2.address);
    }
}
