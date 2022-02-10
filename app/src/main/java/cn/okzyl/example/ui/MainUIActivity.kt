package cn.okzyl.example.ui

import android.content.Intent
import cn.okzyl.example.base.BaseActivity
import cn.okzyl.example.databinding.ActivityMainUiBinding

class MainUIActivity: BaseActivity<ActivityMainUiBinding>() {
    override fun initView() {
        mBinding.uiCMBWealth.setOnClickListener {
            startActivity(Intent().apply {
                setClass(this@MainUIActivity,UICMBActivity::class.java)
            })
        }
    }
}