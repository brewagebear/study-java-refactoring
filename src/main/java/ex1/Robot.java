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

    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(int command){
        if(command == COMMAND_WALK){
            System.out.println(_name + " walks.");
        } else if (command == COMMAND_STOP) {
            System.out.println(_name + " stop.");
        } else if (command == COMMAND_JUMP) {
            System.out.println(_name + " jump.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
