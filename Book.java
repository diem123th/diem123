public class Book {
    String name;
    Author[] authors;
    double price;
    int qty=0;
    Book(String name, Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    Book(String name, Author[] authors,double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public Book(String number, String javaForDummies, Author a1, double v, int i) {
    }

    String getName(){
        return name;
    }
    Author[] getAuthor(){
        return authors;
    }
    Double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getQty(){
        return qty;
    }
    void setQty( int qty){
        this.qty=qty;
    }
    public String toString(){
        return "Book[name="+name+",price="+price+",qty="+qty+"]";
    }


    public String getIsbn() {
        return null;
    }

    public void setIsbn(String isbn) {
    }
}
