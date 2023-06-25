package _01_Hafta.gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // concat : bir stringi digerine birlestiriyor.

        String s1= "merhaba";
        String s2= "dunya";

        System.out.println("birlesik hali= "+ s1+s2 );// birlesik hali
        System.out.println("birlesik hali= "+ s1.concat(s2));// birlesik hali
        System.out.println("birlesik hali= "+ s1.concat(" ").concat(s2));// concat ile birlesik hali
        System.out.println("birlesik hali= "+ s1.concat(" "+s2));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
