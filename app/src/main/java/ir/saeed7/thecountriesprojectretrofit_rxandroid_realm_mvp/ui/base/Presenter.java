package ir.saeed7.thecountriesprojectretrofit_rxandroid_realm_mvp.ui.base;

/**
 * Created by Saeed-7
 *
 * @email: en.SaeedFekri@gmail.com
 */
public interface Presenter<T extends MvpView> {

    void attachView(T mvpView);

    void detachView();

}
