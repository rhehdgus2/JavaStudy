package Chapter7;

//메인 클래스 정의
public class Example7_4 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);  // Point3D 클래스의 인스턴스 생성
		System.out.println("x = " + p.x + ", y = " + p.y + ", z = " + p.z);
	}
}
//Point 클래스 정의
class Point {
	int x, y;
	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
//Point3D 클래스 정의, Point 클래스를 상속
class Point3D extends Point {
	int z;
	// 생성자
	Point3D(int x, int y, int z) {
		super(x, y);  // Point(int x, int y)를 호출
		this.z = z;
	}
}
