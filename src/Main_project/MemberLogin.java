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
                System.out.print("아이디 입력 :");
                String myId = input.nextLine().trim();
                info.setId(myId);
                System.out.print("비밀번호 입력 : ");
                String myPw = input.nextLine().trim();
                info.setPassword(myPw);
                info.isMemberCheck(info.getId(), info.getPassword());   //로그인 실패시 다시 처음 메뉴로 돌아감
                if(MemberInfo.loginFlag) {break;}                  //로그인에 성공하면 while문 빠져나가기
               
           }
           else if(select=='2') {                              //회원가입
                info.Join();
                                                 //회원가입후 로그인화면으로 돌아감
                
           }
           else if(select=='3') { 
               System.out.println("로그아웃 합니다."); 
              System.exit(0);
           }
           else {
                System.out.println("잘못된 값 입력");
                break;
            }
        } //while문 out
        
       Bmi bthod = new Bmi();                        //Bmi 클래스 호출
       bthod.bmi();                                 //bmi 메소드 호출
       
       
       
        
 
    }
   
      
      
   
   
   
         
         
         
      }
        
