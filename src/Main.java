public class Main{

    public static void main(String[] args){

//        Password password1 = new Password();
//
//        password1.setPassWord("123458");
//        password1.setPassWord("123defrtgr");

        Invoice invoice1 = new Invoice("2001022", "Thomas");
        Invoice invoice2 = new Invoice("20034667", "Peter");

        invoice1.addItem(5000.0);
        invoice2.addItem(200.0);
        invoice2.addItem(10002);

        if (invoice1.getTotalAmount()>100){
            System.out.println(invoice1.getCustomerName()+" You are eligible for a gift card");
        }
        if (invoice2.getTotalAmount()>100){
            System.out.println(invoice2.getCustomerName()+" You are eligible for a gift card");
        }

        invoice2.printInvoice();
        invoice1.printInvoice();




    }
}