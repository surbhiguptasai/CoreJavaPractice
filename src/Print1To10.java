public class Print1To10 {
    public static void main(String[] args) {

//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        int i=1;
        System.out.println("Printing 1 to 10 using while loop.");
        while (i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("Printing 1 to 10 using do loop.");
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);

        System.out.println("Printing 1 to 10 using for loop.");
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }
    }
}
