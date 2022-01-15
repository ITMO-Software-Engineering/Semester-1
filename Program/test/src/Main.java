import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperator a = (x,y) -> x+y;
        IntBinaryOperator b = cla::c;
    }
}
class cla {
    public static int c(int x, int y) {
        return x*y;
    }
}
