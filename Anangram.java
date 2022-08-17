package Otp;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="caree";
		String y="raceee";
		char ch[]=x.toCharArray();
		char c[]=y.toCharArray();
		//System.out.println(x.charAt(0));
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if((int)ch[i]>(int)ch[j]) {
					//System.out.println(ch[i]);
					//break;
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					//c[i]= ch[i];
				}
				
			}
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1; j<c.length;j++) {
				if(c[i]>c[j]) {
					char sum=c[i];
					c[i]=c[j];
					c[j]=sum;
				}
				
			}
		}
		
		System.out.println(ch);
		
		System.out.println(c);
		
		String s1 = new String(ch);
		String s2 = new String(c);
		
		
		System.out.println(s1.equals(s2));
		
		if(s1.equals(s2)) {
			System.out.println("This is anagram");
		}
		else {
			System.out.println("Not anagram");
		}


	}

}
