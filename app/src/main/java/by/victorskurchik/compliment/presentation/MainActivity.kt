package by.victorskurchik.compliment.presentation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import by.victorskurchik.compliment.ComplimentApp
import by.victorskurchik.compliment.R
import by.victorskurchik.compliment.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels {
        (application as ComplimentApp).appComponent.viewModelsFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        rootView.setOnClickListener {
            viewModel.onMainViewClicked()
        }

        val animCrossFadeIn = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )

        val animCrossFadeOut = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_out
        )

        lifecycleScope.launchWhenStarted {
            viewModel.compliment.collect { compliment ->
                binding.tvCompliment.apply {
                    startAnimation(animCrossFadeOut)
                    text = compliment
                    startAnimation(animCrossFadeIn)
                }
            }
        }
    }
}