/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x;
    int y;
        // كتابة المتغيرات التي سايدخلها المستخدم
    int z=0;
    int c=1;
    //المتغيرات التين تنوب عن الرقم 
    // استدعاءمكتبة التي من خلالها يتم ادخل من مستخدم
    Scanner s=new Scanner(System.in);
    System.out.println("ادخل الرقم الاول المطلوب جمعه:");
    x=s.nextInt();
    System.out.println("ادخل الرقم الثاني المطلوب ضربه:");
    y=s.nextInt();
    //وضع جملة التكرار 
    for(int i=0;i<=x;i++){
        z=i+z;
    }
    System.out.println("ناتج الجمع التراكمي للعدد الاول هو:"+z);
     for(int i=1;i<=y;i++){
        c=i*c;
    }
    System.out.println("ناتج الضرب التراكمي للعد الثاني:"+c) ;
}
}
