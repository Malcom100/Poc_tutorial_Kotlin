package adneom.myapplication

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 23-06-17.
 */

@Module
class ApplicationModule(private val application : Application) {

    @Provides
    @Singleton
    fun providesApplicationContext() : Context {
        return application
    }

    @Provides
    fun test() : String {
        return "my test ".plus("!!!")
    }
}