
abstract public class Indicator {
	//int time;
	Region reg;
	double weight;
	public Indicator(Region r, double w) {
		//time = t;
		reg=r;
		weight=w;
	}
	
	abstract boolean validateIndicator() throws Exception;
	abstract double valueIndicator()throws Exception;

}
