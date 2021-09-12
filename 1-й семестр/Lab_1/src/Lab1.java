import java.util.Random;

public class Lab1 {
    public static void main(String[] str) {
        ThreeArray threeArray = new ThreeArray(11, 19, -4.0d, 11.0d);
        threeArray.fillArray_a();
        threeArray.fillArray_x();
        threeArray.calculate_ans();
        threeArray.print_ans();
    }
}

class ThreeArray {
    int[] a;
    double[] x;
    double[][] ans;
    double minRand;
    double maxRand;

    public ThreeArray(int limit_a, int limit_x, double minRand, double maxRand) {
        a = new int[limit_a];
        x = new double[limit_x];
        ans = new double[limit_a][limit_x];
        this.minRand = minRand;
        this.maxRand = maxRand;
    }

    void fillArray_a() {
        for(int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 1;
        }
    }

    void fillArray_x() {
        for(int i = 0; i < x.length; i++) {
            x[i] = minRand + new Random().nextDouble() * (minRand - maxRand);
        }
    }

    void calculate_ans() {
        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[i].length; j++) {
                if(a[i] == 17) {
                    ans[i][j] = Math.pow(Math.PI * (Math.tan(x[i]) * 0.5 + 2), 3);
                }
                else if(a[i] > 2 && a[i] < 20 && a[i] % 2 != 0) {
                    ans[i][j] = Math.pow(Math.sin(Math.pow(Math.PI * (x[i] - 0.25),3)),1d / 3);
                }
                else {
                    ans[i][j] = Math.pow(Math.tan(Math.pow(2 * Math.pow(x[i], x[i]/(x[i] - Math.PI)), 3)), Math.PI/(1 - Math.tan(Math.atan(Math.pow(Math.E, -Math.abs(x[i]))))));
                }

            }
        }
    }

    void print_ans() {
        for (double[] line : ans) {
            for (double answer : line) {
                System.out.printf("%.3f ", answer);
            }
            System.out.println();
        }
    }
}
