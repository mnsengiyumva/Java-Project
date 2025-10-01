import java.util.ArrayList;

public class Invoice{

    private String invoiceNumber;
    private String customerName ;

    private double totalAmount;
    private int clients;


    public Invoice(String number, String name){
        invoiceNumber = number;
        customerName = name;
        totalAmount = 0.0;
        clients = 0;
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

        clients += 1;
        return customerName;

    }
    public void setCustomerName(String nextCustomer){
        customerName = nextCustomer;
    }



}