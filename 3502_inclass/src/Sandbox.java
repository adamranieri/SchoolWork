
import java.util.Scanner;
import java.math.*;

public class Sandbox {

	public static void main (String [] you_can_type_anything_here)
	{	
		int [][]s=  new int[5][7];
		int [][] data4 =  new int[8][1];
		System.out.println(data4[1][0]);
		
		
	//	print2DArray(blarg);
	//	double []x = new double[]{1,2,3};
		
	
		
	}
	/*
	String str1 = reader.nextLine();
	String str2 = reader.nextLine();
	
	int test = str1.compareTo(str2);
	System.out.println(test);
	/*
	
	
	/*	
	int input = reader.nextInt();
	System.out.println("hello");
	
		if (input %5 ==0 ){
			System.out.println("HiFive");		
		}
		if (input %2 == 0){
			System.out.println("HiEven");
		}
		/*
	/*
	System.out.println(Math.pow(2, 3));
	System.out.println(Math.pow(4, 0.5));
	System.out.println(Math.pow(2.5, 2));
	System.out.println(Math.pow(2.5, -2));
	
	Scanner reader = new Scanner(System.in);	
	System.out.println("please input the tempereature in farenheit");
	double farenheit = reader.nextDouble();
	System.out.println( (5.0/9.0)* (farenheit-32));
	*/
		
	/*
	int i = 4;
	int j = i;
	i++;
	System.out.println("j="+ j);
	System.out.println("i=" + i );
	*/
	
	/*
	Scanner reader = new Scanner(System.in);		
	System.out.println("please insert the radius of a circle");	
	float r = reader.nextFloat();	
	double area = 3.14*r*r;	
	System.out.println((float)area);
	
	int age;
	double weight;
	
	if (age >=16 && weight >=110 ){
		System.out.println("Eligible");
	
	}else{
		System.out.println("not elligible");
	}
	
	53 - Remember to get enough calcium
	16 - look both ways for cars
	2 - look both ways for cars 
	
	*/
	
//	
//	System.out.println("have you ever driven a car y/n?");
//	String input = reader.nextLine();
//	
//	if (input == "y"){
//		System.out.println("whats the fastest youu have driven?");
//		int response = reader.nextInt();
//		System.out.println("It must have been fun to drive "+ response );
//	
//	if(input == "n"){
//		System.out.println("so you have never driven");
//	}
//		
//		
//	}
	
	/*
	System.out.println("Enter a year and find the amimal");
	int year = reader.nextInt();
	year =  year % 12;
	
	switch (year){
	
	case 0:{
		System.out.println("monkey");
	(11*16^0) + (2*16^1) +( 4*16^2)+ (10*16^3) = A42B =
		break;
	}
	

	case 1:{
		System.out.println("rooster");
		break;
	}
	
	if (x==0 ||x== 1) ? x+ "is a binary digit": x + "not a binary digit";
	
	*/
	
	// just for the lols
//	int x = 1;
//	
//	while (x<=499){
//		System.out.println(x+ " loops are awesome ");
//		x++;
//
//	}
//

//	new Integer(Integer.parseInt(a));
//	int sum = 0;
//	int x = 0;	
//	boolean single = true;
//	while (single){
//		System.out.println("enter a number");
//		String input = reader.next();
//		int result = Integer.parseInt(input);			
//		sum =  result + sum;
//		System.out.println("the sum is " + sum);
//		
//		
//	}
//	String letters = "lajsdnflkjasndlkvnbajndlgbjansldgjangf";
//
//	for(int i = 1; i<10; i++){
//		
//		for(int k=1; k<10; k++){
//			System.out.print(i*k+ "");
//			}
//			
//		
//	}
//	
//	Scanner reader = new Scanner(System.in);
//	System.out.println("Welcome to the calculator. Which number would you like to stop at? " );
//	String sentence = "lsdkjflasjdgflkasdfja sldkflskadflkasld flsdkfmlaskdflksadmf jhiu";	
//	String[] parts = sentence.split("");
//	
//	System.out.println(parts[0]);
	
//	
//	Scanner reader = new Scanner(System.in);
//		
//	while (true){
//	double sum = 0;
//	System.out.println("enter valid hexadecimal");
//	String input = reader.next();	
//	int length = input.length();
//	
//	for(int i =0; i<length; i++){	
//	char place = input.charAt(i);
//	String possible = "0123456789ABCDEF";
//	
//	if(possible.indexOf(place) == -1){
//		System.out.println("invalid number!");
//		break;
//	}
//	}
//	
//	for(int x =length, i =0; x >0;x--, i++){
//		
//		String possible = "0123456789ABCDEFabcdef";
//		int result = possible.indexOf(input.substring(i,i+1));;
//		sum = sum + result* (Math.pow(16, x-1));	
//	}	
//	System.out.println("the sum is " + sum);
//	
//	}
		
//	blarg();
//		
//		
//	}
//	public static void blarg() {
//		
//		System.out.println("blarg");
//		System.out.println("blarg");
//		System.out.println("blarg");
//		
//		double [] x = {1,4,13};
//		mystery(x);
//		System.out.println(mystery(x));
//		x[0]= x[1];
//		
//		
//		char [] charRayZard = {'a','b','c','d'};
//		char [] copy =  new char[4]; 
//		
//		for(int i=0; i< charRayZard.length; i++){
//		
//		
//		}
//	}
//
//	public static double mystery(double []y){
//		
//		double [] z=  y;
//		double max=0;
//		for (int i =0 ; i<2; i++){
//		if (z[i]>z[(i+1)]){
//			 max =z[i];	
//		}else{
//			max = z[i+1];
//		}
//		
//		}
//		
//		return max ;	
//		
//		public static void print2DArray(int [][]ray){
//			int result;
//			
//			for(int i=0;i<ray.length;i++){
//				for (int j=0;j<ray[i].length;j++){
//					
//					result = ray[j][i]+ray[j][i];
//					System.out.println(result);
//					
//					
//					
//					
//				}
//					
//			}
//			
//
	
		
		}
	

	
	

