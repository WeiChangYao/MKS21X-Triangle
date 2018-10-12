public class Triangle{
	private Point v1,v2,v3;
	
	public Triangle(Point a, Point b, Point c){
		v1 = a;
		v2 = b;
		v3 = c;
	}
	
	public Triangle(double a,double b,double c,double d,double e,double f){
		v1 = new Point(a,b);
		v2 = new Point(c,d);
		v3 = new Point(e,f);
	}
	
	public double getPerimeter(){
		return (Point.distance(v1,v2) + Point.distance(v2,v3) + Point.distance(v1,v3));
	}

	public Point getVertex(int index){
		if (index == 0) {
			return new Point (v1); 
		}
		if (index == 1) {
			return new Point (v2);
 		}
		if (index == 2) {
			return new Point (v3);
 		}
		else{return null;}
	}


	public Point setVertex(int index, Point o){
		if (index == 0) {
			return v1 = new Point(o);
		}
		if (index == 1) {
			return v2 = new Point(o);
		}
		if (index == 2) {
			return v3 = new Point(o);
		}
		else{ return null;}
	}

	public String toString(){
		return "Triangle: A(" + v1.getX() + "," + v1.getY() + ") B("
				+ v2.getX() + "," + v2.getY() + ") C("
				+ v3.getX() + "," + v3.getY() + ")";
	}
}



