package se62120.fpt.edu.vn.iattendance.interfaces;

/**
 * Created by MrDat on 16/03/2018.
 */

public interface ILoginView {

    void navigateToCommit(String id, String username, String token, int role);
    //void network();
    void loginFailed();

    void onFinishCheckUserExist();

}
