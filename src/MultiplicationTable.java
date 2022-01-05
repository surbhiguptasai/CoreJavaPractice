public class MultiplicationTable {
    public static void main(String[] args) {
//        if(args.length==1) {
//        int a =Integer.parseInt(args[0]);
//                for(int i=1;i<=10;i++){
//                    System.out.println(a+"*"+i+"="+(a*i));
//                }
//        }else {
//            System.out.println("No Args");
//        }
        if(args.length==1) {
            int a =Integer.parseInt(args[0]);
            for(int i=10;i>=1;i--){
                System.out.println(a+"*"+i+"="+(a*i));
            }
        }else {
            System.out.println("No Args");
        }
    }
}
