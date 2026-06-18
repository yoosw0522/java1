import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] subjects = {"프로그래밍언어실습", "데이터베이스", "융합UI실습"};

        System.out.println("* 현재 배열의 길이: " + subjects.length);
        System.out.println("* 현재 배열의 내용");
        for (String subject : subjects){
            System.out.print(subject + " ");
        }
        System.out.println();

        // 배열의 크기를 2만큼 늘려서 복사 (총 길이: 5)
        subjects = Arrays.copyOf(subjects, subjects.length + 2);

        // 💡 새롭게 추가된 부분: 빈 공간(null)에 데이터 할당하기
        subjects[subjects.length-2] = "영상인공지능처리";  // subjects[3] 자리에 대입
        subjects[subjects.length-1] = "직업과 경력개발";  // subjects[4] 자리에 대입

        System.out.println("* 새로운 배열의 길이: " + subjects.length);
        System.out.println("* 새로운 배열의 내용");
        for (String subject : subjects){
            System.out.print(subject + " ");
        }
    }
}