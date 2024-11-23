public class TestOlha {
    public static void main(String[] args) {
        int a;
        int b;

        a=10;
        b=20;

        //-----Alla changed
        a=50;
        b=100;

        System.out.println(calculateSum(a, b));
    }

    private static int calculateSum(int a, int b) {
        int res = a + b;
        return res;
    }


}
