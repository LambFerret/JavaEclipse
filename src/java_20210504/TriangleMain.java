package java_20210504;

public class TriangleMain {
    public static void main(String[] args) {
    	TriangleMaker printer = new TriangleMaker();

        // 테스트
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);
    }
}