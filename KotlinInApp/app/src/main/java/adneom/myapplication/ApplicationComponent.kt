package adneom.myapplication

import android.content.Context
import dagger.Component
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 23-06-17.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun getContext() : Context
    fun testA() : String
}