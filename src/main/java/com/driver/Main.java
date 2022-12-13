package com.driver;



public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x + y;

        }

        public int product(int x,int y,int z)
        {
            return x*y*z;

        }
        public double product(double x,double y)
        {
            return x+y;

        }




    }
    public static void main(String[] args)
    {
        Product obj=new Product();
       obj.product(3,4);
        obj.product(3,4,5);
      obj.product(33.00,44.00);


    }

}