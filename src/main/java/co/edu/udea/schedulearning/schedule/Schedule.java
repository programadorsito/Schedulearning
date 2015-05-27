package co.edu.udea.schedulearning.schedule;
//Schedule{day int, time1 String, time2 String}
public class Schedule
{
    private int day;
    private String time1;
    private String time2;

    public Schedule ()
    {

    }

    public Schedule (int day,String time1,String time2)
    {
        this.day=day;
        this.time1=time1;
        this.time2=time2;
    }

    public void setDay(int day)
    {
        this.day=day;
    }

    public int getDay()
    {
        return this.day;
    }

    public void setTime1(String time1)
    {
        this.time1=time1;
    }

    public String getTime1()
    {
        return this.time1;
    }

    public void setTime2(String time2)
    {
        this.time2=time2;
    }

    public String getTime2()
    {
        return this.time2;
    }

}
