package co.edu.udea.schedulearning.db;
public class SQL{
    public static final String CREATE_TABLA_MATTER ="CREATE TABLE MATTER (NAME , WEIGHT)";
    public static final String DROP_TABLA_MATTER ="DROP TABLE IF EXISTS MATTER";

    public static final String CREATE_TABLA_SCHEDULE ="CREATE TABLE SCHEDULE (DAY, TIME1, TIME2)";
    public static final String DROP_TABLA_SCHEDULE ="DROP TABLE IF EXISTS SCHEDULE";

    public static final String CREATE_TABLA_TASK ="CREATE TABLE TASK (NAME, DAY, TIME, COMMITED)";
    public static final String DROP_TABLA_TASK ="DROP TABLE IF EXISTS TASK";

    public static final String CREATE_TABLA_NOTE ="CREATE TABLE NOTE (NAME, DESCRIPTION)";
    public static final String DROP_TABLA_NOTE ="DROP TABLE IF EXISTS NOTE";

    public static final String[] MATTER_COLUMNS = {"name", "weight"};
//    public static final String createMatter="create table if not exists matter(name primary key, weight, progress)";
//    public static final String createSchedule="create table if not exists schedule(day, time1, time2, primary key(day, time1, time2))";
//    public static final String createTask="create table if not exists task(name, day, time, matter, commited) primary key(name)";
//    public static final String createMatter="create table if not exists teacher(name, email, cellphone)";
//
    public static final String allMatter="select * from matter";
//    public static final String allSchedule="select * from schedule";
//    public static final String allTask="select * from task";
//    public static final String allTopic="select * from topic";
//
    public static String insertMatter(String name, Integer weight){
        return "insert into matter (name, weight) values ('"+name+"', "+weight+")";
    }
//
//    public static String insertSchedule(String day, String time1, String time2){
//        StringBuilder query=new StringBuilder(allSchedule+" where 1=1 ");
//        if(day!=null)query.append("and day = "+day+" ");
//        if(time1!=null)query.append("and time1 = '"+time1+"' ");
//        if(time2!=null)query.append("and time2 = '"+time2+"' ");
//        return query.toString();
//    }
//
//    public static String insertTask(String name, String time, Materia matter){
//        StringBuilder query=new StringBuilder(allTask+" where 1=1 ");
//        if(name!=null)query.append("and upper(name) = '"+name.toUpperCase()+"' ");
//        if(time!=null)query.append("and time = '"+time+"' ");
//        if(matter!=null)query.append("and matter = '"+matter.getName()+"' ");
//        return query.toString();
//    }
}

