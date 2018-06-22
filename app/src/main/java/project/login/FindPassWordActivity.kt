package project.login

import android.graphics.Color
import kotlinx.android.synthetic.main.activity_registere.*
import project.farm.R
import project.login.presenter.LoginPresenter
import project.mvp.base.BaseMvpActivity

public class FindPassWordActivity : BaseMvpActivity<LoginPresenter>() {


    override fun inject() {
        getDaggerActivityComponent().inject(this)
    }

    override fun getLayoutResource(): Int {
        setStateBar(Color.TRANSPARENT)
        return R.layout.activity_findpassword
    }

    override fun initView() {
        mPresenter.countdown(tvMessage)
    }

}