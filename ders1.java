import java.util.Scanner;

public class ders1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        double mesafe,yas,tercih,normalTutar,yasindirimi,indirimliTutar,toplamTutar;
        String tekYon,gidisGelis;
        double km = 4;

        System.out.print("Mesafeyi girin : ");
        mesafe = input.nextInt();

        System.out.print("yaşınızı girin: ");
        yas = input.nextInt();

        System.out.println("1-Tek Yön\n2-Gidiş dönüş ");
        tercih = input.nextInt();

        if (tercih == 1){
            normalTutar = mesafe*km;
            System.out.println("normal tutar: "+normalTutar);
            if (yas<12){
                yasindirimi=normalTutar*0.5;
                System.out.println("yaş indirimi:"+yasindirimi);
                indirimliTutar=normalTutar-yasindirimi;
                System.out.print("12 yaş altı sadece gidiş indirimli uçak bileti: "+indirimliTutar);
            } else if (yas>=12 && yas<24) {
                yasindirimi = normalTutar*0.1;
                System.out.println("yaş indirimi: "+yasindirimi);
                indirimliTutar=normalTutar-yasindirimi;
                System.out.print("12 24 yaş arası sadece gidiş indirimli uçak bileti: "+indirimliTutar);
            } else if (yas>=65) {
                yasindirimi = normalTutar*0.3;
                System.out.println("yaş indirimi: "+yasindirimi);
                indirimliTutar = normalTutar-yasindirimi;
                System.out.print("65 yaş üstü sadece gidiş indirimli uçak bileti: "+indirimliTutar);
            }

        } else if (tercih==2) {
            normalTutar = mesafe*km*0.2;
            System.out.println("normal tutar: "+normalTutar);
            if (yas<12){
                yasindirimi=normalTutar*0.5;
                System.out.println("yaş indirimi: "+yasindirimi);
                indirimliTutar=normalTutar-yasindirimi;
                System.out.print("12 yaş altı sadece gidiş indirimli uçak bileti: "+indirimliTutar);
            } else if (yas>=12 && yas<24) {
                yasindirimi = normalTutar*0.1;
                System.out.println("yaş indirimi: "+yasindirimi);
                indirimliTutar=normalTutar-yasindirimi;
                System.out.print("12 24 yaş arası gidiş dönüş indirimli uçak bileti: "+indirimliTutar);
            } else if (yas>=65) {
                yasindirimi = normalTutar*0.3;
                System.out.println("yaş indirimi: "+yasindirimi);
                indirimliTutar = normalTutar-yasindirimi;
                System.out.print("65 yaş üstü gidiş dönüş indirimli uçak bileti: "+indirimliTutar);
            }

        }


    }
    
}
