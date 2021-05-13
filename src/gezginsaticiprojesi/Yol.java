
package gezginsaticiprojesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Yol {
  
    
    private ArrayList<Sehir> sehirler = new ArrayList<Sehir>();
    
    public Yol(ArrayList<Sehir> sehirler){
        this.sehirler.addAll(sehirler);
        //Collections.shuffle(this.sehirler);
    }
    
    public Yol(Yol yol){
        yol.sehirler.stream().forEach( x -> sehirler.add(x));
    }
    
    public double toplam_mesafe(){
        int sehir_buyuklugu = this.sehirler.size();
        return this.sehirler.stream().mapToDouble( x -> {
            int sehir_index = this.sehirler.indexOf(x);
            double donus_degeri = 0;
            if(sehir_index < sehir_buyuklugu -1 && x.olculen_mesafe(this.sehirler.get(sehir_index+1)) != 0)
                donus_degeri = x.olculen_mesafe(this.sehirler.get(sehir_index+1));
            return donus_degeri;  
        }).sum() + this.sehirler.get(sehir_buyuklugu -1).olculen_mesafe(this.sehirler.get(0));
    }
    
    public String toplamMesafe(){
        String donus_degeri = String.format("%.2f", this.toplam_mesafe());
        if(donus_degeri .length() == 7)
            donus_degeri = " " + donus_degeri;
        return donus_degeri;
    } 
            
    public String toString(){
        return Arrays.toString(getSehirler().toArray());
    }

    public ArrayList<Sehir> getSehirler() {
        return sehirler;
    }
    
    
}
