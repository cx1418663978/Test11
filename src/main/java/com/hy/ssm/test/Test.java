package com.hy.ssm.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName: Test
 * @Description :TODO(描述一个这个类的作用)
 * @Author: Xu Xin
 * @Date :2018/9/11 16:47
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
       /*ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TimequantumMapper timequantumMapper=(TimequantumMapper)app.getBean("timequantumMapper");
        List<Timequantums> list=timequantumMapper.queryAlltimequantum();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getTtime());
        }*/


            getDayBetween(7);


    }

    public static Date[] getDayBetween(Integer day){

        // 今天整天日期
        Date startDt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(startDt.getTime());
        try {
            startDt = sdf.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(startDt.getTime() - 1));
        calendar.add(Calendar.DATE,day);

        System.out.println(startDt);
        System.out.println(calendar.getTime());
        return new Date[] { startDt, calendar.getTime() };
    }


}
