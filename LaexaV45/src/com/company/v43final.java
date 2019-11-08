package com.company;

import java.util.Scanner;

public class v43final {

	public static void main(String[] args) {
		
		
				int hej = 1;
				//Scanner for att ta in en variabel
				Scanner input = new Scanner(System.in);
				
				/*
				//Scanna/ta in talet Radius
				double radius = input.nextDouble();
				
				//Skriva ut Metoden doubleVoume
				System.out.println(doubleVolume(radius)); 
				*/
				
				
				/*
				 
				String str= input.nextLine();
				
				//Det som ska skrivas ut baklanges
				System.out.println(stringReverse(str));
				*/

				/*
				count(input.nextLine(),input.next().charAt(0));
				*/

				/*
				sjorovare(input.nextLine());
				*/

			}
				
			/*
			public static double doubleVolume(double radius) {
			//Ska rakna volymen
			//Math.(matematiska variabler)

				return((4 * Math.PI * Math.pow(radius, 3)) / 3);
			}
			*/

			/*
			 
			public static String stringReverse(String str) {
				
				String reverse = "";
				
				//En for-loop for att sprita pa en string och skirva den baklanges
				for(int i = str.length() -1; i >= 0; i--) {
					
					reverse = reverse + str.toLowerCase().charAt(i);
				}
				
				//Den som ska returnas till main metooden
				return reverse;
			}
			
			*/
			
			/**
			 * 
			 * @param str
			 * @param c
			 * @return
			 
			public static int count(String str, char c) {
				//Antal c som forekommer i String
				int totalRepeatsOfChar = 0;
				
				//For att rakna antal c
				for(int i = 0; i < str.length(); i++) {
					
					if (str.charAt(i) == c) {
						totalRepeatsOfChar++;
						
					}
				}
				return totalRepeatsOfChar;
					
			}
			*/
			
			
			/*
			 
			//FATTAR NOLL :(
		public static String sjorovare( String str) {
				
				String theResult = "";
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == ' ') {
						theResult = theResult + ' ';
					} else if (str.charAt(i) == 'x') {
						theResult = theResult + "koksos";
					} else if (str.charAt(i) == 'c') {
						theResult = theResult + "kok";
					} else if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == '�'
							|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'y' || str.charAt(i) == '�'
							|| str.charAt(i) == '�' || str.charAt(i) == 'A' || str.charAt(i) == 'O' || str.charAt(i) == 'U'
							|| str.charAt(i) == '�' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'Y'
							|| str.charAt(i) == '�' || str.charAt(i) == '�') {
						theResult = theResult + str.charAt(i);
					} else {
						theResult = theResult + str.charAt(i) + "o" + str.charAt(i);
					}
				}
				return theResult;
			}
			*/
			 
			

		


	}


