package Otp;

public class Sringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "think twice";
		String c=s.toUpperCase();
		System.out.println(c);
		String s1="";
		String a[]= s.split(" ");
		
		for(int i=a.length-1; i>=0;i--) {
			
			s1= s1 + a[i];
		}
		System.out.println(s1);

	}

}
