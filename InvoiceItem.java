public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;
    InvoiceItem(String id, String desc,int qty, double unitPrice){
    }
    String getId() {
return id;
    }
    String getDesc(){
        return desc;
    }
    int getQty(){
        return qty;
    }
    void setQty(int qty){
        this.qty=qty;
    }
    double getUnitPrice(){
        return unitPrice;
    }
    void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    double getTotal(){
        return unitPrice*qty;
    }
    public String toString() {
        return "InvoiceItem[id="+getId()+",desc="+getDesc()+",qty="+getQty()+"unitPrice="+"]";
    }
}
