package Main_project;

import java.util.Scanner;

public class Bmi {
   public void bmi() {
      Scanner scan = new Scanner(System.in);
      System.out.print("[����� ü����?] : ");
      double w =Double.parseDouble(scan.nextLine());
      System.out.print("[����� Ű��?] : ");
      double h =Double.parseDouble(scan.nextLine());
      
       System.out.println("���� Ű�� �����Դ� " + h + "cm" + ", " + w + "kg �Դϴ�.");
         
         double nomalWeight = (h - 100) * 0.9;  // ǥ�� ü�� ��� ����
         System.out.println("����� ǥ�� ü���� " + nomalWeight + "�Դϴ�.");
         
         double fatnessWeight = (w / nomalWeight) * 100; //�񸸵� ��� ����
         System.out.println("BMI : " + fatnessWeight);
         
         if(fatnessWeight < 90 ) {
            System.out.println("[BMI ����] : ��ü�� �Դϴ�.");
         } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
            System.out.println("[BMI ����]: ǥ�� �Դϴ�.");
         } else if(fatnessWeight >= 100){
            System.out.println("[BMI ����] : ��ü�� �Դϴ�.");
         } else {
            System.out.println("[BMI ����] : �ٽ� �Է����ּ���");
         }
   }
}
