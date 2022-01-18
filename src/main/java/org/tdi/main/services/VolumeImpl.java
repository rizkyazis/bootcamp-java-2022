package org.tdi.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hitungVolumeSpring")
public class VolumeImpl implements HitungVolume{
    @Autowired
    private HitungLuas hitungLuas;
    @Override
    public double hitungVolumeBenda(int panjang, double lebar, double tinggi) {
        return hitungLuas.hitungLuasBenda(panjang,lebar)*tinggi;
    }
}
