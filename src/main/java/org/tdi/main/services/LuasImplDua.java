package org.tdi.main.services;

import org.springframework.stereotype.Component;

@Component("hitungLuasSpring")
public class LuasImplDua implements HitungLuas{
    @Override
    public double hitungLuasBenda(int panjang, double lebar) {
        return panjang*lebar+Math.PI;
    }
}
