import java.util.ArrayList;

public class AtomicIndicator extends Indicator {
	Robot r;
	//int time;
	//Region reg;
	//double weight;
	AtomicIndicator(Robot k, Region rg, double w){
		super(rg,w);
		r=k;
		//time=n;
		//reg=rg;
		//weight=w;
	}
	@Override
	boolean validateIndicator() {
		if (reg.insideRegion(r.position))return true;
		return false;
	}
	@Override
	double valueIndicator() {
		double val = validateIndicator() ? 1 : 0;
		return weight*val;
	}
	
	double evaluateallRobots() {
		//ArrayList<Robot> rset, Region rg, int d, double w
		double val=0;
		return val;
		
		
	}
}

