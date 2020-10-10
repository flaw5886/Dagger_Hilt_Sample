package kr.hs.dgsw.parkjin.dagger_hilt_sample.viewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import kr.hs.dgsw.parkjin.dagger_hilt_sample.usecase.GetNameUseCase

class MainViewModel @ViewModelInject constructor(
    private val getNameUseCase: GetNameUseCase
): ViewModel() {

    fun getName(): String {
        return getNameUseCase.getName()
    }
}