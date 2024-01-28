package Chapter7;

//추상 클래스 Unit을 상속받는 여러 유닛 클래스를 정의한 코드
public class Example7_9 {
 public static void main(String[] args) {
     // Unit 배열을 생성하고 각 유닛 클래스의 인스턴스를 저장
     Unit[] group = {
             new Marine(), new Tank(), new Dropship()
     };

     // 모든 유닛을 이동시키는 반복문
     for (int i = 0; i < group.length; i++)
         group[i].move(100, 200);
 }
}
//추상 클래스 Unit 정의
abstract class Unit {
 int x, y;
 // 추상 메서드 move 정의
 abstract void move(int x, int y);
 // 일반 메서드 stop 정의
 void stop() {
     /* 현재 위치에 정지 */
 }
}
//보병 클래스 Marine, Unit을 상속받음
class Marine extends Unit {
 // move 메서드 구현
 void move(int x, int y) {
     System.out.println("Marine[x = " + x + ", y = " + y + "]");
 }
 void stimPack() {
     /* 스팀팩을 사용한다. */
 }
}
//탱크 클래스 Tank, Unit을 상속받음
class Tank extends Unit {
 void move(int x, int y) {
     System.out.println("Tank[x = " + x + ", y = " + y + "]");
 }
 void changeMode() {
     /* 공격모드를 변환한다. */
 }
}
//수송선 클래스 Dropship, Unit을 상속받음
class Dropship extends Unit {
 void move(int x, int y) {
     System.out.println("Dropship[x = " + x + ", y = " + y + "]");
 }
 void load() {
     /* 선택된 대상을 태운다. */
 }
 void unload() {
     /* 선택된 대상을 내린다. */
 }
}
