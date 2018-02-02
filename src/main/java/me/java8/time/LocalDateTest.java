package me.java8.time;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author will
 * 2017/12/8.
 */
public class LocalDateTest {

    public static void main(String[] args){
//        LocalDate date = LocalDate.of(2017,12,12);
//        LocalDate date1 = LocalDate.parse("2017/12/12", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//        //是否是闰年
//        date.isLeapYear();
//        //本月的第一天
//        date.with(TemporalAdjusters.firstDayOfMonth());


        Person person = new Person("will",29);
        Person person1 = new Person("ali",20);
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        System.out.println(list.stream().filter(item -> item.getAge()>30).collect(Collectors.toList()).size());
    }
}
