package by.victorskurchik.compliment.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import by.victorskurchik.compliment.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        rootView.setOnClickListener {
            viewModel.onMainViewClicked()
        }

        lifecycleScope.launchWhenStarted {
            viewModel.compliment.collect { compliment ->
                binding.tvCompliment.text = compliment
            }
        }
    }
}