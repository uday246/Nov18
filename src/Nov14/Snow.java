package Nov14;

public class Snow {
public static void main(String[] args) {
	String[] months={"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
	double snow[]={22.5,27.2,18.5,2.5,0,0,0,0,0,1.7,2.9,16.7};
	double q1=0,q2=0,q3=0,q4=0;
	for(int i=0;i<snow.length;i++){
		if(i>=0 && i<=2)
			q1+=snow[i];
		if(i>=3 && i<=5)
			q2+=snow[i];
		if(i>=6 && i<=8)
			q3+=snow[i];
		
		if(i>=9 && i<=11)
			q3+=snow[i];
		
	}
	q1=q1/3;
	q2=q2/3;
	q3=q3/3;
	q4=q4/3;
	System.out.printf("JAN-MAR : %.2f\n",q1);
	System.out.printf("APR-JUN: %.2f\n",q2);
	System.out.printf("JUL-SEP: %.2f\n",q3);
	System.out.printf("OCT-DEC: %.2f",q4);
	
	
}
}
