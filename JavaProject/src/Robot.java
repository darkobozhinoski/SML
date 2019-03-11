
public class Robot {
	public int id;
	Coordinate position;
	Robot(int i, Coordinate l){
		id=i;
		position=l;
	}
	int getID() {return id;}
	Coordinate getCoordinate() {return position;}
	
}
