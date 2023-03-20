package com.driver;

public class Main {

    static class  Product{

        int product(int x,int y){
            return  x*y;
        }

        int product(int x,int y,int z){
            return  x*y*z;
        }

        double product(double x,double y){
            return x*y;
        }


    }

    public static  void main(String[] args){
        Product p=new Product();
      int ans1=  p.product(2,3);
      int ans2=p.product(2,3,4);
      double ans3=p.product(2.34,4.33);
      System.out.println(ans1+" "+ans2+" "+ans3);


    }

}