public class TernaryTest {
    public static void main(String[] args) {
        if(args.length==2){
            int a= Integer.parseInt(args[0]);
            int b= Integer.parseInt(args[1]);
            int big= (a > b) ? a : b;
            System.out.println("Biggest of " +a+" and " +b+" is "+big);
            int small= (a < b) ? a : b;
            System.out.println("Smallest of " +a+" and " +b+" is "+small);
        }else {
            System.out.println("No Args");
        }
    }
}
