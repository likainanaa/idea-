/**
 * Created by ASUS on 2018/7/1.
 */
public class app_service {
    private  app_dao ad=new app_dao();
    public String query(){
        return ad.query();
    }
}
