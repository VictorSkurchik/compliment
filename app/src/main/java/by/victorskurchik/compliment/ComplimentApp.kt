package by.victorskurchik.compliment

import android.app.Application
import timber.log.Timber

class ComplimentApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}