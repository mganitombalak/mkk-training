package com.mkk.pattens.facade;

import java.util.Arrays;
import java.util.Random;

public class PersonelWithSecurityFacade {
    public void createPersonelWithDoorSecurityPolicy(String firstName, String lastName, int... doors) {
        Personel p = new Personel();
        p.setId(new Random().nextInt() * 100);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.save();
        Arrays.stream(doors).forEach(d -> {
            new DoorSecurityPolicy(d,p.getId(), (d % 2 == 0)).save();
        });
    }
}
