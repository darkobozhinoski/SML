import java.util.*;
public abstract class Polygon extends Region {
	//Polygon(Coordinate center, double radius, Color col){
	Polygon(Set<Coordinate> s,Color col){
		super(s, col);	
	}
	//abstract void findVertexes();
}
