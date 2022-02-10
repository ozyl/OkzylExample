package cn.okzyl.example.ui

import android.content.Intent
import cn.okzyl.example.base.BaseActivity
import cn.okzyl.example.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initView() {
        mBinding.demoPage.setOnClickListener {
            startActivity(Intent().apply {
                setClass(this@MainActivity,MainUIActivity::class.java)
            })
        }
    }
}