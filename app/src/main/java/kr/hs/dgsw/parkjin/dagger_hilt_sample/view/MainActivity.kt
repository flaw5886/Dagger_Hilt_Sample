package kr.hs.dgsw.parkjin.dagger_hilt_sample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kr.hs.dgsw.parkjin.dagger_hilt_sample.R
import kr.hs.dgsw.parkjin.dagger_hilt_sample.viewModel.MainViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = viewModel.getName()
    }
}