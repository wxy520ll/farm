package project.login

import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.StringUtils
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.activity_login_password.*

import project.farm.R
import project.login.interfaces.ICheckData
import project.login.presenter.LoginPresenter
import project.mvp.base.BaseMvpActivity


public class LoginPassWordActivity : BaseMvpActivity<LoginPresenter>(), ICheckData {


    override fun checkInput(): Boolean {
        if (StringUtils.isEmpty(etPassWord.text) || StringUtils.isEmpty(etPhoneNumber.text)) {
            ToastUtils.showShort("请检查输入格式")
            return false
        }
        return true
    }

    override fun inject() {
        getDaggerActivityComponent().inject(this)
    }

    override fun getLayoutResource(): Int {
        setStateBar()
        return R.layout.activity_login_password
    }

    override fun initView() {
        etPhoneNumber.requestFocus()
        btLogin.setOnClickListener {
            ActivityUtils.startActivity(MainActivity::class.java)
        }
        tvRegister.setOnClickListener {
            ActivityUtils.startActivity(RegisterActivity::class.java)
        }
        tvForgetPassWord.setOnClickListener {
            ActivityUtils.startActivity(FindPassWordActivity::class.java)
        }
        tvLoginMessage.setOnClickListener {
            ActivityUtils.startActivity(LoginMessageActivity::class.java)
        }
        ivPassWord.setOnClickListener {
            ToastUtils.showShort("查看密码")
        }
    }


}