public class DateFirstTry {
    public String month;
    public int day;
    public int year;
    public void writeOutput(){
      System.out.println( month + " "+ day + " , " + year);
    }
    public void setDate(String month,int day,int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public String toString(){
        return month + " " + day +  " , " + year;
    }
}
