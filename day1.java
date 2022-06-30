/*
2022-06-30
첫 자바 프로그램
By Austin
*/



// 키보드에서 입력한 정숫값 표시
// 프로그램의 시작 부분(클래스 선언 이전)에 작성한다. --------------- a
import java.util.Scanner; // Scanner를 사용하기 위해 추가

class Main {
  public static void main(String[] args) {

    // 9)
    // int x, y, z;

    // x = 63;
    // y = 18;
    // z = 52;

    // System.out.println("x값은 " + x + "입니다");
    // System.out.println("y값은 " + y + "입니다");
    // System.out.println("z값은 " + z + "입니다");

    // System.out.println("합계는 " + (x + y + z) + "입니다");
    // System.out.println("합계는 " + (x + y + z) / 3 + "입니다");
    


    // 8)
    // int x;
    // int y;

    // x = 63;
    // y = 18;

    // System.out.println("x값은 "+ x + "입니다");
    // System.out.println("y값은 "+ y + "입니다");

    // System.out.println("합계는 " + (x + y) + "입니다");
    // System.out.println("평균은 "+ (x + y) / 2 + "입니다");

    

    
    
    // 7)
    // System.out.println("첫 Java 프로그램입니다.");
    // System.out.println("화면에 출력하고 있습니다.");

    // System.out.println("첫 Java 프로그램입니다. 화면에 출력하고 있습니다.");

    // System.out.println("첫 Java 프로그램입니다. " + "화면에 출력하고 있습니다.");



    
    // 6)
    // System.out.print(" 금 ");   // print'ln'은 줄바꿈이고 일반 print는 줄 바꿈이 없다.
    // System.out.print(" 은 ");
    // System.out.print(" 보 ");
    // System.out.print(" 화 ");

    
    
    // 5)
    // // main 메서드의 시작 부분(값을 입력받는 c 이전에)에 작성한다. ------------------- b
    // Scanner stdIn = new Scanner(System.in);


    // System.out.print("정숫값 : ");
    // // 키보드를 통해 입력한 정숫값을 받는다 ------------------ c
    // int x = stdIn.nextInt();  // 입력받은 정숫값을 x에 저장한다.
    // System.out.println("10을 더한 값은 " + (x + 10) + "입니다.");
    // System.out.println("10을 뺀 값은 " + (x - 10) + "입니다.");

    

    
    // 4)
    // Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성

    // System.out.print("두자리 정수를 하나 입력해주세요.>");
    // String input = scanner.nextLine();  // 문자로 입력 받음. String이니깐.
    // int num = Integer.parseInt(input);  // 입력받은 문자열을 숫자로 변환

    // System.out.println("입력내용: " + input);
    // System.out.printf("당신이 입력한 숫자 = %d%n", num);  // %d - 자리 표시, %n - 줄 바꿔라

    
  




    


    // 1)
    // // System.out.println("Hello world!");    // "Hello World" 출력
    // // System.out.println("코드의 실행을 중지시킬 경우도 사용");

    // int x = 10, y = 20; // 정수형 변수 x의 10을 할당, y라는 변수에 10을 할당
    // int tmp = 0; // tmp에 0을 초기화.

    // System.out.println("x:"+ x + " y:" + y); // "큰 따옴표는 글자", x와 y를 연결하는 것을 출력.

    // tmp = x; // x랑 y를 교환하기 위해 임시값으로 tmp를 10으로 넣음.
    // x = y;   // x = 20
    // y = tmp; // y = 10

    // // 파이썬 x, y = y, x 서로 바뀜.

    // System.out.println("x:"+ x + " y:" + y);
    
    // 2)
    // String name = "Ja" + "va"; // ja라는 문자열과 va라는 문자열을 붙여서 문자열 변수 name에 할당한다.
    // String str  = name + 8.0;  // name이라는 문자열 형 변수값과 8.0이라는 실수를 붙여서 문자열 변수 str에 할당

    // System.out.println(name);
    // System.out.println(str);
    // System.out.println(7 + " ");
    // System.out.println(" " + 7);
    // System.out.println(7 + "");
    // System.out.println("" + 7);
    // System.out.println("" + "");
    // System.out.println(7 + 7 + "");  // 앞에 글자가 없이 바로 숫자는 계산됨.
    // System.out.println("" + 7 + 7);  // 앞에 글자 때문에 뒤에 숫자가 형 변환이 되어버림. 
    
    // 3)
    // System.out.println("82 + 17 = " + (82 + 17));
    // System.out.println("82 - 17 = " + (82 - 17)); // 괄호 먼저 계산하는 식, 그래서 계산이 된 후에 글자를 인식해서 숫자가 계산이 되고 글자로 인식 안 되는 것임.

    // System.out.println("82 + 17 = " + 82 + 17); // 글자로 인식함.

    
  }
}




