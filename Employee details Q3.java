
public class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee details in formatted style
    void display() {
        System.out.format("%-10s %-15d %s\n", name, yearOfJoining, address);
    }
}
```


public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.format("%-10s %-15s %s\n", "Name", "Year of joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
```



```
Name       Year of joining  Address
Robert     1994             64C- WallsStreat
Sam        2000             68D- WallsStreat
John       1999             26B- WallsStreat
```

---
🔍 Explanation:

* `%-10s`: Left-align string within 10 characters.
* `%-15d`: Left-align integer within 15 characters.
* `System.out.format()` provides clean formatting.

Let me know if you'd like to take input from the user instead!
