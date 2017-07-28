package xuan.test;

import io.reactivex.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s = "tt";
        int sss = 1;
        System.out.println( "Hello World!" );
        Flowable.just("Hello world");
        int ss = 23;
        test(ss);
    }

    private static void test(int i)
    {
        System.out.println( "in test!" + i );
    }
}
