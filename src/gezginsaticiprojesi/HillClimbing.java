 package gezginsaticiprojesi;


public class HillClimbing {
    public static final int max = 100;       
    public  Yol enKısaYol(Yol anlik_yol){
        Yol yol1;
        int sayac = 0;
  
        while(sayac < max){
             yol1 = komsu_yol(new Yol(anlik_yol));
             if(yol1.toplam_mesafe() <= anlik_yol.toplam_mesafe()){
                 sayac = 0;
                 anlik_yol = new Yol(yol1);
             }

             System.out.println(anlik_yol + "   " + anlik_yol.toplamMesafe());  
        }
        if(sayac == 100)
            System.out.println("       | potansiyel max");
        return anlik_yol;
    }
    private Yol komsu_yol(Yol yol ){
        int x1 = 0, x2 = 0;
            while(x1 == x2){
                /*x1 = (int) (yol.getSehirler().size() * Math.random());
                x2 = (int) (yol.getSehirler().size() * Math.random());*/
            }
        Sehir sehir1 = yol.getSehirler().get(x1);
        Sehir sehir2 = yol.getSehirler().get(x2);
        yol.getSehirler().set(x2, sehir1);
        yol.getSehirler().set(x1, sehir2);
        return yol;
    }
}
