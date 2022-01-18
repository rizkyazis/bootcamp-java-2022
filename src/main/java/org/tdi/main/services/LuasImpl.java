package org.tdi.main.services;

import org.springframework.stereotype.Component;

//@Component("hitungLuasSpringDua")
public class LuasImpl implements HitungLuas{

    @Override
    public double hitungLuasBenda(int panjang, double lebar) {
        return panjang*lebar;
    }
}
