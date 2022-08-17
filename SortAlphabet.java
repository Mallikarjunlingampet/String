package Otp;

public class SortAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mallikarjun";
		char ch[]=s.toCharArray();
		//System.out.println(ch.length);
		//int a = (int) ch;
		//String s1="";
		//char c[] =new char[3];
		//System.out.println(c);
		
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
		System.out.println(ch);
		String ab = new String(ch);
		System.out.println("Sorting order : " + ab);

	}

}
