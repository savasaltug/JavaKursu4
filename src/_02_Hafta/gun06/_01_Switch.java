package _02_Hafta.gun06;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen ayin gun sayisini veren bir program yaziniz

        int ayNo = in.nextInt();

       /* switch (ayNo) {
            case 1: System.out.println("31");break;
            case 2: System.out.println("28");break;
            case 3: System.out.println("31");break;
            case 4: System.out.println("30");break;
            case 5: System.out.println("31");break;
            case 6: System.out.println("30");break;
            case 7: System.out.println("31");break;
            case 8: System.out.println("31");break;
            case 9: System.out.println("30");break;
            case 10: System.out.println("31");break;
            case 11: System.out.println("30");break;
            case 12: System.out.println("31");break;
            default: System.out.println("hatali ay no");break;*/
        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31");break;


            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30");break;


            case 2: System.out.println("28");break;

            default: System.out.println("hatali ay no");break;
        }
    }
}