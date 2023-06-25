package _05_Hafta.Gun03._03_Enum;

public enum Aylar {
    OCAK(1,31,"ocak"),
    SUBAT(2,28,"SUBAT"),
    MART(3,31,"MART"),
    NISAN(4,30,"NISAN"),
    MAYIS(5,31,"MAYIS"),
    HAZIRAN(6,30,"HAZIRAN"),
    TAMMUZ(7,31,"TAMMUZ"),
    AGUSTOS(8,31,"AGUSTOS"),
    EYLUL(9,30,"EYLUL"),
    EKIM(10,31,"EKIM"),
    KASIM(11,30,"KASIM"),
    ARALIK(12,31,"ARALIK");

    int ayNo;
    int gunMiktar;
    String ayAd;

    Aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;
    }
}
