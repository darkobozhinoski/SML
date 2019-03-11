import java.util.*;

public class ObjectiveFunction {
	int TIMEBUDGET;
	ArrayList<Indicator> setAI;
	double k; //weight
	ObjectiveFunction(ArrayList<Indicator> v, int t, double ks){
		setAI=v;
		TIMEBUDGET=t;
		k=ks;
	}
	
	double CalculateObjectiveFunction() throws Exception {
		double S=0;
		for (Indicator i: setAI) {
			 if(i instanceof AtomicIndicator){
				 
				 
			 }
			
			
			S+=i.valueIndicator();
		}
		return S;
	}
}
