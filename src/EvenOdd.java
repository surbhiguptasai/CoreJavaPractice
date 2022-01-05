public class EvenOdd {
    public static void main(String[] args) {
        if(args.length==1) {
            int a = Integer.parseInt(args[0]);
            if (a % 2 == 0) {
                System.out.println(a + " is an even number");
            } else {
                System.out.println(a + " is an odd number");
            }
        }else{
            System.out.println("No args");
        }
    }
}
