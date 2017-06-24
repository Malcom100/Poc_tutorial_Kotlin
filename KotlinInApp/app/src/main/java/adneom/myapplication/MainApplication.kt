package adneom.myapplication

import android.app.Application

/**
 * Created by gtshilombowanticale on 23-06-17.
 */

class MainApplication : Application() {

    //var applicationComponent : ApplicationComponent? = null
    companion object {
        lateinit var applicationComponent : ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        //DaggerApplicationComponent.builder().build();
    }
}