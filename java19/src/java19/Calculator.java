package java19;

public class Calculator {
	//나는 또 올라갈거예요. git으로!
	//또 올라가요 2번째로!!!
	//3번째 올라가기 테스트!!
	public void use() {
		System.out.println("===사용가능합니다.");
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, double y) {
		int r = add(100, 200);
		return x + y + r;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
}
