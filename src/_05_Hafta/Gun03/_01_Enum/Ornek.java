package _05_Hafta.Gun03._01_Enum;

public class Ornek {
    public static void main(String[] args) {
        // verilen bir ay no'ya gore ayin gun sayisini veren programi yaziniz

        int ayNo=5;

        switch (ayNo){
            case 1: //ocak
            case 2: System.out.println(28); break;
            case 3:
            case 5:
            case 7:
            case 22:
            case 12: System.out.println(31); break;
            case 4:
        }
        // okunabilirlik ve kontrollu yazilim yok, tanimlama yok
        // numaradan gitmeye calistik zorluklarla karsilastik
        // bunun yerine isimden gitmeye calisiyoruz

        String ayAd="Mayis";
        switch (ayAd){
            case "ocak":
            case "subat": System.out.println(28);break;
            case "mart":
            case "agustos":
            case "haziran":

        }
        // kontrol zor hataya acik
        // boolean true1, false0
        //kullanici tipi : Role:
        // Student, teacher, admis, mentor
    }
}
