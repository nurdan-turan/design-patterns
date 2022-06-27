package org.example.builderpattern;

import lombok.*;

@Getter
@Setter
@Builder
public class UserLombok {
    private String identityNumber;
    private String name;
    private String surname;
    private Integer age;
    private Integer gender;

    public UserLombok(String identityNumber, String name, String surname, Integer age, Integer gender) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        UserLombok userLombok = UserLombok.builder()
                .identityNumber("12345")
                .name("nurdan")
                .surname("turan")
                .age(27)
                .build();

        System.out.println(userLombok.getIdentityNumber());
        System.out.println(userLombok.getName());
        System.out.println(userLombok.getSurname());
        System.out.println(userLombok.getAge());

    }
}
