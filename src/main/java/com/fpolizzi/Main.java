package com.fpolizzi;

// import this class which is defined in the
// dependency section in our pom.xml
import net.datafaker.Faker;

/**
 * Created by fpolizzi on 05.04.26
 */
public class Main {

    static void main() {

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().city());
    }
}
