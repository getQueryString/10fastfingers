// Programmed with https://github.com/RaresBares/

package main1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Scanner;

public class main1 {

    public static void main(String[] args) throws Exception {

        Robot r = new Robot();
        Scanner sc = new Scanner(System.in);
        String msg = "";
        while (msg == "") {
            if (sc.hasNextLine()) {
                msg = sc.nextLine();
            }
        }
        System.out.println("Wird gesendet...");
        Thread.sleep(3000);

        String[] words = msg.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            //char[] chars = word.toCharArray();
            //for(char c : msg.toCharArray()) {
            for (char c : word.toCharArray()) {
                int code = c;
                if (Character.isUpperCase(c)) {
                    r.keyPress(KeyEvent.VK_SHIFT);
                }
                if (code > 96 && code < 123) code = code - 32;
                r.delay(110);
                r.keyPress(code);
                r.keyRelease(code);
                if (Character.isUpperCase(c)) {
                    r.keyRelease(KeyEvent.VK_SHIFT);
                }
            }

            r.keyPress(KeyEvent.VK_SPACE);
            r.keyRelease(KeyEvent.VK_SPACE);
        }
    }

}
