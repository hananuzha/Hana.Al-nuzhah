public class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;

    }
    public  boolean inSameMonth(Holiday holiday){
        if(this.month.equalsIgnoreCase(holiday.month))
            return true;
        else
            return false;
    }

    public double avgDate( Holiday[] holidays){
        int sum=0;
        for(int i=0;i<holidays.length;i++){

            sum+=holidays[i].day;

        }
        return sum/holidays.length;

    }

    public static void main(String[] args) {
        Holiday holiday=new Holiday("Independence Day",4,"July");



      // Holiday holiday2=new Holiday("Independence Day",5,"July");
//        Holiday holiday3=new Holiday("Independence Day",30,"July");
//        Holiday[] list={holiday,holiday3,holiday2};
      //System.out.println((holiday.inSameMonth(holiday2)));

    }

}
