package com.georgehigbie;

public class Main {

    public static void main(String[] args) {

        Sofa sofa = new Sofa(3, "very plush");
        Lights lights = new Lights(10, 2);

        LivingRoom livingRoom = new LivingRoom(4, 2, 3, "Great Room",
                sofa, lights, new Television(33, true) );

        livingRoom.beARoom();
        livingRoom.getNumberDoors();
        livingRoom.getRoomName();


    }


}
