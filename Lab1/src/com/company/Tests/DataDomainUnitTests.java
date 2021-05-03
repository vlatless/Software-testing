package com.company.Tests;

import com.company.DataDomain.*;
import org.junit.Test;

import javax.naming.ServiceUnavailableException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class DataDomainUnitTests {

    @Test
    public void CheckDoorAbleToOpen() {
        Door door = new Door();
        door.isOpen(true);

        assertTrue(door.isDoorOpen());

        door.isOpen(false);

        assertFalse(door.isDoorOpen());
    }

    @Test
    public void CheckPersonClothes() {
        Clothes drip = new Clothes("NF jacket", "black");
        Clothes belt = new Clothes(" University belt", null);
        List<Clothes> clothes = new LinkedList<Clothes>(Arrays.asList(drip,belt));
        Person person = new Person("Flexolog", PersonType.Unknown);
        person.setClothes(clothes);

        assertFalse(person.getClothes().isEmpty());
    }

    @Test
    public void CheckStayNear() {
        Person person = new Person("Chillolog", PersonType.Unknown);
        Person person1 = new Person("Prekolog", PersonType.Unknown);
        person.stayNear(person1);

        assertEquals(person1.getClass().getName(), person.getStayNear());
    }

    @Test
    public void CheckPushable() {
        Person bully = new Person("Bully", PersonType.AngryPerson);
        Person me = new Person("Me", PersonType.Unknown);
        String pushed = bully.pushIt(me);

        assertEquals(me.getClass().getName(), pushed);
    }

    @Test
    public void CheckCorrectSound() {
        Sound sound = new Sound(SoundType.Noise);
        sound.ringOut();
        String soundType = sound.getSoundType().name();

        assertEquals(SoundType.Noise.name(), soundType);
        assertNotEquals(SoundType.Scream.name(), soundType);
    }
}
