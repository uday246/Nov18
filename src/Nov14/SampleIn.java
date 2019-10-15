package Nov14;

public class SampleIn {
	public static void main(String[] args) {
		int c=0;
		int c1=0;
		
		for(int i=0;i<256;i++){
			String str=Integer.toBinaryString(i);
			while(str.length()<8){
				str="0"+str;
				
			}
			if(str.contains("0000")||str.contains("1111"))
				c++;
			int test=0;
			if(str.contains("000")){
				for(int j=0;j<str.length();j++)
					if(str.charAt(j)=='1')
						test++;
				if(test==5)
					c1++;
			}
			if(str.endsWith("1"))
				c1++;
		}
		System.out.println(c);
		System.out.println(c1);
		
	}
}
