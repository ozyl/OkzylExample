package cn.okzyl.example.ui

import android.util.Log
import android.view.View
import androidx.core.view.isGone
import cn.okzyl.example.base.BaseActivity
import cn.okzyl.example.databinding.ActivitiyBehaviorCmbWealthBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class UICMBActivity : BaseActivity<ActivitiyBehaviorCmbWealthBinding>() {
    override fun initView() {
        mBinding.tvCMBMarquee.isSelected = true
        BottomSheetBehavior.from(mBinding.nsvCMBBehavior).addBottomSheetCallback(
            object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    Log.d("UICMB", "newState = $newState")
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {
                    mBinding.tvCMBMarquee.alpha = 1-slideOffset
                    mBinding.tvCMBMarquee.isGone = slideOffset == 1f
                    Log.d("UICMB", "newOffset = $slideOffset")
                }
            }
        )
    }
}