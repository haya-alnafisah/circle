/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg4;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Homework4 {

    public static void ocean(double y,int x){
        /*قمت بانشاء داله تحتوي على توقيع وجسم 
        وعرفت ماعاملات وداخل قيمة الثابته الي هي
        3.14
        ثم انشات متغير لكي احفظ فيه عمليه الحسابي التي قم بها للمحيط الدائرة
        */
        y=3.14;
       double o;
       o=2*y*x;
       System.out.println(":محيط الدائرةهو"+o);  
    }
     public static void area(double z,int x){
         /* قمت بانشاء داله اخرى للحساب مساحة الدله تحتوي علو توقيع وجسم 2
         ويتم استدعلئها تحت 
         */
         z=3.14;
         double w;
         w=z*x*3;
         System.out.println("مساحة الذائرة هي:"+w);   
     }
     //قمت بانشاء داله اخرى تحمل توقيع وهنا مطلوب يكون فيها قيمه مسترجعه3
     public static double size(double z,int x){
         return((x*3*x)*z);
    
}
    public static void main(String[] args) {
        //قمت بعمل امر الطباعه
       System.out.println("اهلا بك في برنامج معلومات الدائرة");
       //تعريف المتغير الذي سيدخله المستخدم عن طريق سكنر ويكون عدد صحيح
       int x;
       Scanner n=new Scanner(System.in);
       System.out.println("فضلا ادخل قيمة نصف القطر");
       x=n.nextInt();
       /*ادخل متغيرين عشان اسوي طريقخه او داله تستدعي من خلال 1
       المعاملين الي دخلتهم
       */
       double h=3.14;
       int b=x;
       ocean(h,b);
       //عمالية الاستدعاء2
       area(h,b);
       //عمالية الاستدعء 3
       size(h,b);
       // الططباعه  تكون بالmain
      double z=3.14;
     double a=(x*3*x)*z;
       System.out.println("حجم الدائرة هو:"+a);
       
      
       
       
     
      
    }
    
}
