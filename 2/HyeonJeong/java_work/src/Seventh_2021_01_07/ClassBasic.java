package Seventh_2021_01_07;

// 클래스 만드는 방법
// 1. class를 적고 뒤쪽에 클래스의 이름을 적고 중괄호를 열고 닫는다.
//    클래스명은 변수명과 같이 자유롭게 적는다.
//    단, 변수와 마찬가지로 어떤 목적으로 만드는지 이름이 이를 나타내야 한다.
// 2. 중괄호 내부에는 클래스가 가져야할 속성을 변수로 만든다.
//    ex) 현재 케이스에서는 사람이므로 이름과 나이가 속성에 해당된다.
// 3. 해당 속성들을 제어할 수 있는 매서드로 구성된다.

class Person {
    String name;
    String major;
    int age;

    // 매서드 작성법
    // 1. 일단 무조건 public을 적는다.
    // 2. 뒤쪽에 매서드가 넘겨줄 데이터 타입을 적는다.
    //    int, String, float, double, void(공허한)
    //    만약 이 부분에 void가 적혀 있으면 넘겨줄 데이터가 없음을 의미한다.
    // 3. 매서드 이름을 작성한다.
    //    하지만 이 매서드가 무엇을 하는 것인지 이름을 보고
    //    객관적으로 알 수 있는 것이 좋다.
    // 4. 소괄호 내부에는 입력 받을 인자를 기입한다.
    //    ※ 입력은 키보드의 입력이 아니다.

    //    1 입력
    //    |
    //  ============
    //  |          |
    //  ============
    //         |
    //         3 출력

    // 5. 매서드의 기본 골격을 갖췄으므로
    //    실제 매서드가 어떤 작업을 할 것인지 내용을 작성한다.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int a) {
        age = a;
    }

    // void면 return이 없다.
    // 그러나  return이 있다면 넘겨주는 데이터타입과
    // return옆에 오는 클래스 내부 변수의 데이터타입이 같아야 한다.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ClassBasic {
    public static void main(String[] args) {
        Person p = new Person();

        // 매서드를 사용하는 이유는 무엇일까?
        // 1. 편리성 - 재활용이 가능하다
        //    전제조건 - 매서드를 잘 설계하고 유지보수가 쉽도록 만들었을 경우'
        p.setName("아무개");
        p.setAge(12);

        System.out.printf("이름은 = %s\n",p.getName());
        System.out.printf("나이는 = %d\n",p.getAge());
    }
}
