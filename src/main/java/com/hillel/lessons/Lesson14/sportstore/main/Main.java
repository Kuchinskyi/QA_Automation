package com.hillel.lessons.Lesson14.sportstore.main;

import com.hillel.lessons.Lesson14.sportstore.enams.SeasonOfTShorts;
import com.hillel.lessons.Lesson14.sportstore.shop.Shoes;
import com.hillel.lessons.Lesson14.sportstore.shop.Shorts;
import com.hillel.lessons.Lesson14.sportstore.shop.TShorts;

public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes(40, "Red", "UA", "futsal", 23);
        System.out.println(shoes);
        System.out.println();
        Shorts shorts = new Shorts(45, "Black", "Germany", "cotton", 50);
        System.out.println(shorts);
        shorts.design();
        System.out.println();
        TShorts tshorts = new TShorts(50, "Blue", "USA", "cotton", SeasonOfTShorts.SUMMER);
        System.out.println(tshorts);
        tshorts.design();
        tshorts.setSeason(SeasonOfTShorts.DEMISEASON);

    }
}
