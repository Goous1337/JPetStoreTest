package ru.jpetstoretest.helper;

import java.util.Random;

public class RandomHelper {

    public String getRandomString(int targetStringLength ) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public String getRandomEmail(int targetStringLength){
        return getRandomString(targetStringLength) + "@gmail.com";
    }

}
