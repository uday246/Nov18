package Nov2;

class Array {
	private double arr[];
	private int size;
	private int len;

	public Array() {
		size = 20;
		arr = new double[size];
	}

	public Array(int s) {
		size = s;
		arr = new double[size];
	}

	public void insert(double ele){
		if(len==size-1){
			System.out.println("Array is full");
			
		}
		else{
			arr[len++]=ele;
			
		}
	}
	public double delete(){
		if(len<0)
		{
			System.out.println("Array is empty");
			return -1;
		}
		else
		return arr[len--];
	}
	public void display(){
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+",");
		System.out.println();
	}

	public double[] getArr() {
		return arr;
	}

	public void setArr(double[] aArr) {
		arr = aArr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int aSize) {
		size = aSize;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int aLen) {
		len = aLen;
	}
	
}
public class TestArray{
	public static void main(String[] args) {
		Array a = new Array();
		a.insert(10);
		a.insert(12);
		a.insert(144);
		a.insert(13);
		a.insert(112);
		a.display();
		a.delete();
		a.delete();
		a.display();
		
		int count=1;
		int value=31;
		while(value>=10){
			value=value-count;
			count=count+3;
		}
		System.out.println(count);
		System.out.println(value);
		
		
	}
}
