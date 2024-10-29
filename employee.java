public class employee {
    int id;

    int salary;

    int a;
    String lastname;
    String firstname;
    employee(int id, int salary, String firstname, String lastname ){
        this.id=id;
        this.salary=salary;
        this.firstname=firstname;
        this.lastname=lastname;
    }
    void setSalary( int salary){
        this.salary=salary;
    }
    int getId(){
        return id;
    }
    String getFirstname(){
        return firstname;
    }
    String getLastname(){
        return lastname;
    }
    String getName(){
        return getFirstname() + " " +getLastname() ;
    }
    int getSalary(){

        return salary;

    }

    void setraiseSalary(int a) {

        this.a=a;
    }
    int getAnnualSalary(){

        return salary*12;

    }

    int getraiseSalary (){

        return (salary*a/100+salary);

    }

    public String toString() {

        return "Employee[id=" + getId() + ",name=" + getName() + ",salary=" + getSalary() + "]";

    }
}


