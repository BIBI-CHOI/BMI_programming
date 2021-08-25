package BMI_programming_2;

//import java.util.HashMap;
//import java.util.Scanner;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MemberInfo extends JFrame {
      
	private Image screenImage; // ���۸��� ���� ȭ�� ���
	private Graphics screenGraphic;
	
	private Image introbackground; // ���׸� ���
	
	public MemberInfo() {
		setTitle("BMI Programming"); // ���α׷� Ÿ��Ʋ 
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // â�� ũ�� ����
//		setResizable(false); // ����ڰ� ���Ƿ� âũ�� ���� �Ұ���
		setLocationRelativeTo(null); // ������ ȭ�� ��� â�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ���� �Ǹ� ���α׷����� (��ɾ ���� ������ â�� �ݾƵ� ���α׷� ��� ���ư�)
		setVisible(true); // ȭ���� ����� ��µǵ��� ��
		
		introbackground = new ImageIcon(Main.class.getResource("../images/introbackground2.jpg")).getImage();
		// �̹��� �����ȿ� ���ȭ�� �ʱ�ȭ
	}
	
	// �޼ҵ� �ֱ�
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ������ ����� �°� �̹����� ����� ��ũ���� �־���
		screenGraphic = screenImage.getGraphics(); // ��ũ���̹����� �̿��Ͽ� �׷��� �����
		screenDraw(screenGraphic); // ȭ���� ���� �Լ�
		g.drawImage(screenImage, 0, 0, null); // ���׸� ��ġ ���� ��ǥ 0,0���� ��ġ
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introbackground, 0, 0, null); // ���׸��� ȭ�鿡 ���
		this.repaint(); // ���׸��� �ż������� �����(���۸������Ѱ�)
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
//    //�޴� ��� �޼ҵ�
//    public char display() {
//        System.out.println("1.�α���   2.��  ��   3. �α׾ƿ�  4.����");
//        System.out.print(">>>");
//        return input().charAt(0);
//    }
//    
//    
//    //�Է� �޼ҵ�
//    public String input() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextLine();
//    }
//    
//    //ȸ������ �޼ҵ�
//    public void Join() {
//        if (loginFlag) {
//            System.out.println("�ڵ��α׾ƿ��ϰ� ���ο� ȸ�������� �����մϴ�.");
//            System.out.println();
//            loginFlag = false;
//        }
//        while(true) {
//            System.out.print("[ ���� id ]: ");
//            String newId = input();
//            if(memberTable.containsKey(newId)) {
//                System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
//                System.out.println();
//                continue;
//            }
//            System.out.print("[ ���� pw ]: ");
//            String newPwd = input();
//            memberTable.put(newId, newPwd);
//            break;
//        }
//        System.out.println("���� �Ϸ�");
//        System.out.println();
//    }
//   
//    //�α��� �޼ҵ�
//    public void loginVaild() {
//        if (loginFlag) {
//            System.out.println("�̹� �α��εǾ� �ִ� �����Դϴ�.");
//            System.out.println();
//            return;
//        }
//   }
//
//public void isMemberCheck(String id, String pw) {    
//        if (memberTable.containsKey(id)) {
//            if (!memberTable.get(id).equals(pw)) {
//                System.out.println("��й�ȣ�� ���� �ʽ��ϴ�. ���� ����");
//                System.out.println();
//            } else {
//                System.out.println("���� ����");
//                System.out.println();
//                loginFlag = true;
//                
//            }
//        } else {
//            System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
//            System.out.println();
//        }
//    }
// 
//   
//}
//
//
//   