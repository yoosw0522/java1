package ai0521.rabbit;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;

    // JVM은 클래스 내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
    // 그러나 클래스내에 생성자가 선언되어있다면 선언된 생성자만 사용할 수 있다.
    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    // 3. setPosition 메서드 수정 (매개변수 x, y를 올바르게 대입)
    public void setLocation(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    // Call By Reference(객체 주소값)
    public void printInfo() {
        System.out.printf("%s 모양의 토끼는(%d, %d) 좌표에 위치하고 있다.\n", getShape(), getxPos(), getyPos());
    }

    // x축에서 10씩 오른쪽으로 이동하는 메소드
    public void moveRight() {
        this.xPos += 10;
    }

    // x축에서 10씩 왼쪽으로 이동하는 메소드
    public void moveLeft() {
        this.xPos -= 10;
    }
}