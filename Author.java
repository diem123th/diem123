public class Author {
    public static String getEmail;
    String name;
    String email;
    char gender;
    Author(String name, String email,char gender ){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public Author(String tanAhTeck, String mail) {
    }

    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;
    }
    char getGender(){
        return gender;
    }
    public String toString(){
        return "Author[name"+name+",email="+email+",gender="+gender+"]";
    }

}
