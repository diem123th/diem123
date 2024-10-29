public class Book2 {
    String isbn;
    String name;
    String email;
    Author author;
    double price;
    int qty =0;
    Book2(String isbn,String name, Author author, double price ){

    }
    Book2(String isbn,String name,Author author, double price, int qty){
        this.isbn=isbn;
        this.name=name;
        this.qty=qty;
        this.author=author;
        this.price=price;
    }
    public String getIsbn(){
        return null;

    }
    String getName(){
        return name;

    }
    Author getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getQty(){
        return qty;
    }
    void setQty(int qty){
        this.qty=qty;
    }
    String getAuthorName(){
        return name;
    }

    public String toString() {
        return "Book[isbn="+isbn+",name="+name+",Author[name="+name+"email="+email+"],price="+price+",qty="+qty+"]";
        }
    }


