package Chapter11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Example11_4 {
    // 명령어를 저장할 Queue 선언
    static Queue<String> q = new LinkedList<>();
    // Queue에 저장될 최대 크기 상수 선언
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                // 화면으로부터 라인 단위로 입력받음
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                // 입력이 없는 경우 무시하고 반복문의 처음으로
                if ("".equals(input)) continue;

                // 종료 명령어인 경우 프로그램 종료
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                }
                // 도움말 명령어인 경우 도움말 출력
                else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                }
                // 최근 명령어 출력 명령어인 경우
                else if (input.equalsIgnoreCase("history")) {
                    // 입력받은 명령어를 저장하고,
                    save(input);

                    // LinkedList의 내용을 보여준다.
                    ListIterator<String> it = ((LinkedList<String>) q).listIterator();
                    int i = 0;
                    while (it.hasNext())
                        System.out.println(++i + "." + it.next());
                }
                // 그 외의 경우에는 입력받은 명령어를 저장하고 출력
                else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류 입니다.");
            }
        }  // while(true)
    }  // main()

    // 입력받은 명령어를 Queue에 저장
    public static void save(String input) {
        if (!"".equals(input))
            q.offer(input);

        // Queue의 최대 크기를 넘으면 가장 처음 입력된 것을 삭제
        if (q.size() > MAX_SIZE)
            q.poll();
    }
}  // end of class