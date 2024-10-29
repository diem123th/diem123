public class Author2 {
    String name;
    String email;
    Author2(String name,String email){}
String getName(){
        return name;
}
String getEmail(){
        return  email;
}
void setEmail(String email){
        this.email=email;
}

    @Override
    public String toString() {
        return "Author[name="+name+",email="+email+"]";
    }
}
