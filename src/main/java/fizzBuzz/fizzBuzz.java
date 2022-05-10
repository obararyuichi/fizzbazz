package fizzBuzz;

public class fizzBuzz {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println(fizzBuzz2(i));
		}
	}
	public static String fizzBuzz2(int num) {
		String w="";
		if (num%3.0==0) {w += "Fizz";}
		if (num%5.0==0) {w += "Buzz";}
		if ("".equals(w)) w=String.valueOf(num);
		return w;
	}
}
