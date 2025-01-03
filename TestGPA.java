// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class TestGPA {
   public TestGPA() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = 0.0;
      int var4 = 0;
      boolean var5 = false;

      int var14;
      do {
         System.out.print("Enter a course [1] Calculate GPA [2] >>> ");
         var14 = var1.nextInt();
         if (var14 == 2) {
            double var15 = var2 / (double)var4;
            System.out.println("Total GPA: " + var15);
         } else if (var14 == 1) {
            System.out.print("What is the course rigor (On-Level[1] Advanced[2] AP[3]) >>> ");
            int var6 = var1.nextInt();
            System.out.print("Does your course have 1 or 2 semesters? >>> ");
            int var7 = var1.nextInt();
            double var8;
            double var10;
            if (var7 == 1 && var6 == 1) {
               System.out.print("Enter the grade of the course >>> ");
               var8 = var1.nextDouble();
               var10 = 100.0 - var8;
               var8 = 5.0 - var10 * 0.1;
               var2 += var8;
               ++var4;
            } else if (var7 == 1 && var6 == 2) {
               System.out.print("Enter the grade of the course >>> ");
               var8 = var1.nextDouble();
               var10 = 100.0 - var8;
               var8 = 5.5 - var10 * 0.1;
               var2 += var8;
               ++var4;
            } else if (var7 == 1 && var6 == 3) {
               System.out.print("Enter the grade of the course >>> ");
               var8 = var1.nextDouble();
               var10 = 100.0 - var8;
               var8 = 6.0 - var10 * 0.1;
               var2 += var8;
               ++var4;
            } else {
               double var12;
               if (var7 == 2 && var6 == 1) {
                  System.out.print("Enter the first semester grade of the course >>> ");
                  var8 = var1.nextDouble();
                  System.out.print("Enter the second semester grade of the course >>> ");
                  var10 = var1.nextDouble();
                  var12 = 0.0;
                  var12 = 100.0 - var8;
                  var8 = 5.0 - var12 * 0.1;
                  var2 += var8;
                  var12 = 100.0 - var10;
                  var10 = 5.0 - var12 * 0.1;
                  var2 += var10;
                  var4 += 2;
               } else if (var7 == 2 && var6 == 2) {
                  System.out.print("Enter the first semester grade of the course >>> ");
                  var8 = var1.nextDouble();
                  System.out.print("Enter the second semester grade of the course >>> ");
                  var10 = var1.nextDouble();
                  var12 = 0.0;
                  var12 = 100.0 - var8;
                  var8 = 5.5 - var12 * 0.1;
                  var2 += var8;
                  var12 = 100.0 - var10;
                  var10 = 5.5 - var12 * 0.1;
                  var2 += var10;
                  var4 += 2;
               } else if (var7 == 2 && var6 == 3) {
                  System.out.print("Enter the first semester grade of the course >>> ");
                  var8 = var1.nextDouble();
                  System.out.print("Enter the second semester grade of the course >>> ");
                  var10 = var1.nextDouble();
                  var12 = 0.0;
                  var12 = 100.0 - var8;
                  var8 = 6.0 - var12 * 0.1;
                  var2 += var8;
                  var12 = 100.0 - var10;
                  var10 = 6.0 - var12 * 0.1;
                  var2 += var10;
                  var4 += 2;
               }
            }

            System.out.println();
         }
      } while(var14 == 1);

   }
}
