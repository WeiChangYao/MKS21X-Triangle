public class DriverT{
	public static void main(String[]args){
    		Point P1 = new Point(1,1);
    		Point P2 = new Point(2,1);
   		System.out.println(  Point.distance(P1,P2));
		System.out.println(  P1.distanceTo(P2));
		Triangle T = new Triangle(1,1,2,2,3,3);
		System.out.println(  T.getPerimeter());
		System.out.println(  T.toString());
		System.out.println(  T.getVertex(0));
  }
 }

