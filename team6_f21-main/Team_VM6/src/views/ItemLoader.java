package views;

import java.util.Scanner;
class ItemLoader {
	  public static void main(String[] args) {
		  // first step, creating 2 inputs by using Scanner method.
		  Scanner scan = new Scanner(System.in);
		  
			  String a=scan.next();
			  String b=scan.next();
			  String word = "";
			  int t = 1;
			for(int i= 0; i<7; i++) {
				for(int j = 0; j< 5; j++ ) {
					if(i!=0&& i!=1&& i !=5 &&i!=6) {
						word +=a;
					}
					else {
						word+=" ";
					}
					
				};
				
				for( int n=0; n<t; n++) {
					word+=b;
				};
				if(i<3) {
					t++;
				}
				else {
					t--;
				}
				
				
					word+="\n";
				
				
				
			};
			
		
			
			
			System.out.println(word);
		};
};