# Dagger_Hilt_Sample

Android JetPack 중 의존성 주입 라이브러리인 'Dagger Hilt' Sample 코드 입니다.

설명
---

+ ## Application 설정

  #### ```@HiltAndroidApp``` 추가
  
  Dagger는 ```DaggerApplication```, ```AndroidInjector<DaggerApplication>```을 상속받아 구현했지만,   
  Hilt는 ```@HiltAndroidApp```로 대체
  
+ ## Activity, Fragment
  
  #### ```@AndroidEntryPoint``` 추가
  
  Dagger는 ```DaggerActivity```, ```DaggerFragment```를 상속받았지만,   
  Hilt는 ```@AndroidEntryPoint```로 대체
  
+ ## ViewModel
  
  #### ```@ViewModelInject``` 추가
  
  Dagger는 ```ViewModelFactory```를 생성했지만,   
  Hilt는 ```@ViewModelInject```로 대체
  
+ ## Component

  #### ```@InstallIn(ApplicationComponent::class)``` 추가
  
  Dagger는 ```@Component```를 따로 만들어줬지만,   
  Hilt는 ```@InstallIn(ApplicationComponent::class)```로 대체
