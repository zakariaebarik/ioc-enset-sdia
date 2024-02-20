package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("daoV3")
public class DaoImplV3 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        return 40;
    }
}
