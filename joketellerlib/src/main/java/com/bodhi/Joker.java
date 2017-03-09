package com.bodhi;

import java.util.Random;

public class Joker {
    public static String[] jokes = {"Did you hear about the guy who broke both his left arm and left leg?\n" +
            "\n" +
            "He is all right now.","A beggar meets another beggar. A software engineer meets another\n" +
            "software engineer. Both of them ask the same question to each other.\n" +
            "What is the question ???\n" +
            "\n" +
            "\n" +
            "So, Which Platform are you Working on ???....\n","Why dont blind people skydive?\n" +
            "\n" +
            "Because it scares the crap out of their dogs.","I waited and stayed up all night and tried to figure out where the sun was.\n" +
            "\n" +
            "Then it dawned on me."};

    public String getJoke(){
        return  jokes[randInt(jokes.length-1)];
    }

    public static int randInt(int max) {


        Random rand = new Random();



        int randomNum = rand.nextInt(max);

        return randomNum;
    }
}
