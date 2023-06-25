package _05_Hafta.Gun03._02_Enum;

import static _05_Hafta.Gun03._02_Enum.Role.*;

public class Soru {


//    Bir User yetkilendirme modilU yopilmasi isteniyor.
//    USER ROLU : ADMIN, MUDUR, SATIS, PERSONEL
//
//    USER STAYUSU : AKTIF, PASIF
//    Yukaridaki gekilde bir USER(username, role, statu) class 1 tanimlayiniz
//    Farkla yetki ve statUde 2 kullanici ve bir de ADMIN
//
//    kullanicisi tonimlayiniz.
//
//    UserSilme isimli fonksiyona bu userlari génderiniz.
//
//    ADMIN kullanicisi igin bu user silinemez vyarisi1 verdirelim

    public static void main(String[] args) {
       // User user1= new User("savas", ADMIN , Statu.AKTIF);
       // User user2= new User("mehmet", MUDUR , Statu.PASIF);
       // User user3= new User("ahmet", SATIS , Statu.AKTIF);
       //
       //userSil(user1);
       //userSil(user2);
       //userSil(user3);

       //System.out.println("user1 = " + user1);

    }
    public static void userSil(User user){
      //  if (user.role == ADMIN)
        {
            System.out.println(user.username + " Admin silinemez");
        }
    }

}
