package adneom.myapplication

import android.app.Application

/**
 * Created by gtshilombowanticale on 23-06-17.
 */

class MainApplication : Application() {

    //var applicationComponent : ApplicationComponent? = null
    companion object {
        @JvmStatic lateinit var applicationComponent : ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build();
    }
}