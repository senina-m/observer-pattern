package ru.senina.itmo.friends;

import ru.senina.itmo.ComeToBirthday;
import ru.senina.itmo.BirthdayCaller;

import java.util.ArrayList;

public class Friend implements ComeToBirthday, BirthdayCaller {
    private final String name;
    public Friend(String name){
        this.name = name;
    }

    private final ArrayList<Friend> friends = new ArrayList<>();


    @Override
    public void comeToParty() {
        System.out.println(this.name + " came to birthday!");
    }

    @Override
    public void callToBirthday() {
        System.out.println("Hey, guys how about a celebration!?");
        friends.forEach(friend -> {
            System.out.println(this.name + " called " + friend.getName() + " for his birthday!");
            friend.notifiedAboutBirthday();
        });
    }

    private void notifiedAboutBirthday() {
        comeToParty();
    }

    public String getName(){
        return this.name;
    }

    public void addFriend(Friend friend){
        friends.add(friend);
    }
}
