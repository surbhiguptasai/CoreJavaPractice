public class Array1 {
    public static void main(String[] args) {
        String months[] =
                {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Size of months array: " + months.length);
        System.out.println("Months Array using enhanced regular for loop");
        for (int i=0;i<months.length;i++ ){
            //System.out.println(months[i]);
            System.out.println("months [" +i+"]:"+ months[i]);
        }
        System.out.println("Months Array using enhanced for loop");
        for (String month :months){
            System.out.println(month);
        }
    }
}
