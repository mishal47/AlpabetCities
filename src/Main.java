import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String content = "Венеция Ялта Минск Амстердам Москва Алушта Атланта Афины Ысити Столькольм Исбук Курск Кишинев Вена Астрахань Ьсити";
        ArrayList<Cities> cities = new ArrayList<>();
//        StringBuilder sb = new StringBuilder("Твої міста:");

        Cities city;
        for (String i : content.split(" ")) {
            city = new Cities(i, getFirstLetter(i), getLastLetter(i));
            cities.add(city);
        }

        for (int i = 0; i < cities.size() ; i++) {
            if(Character.toUpperCase(cities.get(i).lastCH) == (cities.get(i+1).firstCH)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static char getFirstLetter(String city) {
        return city.charAt(0);
    }
    public static char getLastLetter(String city) {
        int lastIndex = city.length() - 1;
        return city.charAt(lastIndex);
    }
}
// if (Character.toUpperCase(lastLetter) == getFirstLetter(nextCity)) {
//        Collections.shuffle(cities);
