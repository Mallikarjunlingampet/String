package Otp;

public class RepeatedOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="malayalam";
		char abc[]=m.toCharArray();
		
		char ch[]= new char[m.length()];
	
		for(int i=0; i<abc.length; i++) {
			for(int j=i+1; j<abc.length; j++) {
				if(abc[i]==abc[j] ) {
					
					
						//System.out.println(abc[j]);
						
					ch[i]= abc[i];
						abc[j]=0;
						
						//break;
						
						
				}
				
			}
			
		}
      	System.out.println(ch);
		
		
	
		
		

	}

}
