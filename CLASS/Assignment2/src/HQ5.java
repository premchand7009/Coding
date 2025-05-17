package Assignment2;
class PointType{
	double x;
	double y;
	void showPoint() {
		System.out.println("(x,y)=("+x+","+y+")");
	}
	PointType(double x,double y){
		this.x=x;
		this.y=y;
	}
	PointType(){
		this.x=0;
		this.y=0;
	}
    double gety() {
    	return y;
    }
    double getx() {
    	return x;
    }
}
class CircleType extends PointType{
	
}
public class HQ5 {

	public static void main(String[] args) {
		

	}

}
