import java.util.*;
import java.lang.*;
import java.io.*;

class Employee{
    String name;
    String Designation;
    int Roll_no;
    double salary;
    //Constructor
    Employee(){
        System.out.println("Constructor");
    }//parameterized Constructor
    Employee(String a,String b,int c,double d ){
        name=a;
        Designation=b;
        Roll_no=c;
        salary=d;
    }
    //copy Constructor
    Employee(Employee s){
        this.name=s.name;
        this.Designation=s.Designation;
        this.Roll_no=s.Roll_no;
        this.salary=s.salary;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Employee obj1=new Employee();
	    Employee obj2= new Employee("Sara","Developer",1,45000.0);
	    Employee obj3= new Employee(obj2);
		System.out.println(" Name: "+obj2.name+" Designation: "+obj2.Designation+"  RollNo: "+obj3.Roll_no+" salary: "+obj2.salary);
		System.out.println(" Name: "+obj3.name+" Designation: "+obj3.Designation+"  RollNo: "+obj3.Roll_no+" salary: "+obj3.salary);
	}
	
}
