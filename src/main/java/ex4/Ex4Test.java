package ex4;

import java.util.Calendar;
import java.util.Date;

public class Ex4Test {
    public static void main(String[] args){
        Date date = Calendar.getInstance().getTime();
        System.out.println("Standard date: " +
                DateUtils.format(date));
        System.out.println("Customized date: " +
                DateUtils.format("yy-MM-dd", date));
    }
}
