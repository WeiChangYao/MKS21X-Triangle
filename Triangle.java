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
		return (v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3));
	}

	public Point getVertex(int index){
		if (index == 0) {
			return v1; }
		if (index == 1) {
			return v2; }
		else {
			return v3; }
	}

	public String toString(){
		return "Triangle: A(" + v1.getX() + "," + v1.getY() + ") B("
				+ v2.getX() + "," + v2.getY() + ") C("
				+ v3.getX() + "," + v3.getY() + ")";
	}
}

