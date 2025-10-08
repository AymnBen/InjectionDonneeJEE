package net.aymen.pres;


import net.aymen.metier.MetierImpl;
import net.aymen.exit.DaoImplV2;

public class Pres1 {
    public  static void main(String[] args){
            DaoImplV2 d = new DaoImplV2();
            MetierImpl metier = new MetierImpl(d);
            //metier.setDao(d);
            System.out.println("RES= "+metier.calcul());
    }
}
