package org.example;

public class KnapsackItem {
    private int index;
    private int deger;
    private int agirlik;

    public KnapsackItem(int index, int deger, int agirlik){
        this.index=index;
        this.deger=deger;
        this.agirlik=agirlik;
    }

    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public int getDeger(){
        return deger;
    }
    public void setDeger(int deger){
        this.deger=deger;
    }
    public int getAgirlik(){
        return agirlik;
    }
    public void setAgirlik(int agirlik){
        this.agirlik=agirlik;
    }


    @Override
    public String toString(){
        return "İtem index="+index+" ,değeri="+deger+", ağırlığı="+agirlik/*+", oranı="+oran*/;
    }
}
