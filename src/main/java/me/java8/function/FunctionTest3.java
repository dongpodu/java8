package me.java8.function;

import me.java8.function.domain.Artist;
import me.java8.function.domain.Member;
import me.java8.function.domain.Track;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * java 8 lambada:chapater 3
 * author will
 * 2018/2/1.
 */
public class FunctionTest3 {

    public static void main(String[] args) {
        List<Member> memberList = Stream.of(new Member("吴奇隆"),new Member("苏有朋"),new Member("陈志朋")).collect(Collectors.toList());
        Artist artist = new Artist("小虎队");
        artist.setMembers(memberList);
        List<Artist> artistList = Stream.of(artist).collect(Collectors.toList());
        System.out.println(getMembersCount(artistList));

        List<Integer> numbers = Stream.of(1,2,3,4).collect(Collectors.toList());
        System.out.println(getTop(numbers,2));
    }

    static void test(){
        List<Artist> list = new ArrayList<>();
        list.add(new Artist("zuozhu"));

        /*
        返回stream的方法为lazy方法
        否则为eager方法
         */

        //filter为lazy方法，故不打印“a”
        list.stream().filter(artist -> {
            System.out.println("a");
            return artist.getName().equals("mingren");
        });

        //count为eger方法，打印“b”
        list.stream().filter(artist -> {
            System.out.println("b");
            return artist.getName().equals("mingren");
        }).count();


        List<String> list1 = Stream.of("a","b","c").collect(Collectors.toList());

        List<String> list2 = list1.stream().map(s ->  s.toUpperCase()).collect(Collectors.toList());

        List<Track> list3 = Stream.of(new Track("Bakai",524),new Track("Violets for Your Furs",378),new Track("Time Was",451))
                .collect(Collectors.toList());
        //找到length最小的曲目
        Track shortestTrack = list3.stream().min(Comparator.comparing(track -> track.getLenght())).get();
        System.out.println(shortestTrack.getName());


        int count = Stream.of(1,2,3,4).reduce(0,(x,y) -> x+y);
        System.out.println(count);
    }


    static int addUp(Stream<Integer> numbers){
        return numbers.reduce(0,(x,y)-> x+y);
    }


    static long getMembersCount(List<Artist> artists){
        return artists.stream().map(artist -> artist.getMembers()).flatMap(members -> members.stream()).count();
    }

    static List<Integer> getTop(List<Integer> list,int topNum){
        return list.stream().limit(topNum).collect(Collectors.toList());
    }

}
