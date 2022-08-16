package Otp;

public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mallikarjun";
		char[] c= s.toCharArray();
		char ch[]= {'a','e','i','o','u'};
		int count=0;
		//int sum=0;
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<ch.length;j++) {
			if(c[i]==ch[j]) {
				System.out.println(c[i]);
				count++;
				
			}
			
		}}
		
		System.out.println("number of vowels are : " + count);
		System.out.println("number of consonents are : " + (s.length()-count));
		//System.out.println(sum);
	}

}
