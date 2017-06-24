package adneom.myapplication.model

import android.util.Log

/**
 * Created by gtshilombowanticale on 22-06-17.
 */

class User : Person {

    constructor(username: String?, password : String?) : super(username, password){
        Log.i("Adneom","Tests : "+(username == null)+" && "+(password == null));
    }
}