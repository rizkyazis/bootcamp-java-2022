package org.tdi.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tdi.main.hitung.Volume;
import org.tdi.main.services.*;
import org.tdi.models.Department;
import org.tdi.services.DepartmentDao;

import java.util.List;

public class MainKelas {
    public static void main(String[] args) {
        Volume luas = new Volume(100);
        System.out.println("Luas = " +luas.luasLingkaran(10,20));
        System.out.println("Vol = " +luas.volLingkaran(23,12));
        System.out.println("Vol Static = " +Volume.volLingkaranStatic(23,12));

        //HitungLuas hitungLuas = new LuasImpl();
        //Hitung Luas lewat Registry
        System.out.println("Implement = "+ Registry.getHitungLuas().hitungLuasBenda(12,45));

        HitungLuas hitungLuasDua = new LuasImplDua();
        System.out.println("Implement Dua = "+hitungLuasDua.hitungLuasBenda(12,45));

        //set Konfigrasi
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Konfigurasi.class);
        ctx.refresh();

        HitungLuas hitungLuasSpring = ctx.getBean(HitungLuas.class);
        System.out.println(" Luas Spring = "+hitungLuasSpring.hitungLuasBenda(20,30));

        HitungVolume hitungVolumeSpring = ctx.getBean(HitungVolume.class);
        System.out.println(" Volume Spring = "+hitungVolumeSpring.hitungVolumeBenda(20,30,20));

        System.out.println("===================================================================================");

        DepartmentDao departmentDao = ctx.getBean(DepartmentDao.class);
        List<Department> hasilDepartment = departmentDao.getListDepartmentPS();
        for (Department dp : hasilDepartment){
            System.out.println(dp.toString());
        }

    }
}
