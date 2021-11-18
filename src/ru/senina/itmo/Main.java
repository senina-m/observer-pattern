package ru.senina.itmo;

import ru.senina.itmo.friends.Boy;
import ru.senina.itmo.friends.Tiger;
import ru.senina.itmo.friends.Rabbit;
import ru.senina.itmo.friends.Bear;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Кролик");
        Bear bear = new Bear("Винни");
        Tiger tiger = new Tiger("Тигр");
        Boy boy = new Boy("Робин");

        boy.addFriend(rabbit);
        boy.addFriend(bear);
        boy.addFriend(tiger);

        boy.callToBirthday();
    }
}
