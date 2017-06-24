package adneom.myapplication.model

import android.util.Log

/**
 * Created by gtshilombowanticale on 22-06-17.
 */

open class Person (username : String?, password : String?){
    init {
        Log.i("Adneom","username is "+username+" password is "+password);
    }

    constructor(username : String?) : this(username,""){
        Log.i("Adneom","secondary constructor");
    }
    var username : String
    get() = username
    set(value) {
        username = "nv ".plus(value);
    }
    var password : String
    get() = password
    set(value) { password = value}
}