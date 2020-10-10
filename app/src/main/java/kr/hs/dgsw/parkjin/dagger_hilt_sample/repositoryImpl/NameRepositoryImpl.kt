package kr.hs.dgsw.parkjin.dagger_hilt_sample.repositoryImpl

import kr.hs.dgsw.parkjin.dagger_hilt_sample.repository.NameRepository
import javax.inject.Inject

class NameRepositoryImpl @Inject constructor() : NameRepository {
    override fun getName(): String = "My name is Hilt"
}