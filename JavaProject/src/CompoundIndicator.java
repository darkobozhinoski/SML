import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
public class CompoundIndicator extends Indicator {
	//Robot r;
	//int time;
	//Region reg;
	//boolean value;
	double weight;
	ArrayList<AtomicIndicator> swAI;
	//ArrayList<Range> rang;
	//ArrayList<Condition> conlist;
	Condition c;
	CompoundIndicator(ArrayList<Robot> rset, Region rg, double w, Condition con){
		super(rg,w);
		c=con;
		//time=d;
		//reg=rg;
		//weight=w;
		for (int i=1;i<rset.size();i++) {
			int id=i;
			Optional<Robot> r=rset.stream().filter(x-> x.getID()==id).findFirst();
			//Robot k=stream().filter(x -> x.getId() == 1).findFirst();
			if (r.isPresent()){
				Robot ks=r.get();
				AtomicIndicator ai=new AtomicIndicator(ks, rg, w);
				swAI.add(ai);
			}			
		}
		
	}
	//boolean validateAtomicIndicator() {
	//	if (reg.insideRegion(r.position))return true;
	//	return false;
	//}

	

	boolean checkCondition(double S, Condition t) throws Exception {
		 ScriptEngineManager mgr = new ScriptEngineManager();
		 ScriptEngine engine = mgr.getEngineByName("JavaScript");
		 String validate = Double.toString(S)+t;
		 boolean b= (boolean) engine.eval(validate);
		 return b;
	}


	@Override
	boolean validateIndicator() throws Exception{
		double Sum=0;
		Iterator<AtomicIndicator> it=swAI.iterator();
		while (it.hasNext()) {
			Sum+=((AtomicIndicator) (it.next())).valueIndicator();			
		}
		return checkCondition(Sum,c);	
		//	if (reg.insideRegion(r.position))return true;
		//	return false;
	}



	@Override
	double valueIndicator() throws Exception{
		double val = validateIndicator() ? 1 : 0;
		return val;
	}
}
