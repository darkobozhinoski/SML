
public class MissionInstantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordinate x=new Coordinate(0,2);
		Coordinate y=new Coordinate(1,9);
		Coordinate p=new Coordinate(2,17);
		Line l=new Line(x,y);
		boolean check=l.ontheLine(p);
		System.out.println(check);

	}

}
