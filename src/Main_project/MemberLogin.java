package Main_project;

import java.util.Scanner;

import BMI_programming_1.MemberInfo;

public class MemberLogin {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberInfo info = new MemberInfo();
      
        while (true) {
           
            char select = info.display();
            
           if(select=='1') {
                info.loginVaild();
                if (MemberInfo.loginFlag) {
                    break;
                }
                System.out.print("���̵� �Է� :");
                String myId = input.nextLine().trim();
                info.setId(myId);
                System.out.print("��й�ȣ �Է� : ");
                String myPw = input.nextLine().trim();
                info.setPassword(myPw);
                info.isMemberCheck(info.getId(), info.getPassword());   //�α��� ���н� �ٽ� ó�� �޴��� ���ư�
                if(MemberInfo.loginFlag) {break;}                  //�α��ο� �����ϸ� while�� ����������
               
           }
           else if(select=='2') {                              //ȸ������
                info.Join();
                                                 //ȸ�������� �α���ȭ������ ���ư�
                
           }
           else if(select=='3') { 
               System.out.println("�α׾ƿ� �մϴ�."); 
              System.exit(0);
           }
           else {
                System.out.println("�߸��� �� �Է�");
                break;
            }
        } //while�� out
        
       Bmi bthod = new Bmi();                        //Bmi Ŭ���� ȣ��
       bthod.bmi();                                 //bmi �޼ҵ� ȣ��
       
       
       
        
 
    }
   
      
      
   
   
   
         
         
         
      }
        
