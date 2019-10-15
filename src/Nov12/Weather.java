package Nov12;

class Temparature{
	private Double temp;
	public Temparature(){
		temp=(double) 25;
	}
	public Temparature(Double aTemp) {
		super();
		temp = aTemp;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double aTemp) {
		temp = aTemp;
	}
	
}
public class Weather {
	private Temparature temp;
	private int humidity;
	private int windspeed;
	private String windDirection;
	public Weather(){
		temp=new Temparature();
		humidity=50;
		windspeed=0;
		windDirection="W";
	}
	public Weather(Double aTemp, char aWindDirection) {
		super();
		temp = new Temparature(aTemp);
		humidity = 50;
		windspeed = 0;
		windDirection = aWindDirection+"";
	}
	public Temparature getTemp() {
		return temp;
	}
	public void setTemp(Temparature aTemp) {
		temp = aTemp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int aHumidity) {
		humidity = aHumidity;
	}
	public int getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(int aWindspeed) {
		windspeed = aWindspeed;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String aWindDirection) {
		windDirection = aWindDirection;
	}
	public String toString(){
		return "The weather is currently "+temp.getTemp()+" and "+getHumidity()+"% of humidity "+windspeed+" mph wind from "+windDirection;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + humidity;
		result = prime * result + ((temp == null) ? 0 : temp.hashCode());
		result = prime * result + ((windDirection == null) ? 0 : windDirection.hashCode());
		result = prime * result + windspeed;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weather other = (Weather) obj;
		if (humidity != other.humidity)
			return false;
		if (temp == null) {
			if (other.temp != null)
				return false;
		} else if (!temp.equals(other.temp))
			return false;
		if (windDirection == null) {
			if (other.windDirection != null)
				return false;
		} else if (!windDirection.equals(other.windDirection))
			return false;
		if (windspeed != other.windspeed)
			return false;
		return true;
	}
	
}
