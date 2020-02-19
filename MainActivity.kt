package examples.pltw.org

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Arithmetic testArithmetic = new Arithmetic();
        System.out.println(testArithmetic);
    }
}
