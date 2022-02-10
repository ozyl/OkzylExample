package cn.okzyl.example.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<V: ViewBinding> : AppCompatActivity() {

    lateinit var mBinding :V
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ViewBindingUtil.inflateWithGeneric(this,layoutInflater)
        setContentView(mBinding.root)
        initView()
    }


    abstract fun initView()
}