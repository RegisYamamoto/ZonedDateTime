package com.regis;
import java.time.ZonedDateTime;

public class Inicio {

	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now); 
		
		ZonedDateTime nowMais30 = now.plusMinutes(30);
		System.out.println(nowMais30);
		
		ZonedDateTime nowMenos30 = now.minusMinutes(30);
		System.out.println(nowMenos30);

	}

}