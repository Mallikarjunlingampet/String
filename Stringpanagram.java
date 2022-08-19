package Otp;

public class Stringpanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the quick brown fox jumps over a lazy dog";
		      char abc[]=s.toCharArray();
		int a =97;
		int b=0;
		char ch[]= new char[26];
		char cha[]=new char[26];
		for(int i=0; i<26; i++) {
			ch[i]=(char)a;
			a++;
			
		}
		for(int i=0;i<26;i++) {
			//System.out.print(ch[i]);
		}
		 
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<abc.length;j++) {
				if(ch[i]==abc[j]) {
//					cha[i]=abc[j];
//					abc[j]=0;
					System.out.print(ch[i]);
					b++;
					break;
				}
			}
		}
		System.out.println(" ");
			System.out.println(b);
			
			if(b==26) {
				System.out.println("this is panagram");
			}
			else {
				System.out.println("this is not panagram");
			}
	}

}
