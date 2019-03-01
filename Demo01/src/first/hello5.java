package first;

/**
 * @author shkstart
 * @create 2019-03-01 10:08
 * @Package first
 */

public class hello5 {
    public static final String m="s";
    public static final int a=10;


    public static void main(String[] args) {
        int m=10;
        System.out.println("m = " + m);
        System.out.println("args = [" + args + "]");
        int n=11;
        System.out.println("hello5.main");
        System.out.println(m);
        try {

            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
