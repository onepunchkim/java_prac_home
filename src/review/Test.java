package review;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < 5; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
        for(int i = 4; i >= 0; i--){
            System.out.print(numbers[i]);
            if( i > 0 ){
                System.out.print(", ");
            }
        }
    }
}
