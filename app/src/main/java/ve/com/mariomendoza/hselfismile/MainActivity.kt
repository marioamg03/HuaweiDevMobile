package ve.com.mariomendoza.hselfismile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.huawei.hms.aaid.constant.AaidIdConstant.getToken
import kotlinx.android.synthetic.main.activity_main.*
import ve.com.mariomendoza.hselfismile.push.GetTokenAction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GetTokenAction().getToken(this) {
            Log.d("Push Token: ", it)
            idHuawei.text = it
        }
    }
}
