package com.company;

import com.company.DataDomain.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Functions funcs = new Functions();
        System.out.println(funcs.decomposeArcCos(-1.1));
        System.out.println(funcs.decomposeArcCos(-1));
        System.out.println(funcs.decomposeArcCos(-0.9));
        System.out.println(funcs.decomposeArcCos(-0.5));
        System.out.println(funcs.decomposeArcCos(0));
        System.out.println(funcs.decomposeArcCos(0.5));
        System.out.println(funcs.decomposeArcCos(0.9));
        System.out.println(funcs.decomposeArcCos(1));
        System.out.println(funcs.decomposeArcCos(1.1));

        int array[] = new int[] {5,7,2,8,9,3,0,33};
        int arr[] = funcs.shellSort(array);
        for (int i: arr) {
            System.out.println(i);
        }

        Sound sound = new Sound(SoundType.Scream);
        sound.ringOut();

        Door door = new Door();
        door.isOpen(true);

        Clothes robe = new Clothes("Faded robe", "blue");
        Clothes belt = new Clothes("Crookswan University belt", null);
        List<Clothes> clothes = new LinkedList<Clothes>(Arrays.asList(robe,belt));

        Person angryPerson1 = new Person("Angry person 1", PersonType.AngryPerson);
        Person angryPerson2 = new Person("Angry person 2", PersonType.AngryPerson);
        angryPerson1.setClothes(clothes);
        angryPerson2.setClothes(clothes);

        Person footman1 = new Person("Footman 1", PersonType.Footman);
        Person footman2 = new Person("Footman 2", PersonType.Footman);
        footman1.stayNear(door);
        footman2.stayNear(door);

        angryPerson1.pushIt("footmans");
        angryPerson1.pushIt("footmans");
    }
}
