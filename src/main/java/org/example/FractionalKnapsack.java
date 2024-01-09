package org.example;
import java.util.*;

public class FractionalKnapsack {
    static void knap (ArrayList<KnapsackItem> items, int kapasite){
        Comparator<KnapsackItem> com=new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getDeger()>o1.getDeger()) return 1;
                else return -1;
            }
        };
        Collections.sort(items, com);
        int kullanilanKapasite=0;
        double toplamDeger=0;

        for (KnapsackItem item : items){
            if (kullanilanKapasite+item.getAgirlik()<=kapasite){
                kullanilanKapasite+=item.getAgirlik();
                System.out.println("Taken: "+item);
                toplamDeger+=item.getDeger();
            }
            if (kullanilanKapasite==kapasite) break;
        }

    }
}
