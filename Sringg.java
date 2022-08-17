package Otp;

public class Sringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "think twice";
		String c=s.toUpperCase();
		System.out.println(c);
		String s1="";
		String a[]= s.split(" ");
		//System.out.println);
		
		for(int i=a.length-1; i>=0;i--) {	

			s1 = s1 + a[i] + " ";
			
			}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a.length);
		System.out.println(s1);
		String s2="";
		char ch[]=s1.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			 
			s2 =s2 + ch[i] ;
		}
		System.out.println(s2);
	}

}
