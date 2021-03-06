package project.mvp.base;

/**
 * Created by jiajun.wang on 2018/3/19.
 */

public interface IBaseView {

    void showNoNetWork();

    void showLoading();

    void showLoadFail();

    void showContentView();

    void showEmptyView();

    void hideLoading();

    void handleException(Throwable throwable);

}
