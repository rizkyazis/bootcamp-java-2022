package org.tdi.main.hitung;

public class Volume extends Luas{

    public Volume(int tinggi){
        super.tinggi = tinggi;
    }

    public Double volLingkaran(int panjang, double lebar){
        return tinggi*panjang*lebar;
    }

    public static Double volLingkaranStatic( int panjang, double lebar){
        Volume vol = new Volume(200);
        return panjang*lebar*vol.tinggi;
    }
}
