public class Line {
	Coordinate x;
	Coordinate y;
	double slope;
	Line(Coordinate xx, Coordinate yy){
		x=xx;
		y=yy;
		slope=Calculateslope(xx.x, xx.y, yy.x, yy.y);	
	}
	boolean ontheLine(Coordinate l) {
		if (l.y-x.y==slope*(l.x-x.x))return true;
		return false;
		
	};
	
	double Calculateslope(double x1, double y1, double x2, double y2)
	{
	    return (y2 - y1) / (x2 - x1);
	}
}
