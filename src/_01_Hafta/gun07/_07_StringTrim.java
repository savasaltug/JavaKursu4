package _01_Hafta.gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        //trim : stringin basinda veya sonundaki bosluklari temizler

        String text= "  Merhaba Dunya  ";

        System.out.println("textin orjinal hali = ->"+text+"<-");
        System.out.println("textin trimlenmis hali = ->"+text.trim()+"<-");
    }
}
