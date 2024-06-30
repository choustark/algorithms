package com.chou.algorithms;

/**
 * @ClassName App
 * @Description TODO
 * @Author Axel
 * @Date 2021/2/25 10:16
 * @Version 1.0
 */

public class App {
    public static void main(String[] args) {
       /* double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);
        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();
        Counter c = new Counter("hits");
        for (int t = 0; t < T; t++)
        {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            if (box.contains(p)) c.increment();
            else p.draw();
        }
        StdOut.println(c);
        StdOut.println(box.area());*/
        /*StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);*/

       /* List<String> list = new ArrayList<>(2);
        list.add("新品");
        list.add("火爆品");

        List<String> list1 = new ArrayList<>(4);
        list1.add("火爆品");

        list.removeIf(e->{
            return list1.contains(e);
        });
        System.out.println(list);*/
        // 打印10 的二进制
        String s = Integer.toBinaryString(1);
        String s1 = Integer.toBinaryString(10);
        System.out.println(s);System.out.println(s1);


    }
}
