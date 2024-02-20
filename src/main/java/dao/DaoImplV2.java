package dao;

import org.springframework.stereotype.Repository;

@Repository("daoV2")
public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp = 80;
        return temp;
    }
}
