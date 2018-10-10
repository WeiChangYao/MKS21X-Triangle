public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }  
	
  public static double distance(Point a,Point b){
    return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())
                    +(a.getY()-b.getY())*(a.getY()-b.getY()));
  }

  public double distanceTo(Point b){
    return Math.sqrt((this.getX()-b.getX())*(this.getX()-b.getX())
                    +(this.getY()-b.getY())*(this.getY()-b.getY()));
  }
}

