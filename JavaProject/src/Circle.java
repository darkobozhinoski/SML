
public class Circle extends Region{
	Circle(Coordinate center, double radius, Color col){
		super(center,radius, col);	
	}
	@Override
	boolean insideRegion(Coordinate l){
		if (Math.sqrt(Math.pow(l.x, center.x)+Math.pow(l.y, center.y))<=dimension) return true;
		return false;
		//(x - center_x)^2 + (y - center_y)^2 < radius^2
	}
}
