package core.legion.pulsency.utils

import android.animation.Animator

interface SimpleAnimatorListener : Animator.AnimatorListener {

    override fun onAnimationRepeat(animation: Animator?) {}
//    override fun onAnimationEnd(animation: Animator?) {}
    override fun onAnimationCancel(animation: Animator?) {}
    override fun onAnimationStart(animation: Animator?) {}
}