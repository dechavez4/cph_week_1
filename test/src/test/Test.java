package test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String temp;

        String[] navne = {
            "Oliver",
            "Noah",
            "Alma",
            "William",
            "Victor",
            "Laura",
            "Oscar",
            "Sofia",
            "Ida",
            "Freja"
        };

        for (int i = 0; i < navne.length; i++) {
            for (int j = 0; j < navne.length; j++) {
                if (navne[i].compareTo(navne[j]) < 0) {
                    temp = navne[i];
                    navne[i] = navne[j];
                    navne[j] = temp;
                }
            }
        }

        for (int i = 0; i < navne.length; i++) {
            System.out.println(navne[i]);
        }
    }

}
