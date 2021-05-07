package java_20210504;

public class TriangleMaker {
    public void printTriangle(int height) {
        if (height == 1) {System.out.println("*");} else {
            printTriangle(height - 1);
            for (int i=1 ; i<height+1; i++) {
                System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
}