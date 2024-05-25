package uz.app;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String,UserStats> day1=new HashMap<>();
        day1.put("12",new UserStats(5l));
        day1.put("10",new UserStats(1l));
        day1.put("158",new UserStats(9l));
        day1.put("7",new UserStats(3l));
        day1.put("9",new UserStats(null));

        Map<String,UserStats> day2=new HashMap<>();
        day2.put("53",new UserStats(4l));
        day2.put("7",new UserStats(2l));
        day2.put("33",new UserStats(6l));
        day2.put("1",new UserStats(4l));
        day2.put("10",new UserStats(7l));
        day2.put(null,new UserStats(7l));

        Map<String,UserStats> day4=new HashMap<>();
        day4.put("1",new UserStats(2l));
        day4.put("10",null);
        day4.put("6",new UserStats(5l));
        day4.put("33",new UserStats(2l));
        day4.put("12",new UserStats(4l));


        UserCounter userCounter =new UserCounter();


        Map<Long, Long> count = userCounter.count(day1, day2,null, day4);

        count.forEach((id, visit) ->
                System.out.printf("userId::%s\t\tcount::%s\n",id,visit));

    }

}