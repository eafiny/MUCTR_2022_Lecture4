package varargs;

public class VarargsClass {
    public static void main(String[] args) {
        VarargsClass obj = new VarargsClass();
        obj.varargsMethod(3,5,6,7,8);
    }

    private void varargsMethod(int i, int... args) {
        System.out.println(args.length);
    }
}
