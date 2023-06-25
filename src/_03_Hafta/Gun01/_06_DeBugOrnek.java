package _03_Hafta.Gun01;

public class _06_DeBugOrnek {
    public static void main(String[] args) {
        //Programi adim adim calistirip her satirdaki degerleri kontrol etmek
        //icin baslamasi istedigimiz yere breakpoint(kirmizi nokta)konur.
        //RUN yerine DEBUG secilerek calistirilir. Program ilk olarak breakpoint'de
        //durur ve f8 ile adim adim ilerletilir. bu sekilde hem degerler izlenir
        // hem de nasil calistigi test edilebilir. F9 ile bir break pointten diger
        //Breakpointe atlanabilir.

        int a = 10; // durma noktasi: break point

        a=1000;

        a+=100;

        a+=5;

        System.out.println("a = " + a);

    }
}
