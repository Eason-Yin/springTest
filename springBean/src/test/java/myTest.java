import com.ys.springJDK.Dao.CustomerDao;
import com.ys.springJDK.jdk.MyBeanFactory;

public class myTest {

    public static void main(String[] args) {
        //从工厂获得指定的内容（相当于soring获得，但此内容是代理对象）
        CustomerDao customerDao = MyBeanFactory.getBean();
        //执行方法
        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();
    }
}
