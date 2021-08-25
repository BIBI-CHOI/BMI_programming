package BMI_programming_2;

//import java.util.HashMap;
//import java.util.Scanner;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MemberInfo extends JFrame {
      
	private Image screenImage; // 버퍼링을 위한 화면 출력
	private Graphics screenGraphic;
	
	private Image introbackground; // 배경그림 출력
	
	public MemberInfo() {
		setTitle("BMI Programming"); // 프로그램 타이틀 
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 창의 크기 지정
//		setResizable(false); // 사용자가 임의로 창크기 변경 불가능
		setLocationRelativeTo(null); // 윈도우 화면 가운데 창을 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 끄게 되면 프로그램종료 (명령어를 넣지 않으면 창을 닫아도 프로그램 계속 돌아감)
		setVisible(true); // 화면이 제대로 출력되도록 함
		
		introbackground = new ImageIcon(Main.class.getResource("../images/introbackground2.jpg")).getImage();
		// 이미지 폴더안에 배경화면 초기화
	}
	
	// 메소드 넣기
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 설정한 사이즈에 맞게 이미지를 만든뒤 스크린에 넣어줌
		screenGraphic = screenImage.getGraphics(); // 스크린이미지를 이용하여 그래픽 만들기
		screenDraw(screenGraphic); // 화면을 위한 함수
		g.drawImage(screenImage, 0, 0, null); // 배경그림 위치 설정 좌표 0,0으로 위치
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introbackground, 0, 0, null); // 배경그림을 화면에 출력
		this.repaint(); // 배경그림을 매순간마자 띄워줌(버퍼링을위한것)
	}
	
	
}
//   private String id, password;
//   private double w, h;
//   static boolean loginFlag;
//   HashMap<String, String> memberTable = new HashMap<String, String>();
//    
//   public void setId(String id) {
//        this.id = id;
//    }
//    public String getId() {
//        return id;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
//    //메뉴 출력 메소드
//    public char display() {
//        System.out.println("1.로그인   2.가  입   3. 로그아웃  4.종료");
//        System.out.print(">>>");
//        return input().charAt(0);
//    }
//    
//    
//    //입력 메소드
//    public String input() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextLine();
//    }
//    
//    //회원가입 메소드
//    public void Join() {
//        if (loginFlag) {
//            System.out.println("자동로그아웃하고 새로운 회원가입을 시작합니다.");
//            System.out.println();
//            loginFlag = false;
//        }
//        while(true) {
//            System.out.print("[ 가입 id ]: ");
//            String newId = input();
//            if(memberTable.containsKey(newId)) {
//                System.out.println("이미 존재하는 아이디 입니다.");
//                System.out.println();
//                continue;
//            }
//            System.out.print("[ 가입 pw ]: ");
//            String newPwd = input();
//            memberTable.put(newId, newPwd);
//            break;
//        }
//        System.out.println("저장 완료");
//        System.out.println();
//    }
//   
//    //로그인 메소드
//    public void loginVaild() {
//        if (loginFlag) {
//            System.out.println("이미 로그인되어 있는 상태입니다.");
//            System.out.println();
//            return;
//        }
//   }
//
//public void isMemberCheck(String id, String pw) {    
//        if (memberTable.containsKey(id)) {
//            if (!memberTable.get(id).equals(pw)) {
//                System.out.println("비밀번호가 맞지 않습니다. 인증 실패");
//                System.out.println();
//            } else {
//                System.out.println("인증 성공");
//                System.out.println();
//                loginFlag = true;
//                
//            }
//        } else {
//            System.out.println("존재하지 않는 아이디 입니다.");
//            System.out.println();
//        }
//    }
// 
//   
//}
//
//
//   