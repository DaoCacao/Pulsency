package core.legion.pulsency.launch_screen

import android.animation.Animator
import android.os.Bundle
import core.legion.pulsency.R
import core.legion.pulsency.utils.SimpleAnimatorListener
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_launch.*
import javax.inject.Inject

class LaunchActivity : DaggerAppCompatActivity(), LaunchFacade.View, SimpleAnimatorListener {

    @Inject lateinit var presenter: LaunchFacade.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        presenter.onViewCreated()
    }

    override fun startAnimation() {
        ivDollar.alpha = 0f
        ivDollar.scaleX = 0.8f
        ivDollar.scaleY = 0.8f
        ivDollar
                .animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(1500)
                .setListener(this)
                .start()
    }

    override fun onAnimationEnd(animation: Animator?) = presenter.onAnimationEnd()
}
