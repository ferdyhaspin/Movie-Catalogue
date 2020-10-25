package app.ferdyhaspin.moviecatalogue.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.ferdyhaspin.moviecatalogue.R
import app.ferdyhaspin.moviecatalogue.ui.main.MainActivity
import app.ferdyhaspin.moviecatalogue.utils.Coroutines
import app.ferdyhaspin.moviecatalogue.utils.goTo
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Coroutines.main {
            delay(2000L)
            this goTo MainActivity::class.java
        }
    }
}