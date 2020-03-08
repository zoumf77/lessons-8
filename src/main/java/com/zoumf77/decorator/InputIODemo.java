package com.zoumf77.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputIODemo {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\output_idea.txt"));
		byte[] b;
		b = new byte[1024];
		while (bis.read(b) != -1) {

			System.out.println(new String(b));
		}
	}

}
