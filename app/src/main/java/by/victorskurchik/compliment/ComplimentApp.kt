package by.victorskurchik.compliment

import android.app.Application
import by.victorskurchik.compliment.di.AppComponent
import by.victorskurchik.compliment.di.DaggerAppComponent
import timber.log.Timber

class ComplimentApp : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    override fun onCreate() {
        super.onCreate()
        initializeTimber()
    }

    private fun initializeTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initializeComponent(): AppComponent {
        return DaggerAppComponent.create()
    }
}
