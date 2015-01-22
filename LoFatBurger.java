public class LoFatBurger {

    public final static double BASE_SALARY = 43.20;
    public final static double MULTIPLIER = 1.5;

    public static void main(String[] args) {
        if(args.length<3) {
            System.out.println(
                    "Usage: java LoFatBurger [hours] [after-hours] [sold]");
            System.exit(1);
        }
        double hours=0;
        double afterHours=0; 
        double sales=0;
        try {
            hours = (double)Double.parseDouble(args[0]);
            afterHours = (double)Double.parseDouble(args[1]);
            sales = (double)Double.parseDouble(args[2]);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        double sum = (hours+afterHours*MULTIPLIER)*BASE_SALARY;
        if(0<=sales && sales<5000) {
            sum+=0.05*sales;
        } else if (5000<=sales && sales<10000) {
            sum+=0.10*sales;
        } else if(10000<=sales) {
            sum+=0.15*sales;
        }
        System.out.println(sum + " kr.");
    }
}
//
// $java LoFatBurger 8 3 11000
// 2190.0 kr.
// $
//


