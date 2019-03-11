import java.util.*;
public abstract class Region {
	//Set<Coordinate> r;
	Coordinate center;
	Set<Coordinate> vertexes;
	double dimension;
	Color c;	
	abstract boolean insideRegion(Coordinate l);
	Region (Coordinate l,  double d, Color col){
		center=l;
		c=col;
		dimension=d;
	}
	Region(Set<Coordinate> v,Color col){
		vertexes=v;
		c=col;
	}
}

