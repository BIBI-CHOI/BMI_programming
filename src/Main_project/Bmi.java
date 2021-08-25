package Main_project;

import java.util.Scanner;

public class Bmi {
   public void bmi() {
      Scanner scan = new Scanner(System.in);
      System.out.print("[당신의 체중은?] : ");
      double w =Double.parseDouble(scan.nextLine());
      System.out.print("[당신의 키는?] : ");
      double h =Double.parseDouble(scan.nextLine());
      
       System.out.println("현재 키와 몸무게는 " + h + "cm" + ", " + w + "kg 입니다.");
         
         double nomalWeight = (h - 100) * 0.9;  // 표준 체중 계산 공식
         System.out.println("당신의 표준 체중은 " + nomalWeight + "입니다.");
         
         double fatnessWeight = (w / nomalWeight) * 100; //비만도 계산 공식
         System.out.println("BMI : " + fatnessWeight);
         
         if(fatnessWeight < 90 ) {
            System.out.println("[BMI 측정] : 저체중 입니다.");
         } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
            System.out.println("[BMI 측정]: 표준 입니다.");
         } else if(fatnessWeight >= 100){
            System.out.println("[BMI 측정] : 과체중 입니다.");
         } else {
            System.out.println("[BMI 측정] : 다시 입력해주세요");
         }
   }
}
