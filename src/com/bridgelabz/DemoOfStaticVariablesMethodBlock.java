/* problem statement ->
1.6 Write a program to demonstrate static variables, methods, and blocks.
  */

package com.bridgelabz;
public class DemoOfStaticVariablesMethodBlock {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bl;
    static void PrimitiveDatatype()
    {
        int i=10;
        System.out.println("Byte :"+b);
        System.out.println("Short :"+s);
        System.out.println("Int :"+i);
        System.out.println("Long :"+l);
        System.out.println("Float :"+f);
        System.out.println("Double :"+d);
        System.out.println("Char :"+c);
        System.out.println("Boolean :"+bl);

    }
    static {
        System.out.println("inside static block");
    }
    public static void main(String[] args)
    {
        System.out.println("The default values of primitive data types are:");
        DemoOfStaticVariablesMethodBlock dsvm=new DemoOfStaticVariablesMethodBlock();
        dsvm.PrimitiveDatatype();

    }

}
