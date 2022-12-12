package com.driver;



public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x + y;

        }

        public int product(int x,int y,int z)
        {
            return x+y+z;

        }
        public double product(double a,double b)
        {
            return a+b;

        }




    }
    public static void main(String[] args)
    {
        Product obj=new Product();
        int ans1=obj.product(3,4);
        int ans2 =obj.product(3,4,5);
      double ans3= obj.product(33.00,44.00);
        System.out.println(ans1 +" "+ans2+" "+ans3);


    }

}