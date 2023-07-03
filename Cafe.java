import static java.lang.System.out;

public class Cafe{

    public static String orderUp(String name, double price, boolean ready, int quantity, boolean readyUp, double refund){
        
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String totalMessage = "your total is $";
        double newPrice = price - (refund * quantity);

        if(ready == true || readyUp == true){
            if(refund > 0){
            return (name + "! " + "Your new price is: $" + newPrice + ". Status: " + (ready? "Ready ":"Not Ready "));
        }
            ready = true;
            return((ready? "Ready":"Not Ready") + ": " + name + readyMessage + " " + price);
        }
        else{
            return("Not Ready: " + name + pendingMessage + ", and " + totalMessage + (price*quantity));
        }
    }

    public static void main(String[] args) {
        
        String greetingMessage = "Welcome to Cafe Java, ";
        
        double whiteMochaPrice = 5.5;
        double espressoPrice = 4.0;
        double dripPrice = 3.5;
        double chaiPrice = 5.5;

        String customer1 = "Brendan Cordova";
        String customer2 = "Trae Hughes";
        String customer3 = "Paul Soteropolis";
        String customer4 = "Peter Marino";

        boolean isreadyOrder1 = false;
        boolean isreadyOrder2 = false;
        boolean isreadyOrder3 = true;
        boolean isreadyOrder4 = false;

        out.println(greetingMessage + customer1);
        out.println(orderUp(customer1, dripPrice, isreadyOrder1, 1, true, 0));
        out.println(orderUp(customer2, espressoPrice, isreadyOrder2, 1, false, 0));
        out.println(orderUp(customer3, whiteMochaPrice, isreadyOrder3, 2, false, 0));
        out.println(orderUp(customer4, dripPrice, isreadyOrder4, 1, true, chaiPrice));
    }
}