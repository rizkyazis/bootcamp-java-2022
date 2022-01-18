package org.tdi.main.services;

public class Registry {
    public static Registry solInstance;

    public static HitungLuas getHitungLuas(){
        return new LuasImpl();
    }
}
