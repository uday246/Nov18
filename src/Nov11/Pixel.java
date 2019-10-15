package Nov11;

public class Pixel {
	private int r;
	private int g;
	private int b;
	public Pixel(){
		r=g=b=255;
	}
	public Pixel(int aR, int aG, int aB) {
		super();
		if(aR>=0 && aR<=255)
			r = aR;
		else
			r=0;
		if(aG>=0 && aG<=255)
			g = aG;
		else
			g=0;
		if(aB>=0 && aB<=255)
			b = aB;
		else
			b=0;
	}
	
}
