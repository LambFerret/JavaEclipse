package java_20210511;

// 공식 
public class ShapeManager {
	private static ShapeManager single;

	private ShapeManager() {
	}

	public static ShapeManager getInstance() {
		if (single == null) {
			single = new ShapeManager();
		}
		return single;
	}

	public void run(Shape s) {
		s.draw();
	}
}
