 public class DateFirstTryDemo{
    public static void main(String[] args){
        DateFirstTry date1;
        date1 = new DateFirstTry();
        date1.month = "Dec";
        date1.day = 31;
        date1.year = 2007;
        System.out.print("date1 : ");
        date1.writeOutput();

        DateFirstTry date2 = new DateFirstTry();
        date2.setDate("Jan",1,2026);
        System.out.print("date 2 : ");
        date2.writeOutput();

        DateFirstTry date3 = new DateFirstTry();
        date3.setDate("Feb",22,2003);
        System.out.print("date3의정보 : " + date3);
    }
}
