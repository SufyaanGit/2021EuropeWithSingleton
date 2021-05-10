public class Main {
    public static void main(String[] args){
        double price = 100.00;
        if (!BTWCheck.getInstance().isReverseChargeApplicable("CA")){
            price = price * 1.21;
        }

        System.out.println(price);
    }
}
