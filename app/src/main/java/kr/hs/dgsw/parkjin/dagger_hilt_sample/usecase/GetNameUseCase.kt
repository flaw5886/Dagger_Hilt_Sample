package kr.hs.dgsw.parkjin.dagger_hilt_sample.usecase

import kr.hs.dgsw.parkjin.dagger_hilt_sample.repository.NameRepository
import javax.inject.Inject

class GetNameUseCase @Inject constructor(private val nameRepository: NameRepository) {
    fun getName() = nameRepository.getName()
}