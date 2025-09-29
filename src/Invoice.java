import java.io.DataOutput;

public class Invoice{

    private String invoiceNumber;
    private String customerName ;

    private double totalAmount;

    public Invoice(String number, String name){
        invoiceNumber = number;
        customerName = name;
        totalAmount = 0.0;
    }

    public void addItem(double price){
        totalAmount += price;
    }

    public double getTotalAmount(){
        return totalAmount;
    }
    public void printInvoice(){
        System.out.println(invoiceNumber+" "+customerName+" "+totalAmount);
    }

    public String getCustomerName() {
        return customerName;
    }
}