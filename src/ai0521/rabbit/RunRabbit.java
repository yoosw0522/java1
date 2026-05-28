package ai0521.rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("좁은 네모");

        rabbit1.setLocation(50,50);
        rabbit2.setLocation(150,70);

        rabbit1.setShape("기본");
        System.out.printf
                ("%s 모양의 토끼는(%d, %d) 좌표에 위치하고 있다.\n", rabbit1.getShape(),rabbit1.getxPos(),rabbit1.getyPos());
        System.out.printf
                ("%s 모양의 토끼는(%d, %d) 좌표에 위치하고 있다.\n", rabbit2.getShape(),rabbit2.getxPos(),rabbit2.getyPos());
        // 기본 모양의 토끼를 다이아몬드 모양의 토끼로 변경, 위치는 현재 x좌표에서 오른쪽으로 60 이동, y좌표는 아래쪽으로 20 이동한 후 출력
        rabbit1.setShape("다이아몬드");
        //rabbit1.setLocation(50+60,50+20);
        rabbit1.setxPos(rabbit1.getxPos() +60);
        rabbit1.setyPos(rabbit1.getyPos() +20);

        rabbit1.printInfo();
        System.out.printf
                ("%s 모양의 토끼는(%d, %d) 좌표에 위치하고 있다.\n", rabbit1.getShape(),rabbit1.getxPos(),rabbit1.getyPos());
        //좁은 모양의 토끼가 현재위치에서 오른쪽으로 50만큼 갔다가 왼쪽으로 20만큼 이동하게 해줘
    }
}
