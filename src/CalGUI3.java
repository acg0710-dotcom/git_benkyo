import javax.swing.*;
import java.awt.*;

// CalGUI3 라는 이름의 클래스를 만들고, Swing의 JFrame(기본 윈도우창)을 상속받음
// 상속 받으면 CalGUI3 자체가 하나의 독립된 프로그램 창 역할을 수행하게 됨
public class CalGUI3 extends JFrame {
    // 숫자를 입력받고 결과를 보여줄 한 줄짜리 텍스트 입력 영역변수를 선언
    // 다른 메소드나 이벤트 처리 시에도 접근하기 쉽게 멤버 변수(필드)로 빼둠
    JTextField jtf;

    // 생성자 메서드
    public CalGUI3() {
        this.setLayout(new BorderLayout(10, 10));
        // 입력창 객체화
        jtf = new JTextField();
        jtf.setFont(new Font("맑은 고딕", Font.BOLD, 24));
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        this.add(jtf, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4,4,5,5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };
        // 반복문을 통해 버튼 생성 및 패널 추가
        for (String text : buttons){
            JButton btn = new JButton(text);
            btn.setFont(new Font("맑은 고딕", Font.BOLD, 18));
            //'C' 버튼 배경색을 빨간색으로 포인트 주기
            if(text.equals("C")){
                btn.setBackground(Color.RED);
                btn.setBackground(Color.WHITE);
            }
            buttonsPanel.add(btn);
        }
        // 4. 버튼 패널을 프레임 중앙에 배치
        this.add(buttonsPanel, BorderLayout.CENTER);

        //5. 프레임 기본 성질
        this.setTitle("계산기");
        this.setSize(350,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalGUI3();
    }
}