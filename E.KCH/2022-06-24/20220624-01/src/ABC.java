frame.setSize = 창 크기
.setVisible = 창을 보여주고자 하는역활 true , false 를 통해 가능
getContentPane().add(new JLabel("안녕")) = 프로그램안에 글자 만들기
setDefaultCloseOperation(EXIT_ON_CLOSE) = 프로그램 창 닫기기능 (상수형타입)

JFrame 을 새로운 클래스에게 상속후 사용가능 상속한후 super 를 통해 부모의값을 상속받은후 초기화 시켜놓고 사용하기 
상속받은후에는 this. 을 이용할필요없이 필요한 값들을 바로바로 불러서 사용할수있다 (더만들기 수월하게 하기위해)

JButton = 사용자가 버튼을 누를수있게끔 하는 기능 / new 를 통해 초기화 시켜 인스턴스화 시켜놓고 사용해야함 ()안에 글자를 표기하여 사용가능
setLayout(new FlowLayout()) = 버튼여러개 기능을 나열할수있는 기능 / 창안에 버튼을 만들면 버튼이 창전체를 다먹어버리는데
FlowLayout() 을 통해 여러개 버튼이있을경우 생성하고 창전체를 먹는것을 제재한다

setBackground(Color.색깔) = 배경색을 입힐수있다 RED,BLUE 이런것들 (Color.(rgb)) 식으로 가능 (rgb = 색좌표)

JPanel 의 new 를 통해 인스턴스화 시키고 초기화시키고 JPanel 의 이름을 호출하여 예) pnl.add(호출값)을 입력하고 add(pnl) 을통해 부르고자하는 값을 출력하면된다

ActionListener() = 버튼을 클릭하거나 메뉴를 누르거나 텍스트 필드 등에서 Enter를 눌렀을 때  발생하는 이벤트
ActionEvent = 사용자가 사용하고하는 동작들을 액션이벤트를 통해 가능하다

ActionListener 를 사용하고자할때 밖에 정수값을 지정해둔 애를 불러와서 ++ , -- 를 통해 증강식 값을 사용하려하면 에러가뜬다 지역변수를 불러올수없다

btn.ActionListener (new ActionListener() {
public void actionPerformed(ActionEvent e) {
	number++
	lbl.setText(String.vaLueOf(number)); = 증강식,감소식으로 버튼을 눌렀을때 두 기능을 활성화할수있다
	}	
)};


ActionListener 값을 사용하기위해 새로운클래스에서 (ex)를 통해 상속한 J페널을 (임플리먼트)를 사용해 ActionListener 의 값을 보다 편하게 사용가능

사용하고자하는 JButton 같은기능이나 다른기능들을 필드로 선언을 하고 그값들을 보다 편하게 불러와서 바로바로 사용하게끔하는것도 좋다
btn.ActionListener(this) 를 통해 사용하고자하는값을 지정하고 디스를 통해 자기자신을 바로 참조할수있게 사용할수도있다

필드에 list 를 추가하고 사용하고자하는 기능들을 추가하고자 하면 list.add() 를통해 보다 편하게 관리할수있다

actionPerformed 
getSource
getActionCommand = setActionCommand("문자") 셋값을 정해놓고 겟액션커맨드를 설정하면 셋값을 그대로 사용할수있다

BorderLayout = 동서남북 컴포넌트값을 사용할수있다
BorderLayout border = new BorderLayout() = 인스턴스화 초기화 시켜서 사용해야한다

setLocation() = x,y 좌표를 설정할수있다 / 왼쪽이 x값 오른쪽이 y값

JTextField = 한줄의 문자열을 입력받는 창

showMessageDiaLog = 창안에 다른 작은창을 생성할수있는  ()를통해 표현하고자하는 클래스이름과 this 값 그리고 텍스트값등 인스턴스안에 호출하여 작은창을 내가 원하는 방식으로 꾸며줄수있다
















































public class ABC {
}
