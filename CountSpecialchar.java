package Otp;

public class CountSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="m@!!ik@r!jun";
		String s1="";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=33 && (int)s.charAt(i)<=46 || (int)s.charAt(i)>=58 && (int)s.charAt(i)<=64) {
				s1 = s1+ s.charAt(i);
				count++;
			}
		}
		System.out.println(s1);
		System.out.println(count );

	}

}
