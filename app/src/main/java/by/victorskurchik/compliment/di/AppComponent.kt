package by.victorskurchik.compliment.di

import by.victorskurchik.compliment.presentation.MainActivity
import by.victorskurchik.compliment.presentation.ViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun viewModelsFactory(): ViewModelFactory

    fun inject(activity: MainActivity)
}