package net.aymen.exit;

import net.aymen.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version captzuers...");
        double t = 12;
        return  t;

    }
}
