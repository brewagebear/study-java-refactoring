package ex1;

/***
 * 예제 1. 매직넘버를 상수로 치환
 * _name : 로봇의 이름
 * order(int command) : 매개변수로 받은 명령어를 실행
 *  command = 0 : walk
 *  command = 1 : stop
 *  command = 2 : jump
 */
public class Robot {
    private final String _name;

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(int command){
        if(command == 0){
            System.out.println(_name + " walks.");
        } else if (command == 1) {
            System.out.println(_name + " stop.");
        } else if (command == 2) {
            System.out.println(_name + " jump.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
