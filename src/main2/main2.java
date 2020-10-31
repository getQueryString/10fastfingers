// Programmed with https://github.com/RaresBares/

package main2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Scanner;

public class main2 {
	
	public static void main(String[] args) throws Exception {
		
		Robot r = new Robot();
		
		Thread.sleep(2000);
		
		for(int i = 1; i < 1001; i++) {
			//String msg = "Ich nerve dich zum " + i + ". Mal";
			String msg = "" + i ;
			for (char c : msg.toCharArray()) {
				int code = c;
				if(Character.isUpperCase(c)) {
					r.keyPress(KeyEvent.VK_SHIFT);
				}
				
				if(code > 96 && code < 123) code = code - 32;
				r.delay(250);
				
				
			r.keyPress(code);
			r.keyRelease(code);
			if(Character.isUpperCase(c)) {
				r.keyRelease(KeyEvent.VK_SHIFT);
			}
			}
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println(i);
		}
	}

}
