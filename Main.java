//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Date d1 = new Date(4, 5, 2024);
//        System.out.println(d1);  // toString()
//
//        // Test Setters and Getters
//        d1.setMonth(12);
//        d1.setDay(9);
//        d1.setYear(2099);
//        System.out.println(d1);  // toString()
//        System.out.println("Month: " + d1.getMonth());
//        System.out.println("Day: " + d1.getDay());
//        System.out.println("Year: " + d1.getYear());
//
//        // Test setDate()
//        d1.setDate(3, 10, 2023);
//        System.out.println(d1);  // toString()
//        Time t1 = new Time(1, 2, 3);
//        System.out.println(t1);  // toString()
//
//        // Test Setters and Getters
//        t1.setHour(4);
//        t1.setMinute(5);
//        t1.setSecond(6);
//        System.out.println(t1);  // toString()
//        System.out.println("Hour: " + t1.getHour());
//        System.out.println("Minute: " + t1.getMinute());
//        System.out.println("Second: " + t1.getSecond());
//
//        // Test setTime()
//        t1.setTime(23, 59, 58);
//        System.out.println(t1);  // toString()
//
//        // Test nextSecond();
//        System.out.println(t1.nextSecond());
//        System.out.println(t1.nextSecond().nextSecond());
//
//        // Test previousSecond()
//        System.out.println(t1.previousSecond());
//        System.out.println(t1.previousSecond().previousSecond());
//    }
//
//        }

//        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
//        System.out.println(inv1);  // toString();
//
//// Test Setters and Getters
//        inv1.setQty(999);
//        inv1.setUnitPrice(0.99);
//        System.out.println(inv1);  // toString();
//        System.out.println("id is: " + inv1.getId());
//        System.out.println("desc is: " + inv1.getDesc());
//        System.out.println("qty is: " + inv1.getQty());
//        System.out.println("unitPrice is: " + inv1.getUnitPrice());
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1);  // toString()
        employee e1 = new employee(8, 24, "Tan", "nguyen");
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstname());
        System.out.println("lastname is: " + e1.getLastname());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.getraiseSalary());
        System.out.println(e1);
        rectangle r1 = new rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        rectangle r2 = new rectangle(1.0f,16 );  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());

    }
}

    


