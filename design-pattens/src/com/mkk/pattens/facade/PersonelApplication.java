package com.mkk.pattens.facade;

public class PersonelApplication {
    public static void main(String[] args) {
        PersonelWithSecurityFacade f = new PersonelWithSecurityFacade();
        f.createPersonelWithDoorSecurityPolicy("Gani","Tombalak",DoorsRepository.getDoors());
    }
}
