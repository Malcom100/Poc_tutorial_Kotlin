package adneom.myapplication

import adneom.myapplication.model.Person
import adneom.myapplication.model.User

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login.setOnClickListener { v ->
            if(fieldsAreNotEmpty()){
                val person = Person(username.text.toString(),password.text.toString());
                var test1 : String? = "sfgsd";
                var test2 : String? = "ssfsfd";
                test1 = null;
                test2 = null;
                var user = User(test1,test2);
                Log.i("Adneom","next view :)");
            }
        }
    }

    fun fieldsAreNotEmpty(): Boolean {
        return username.text.toString().isNotEmpty() || password.text.toString().isNotEmpty();
    }
}
