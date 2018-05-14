package br.com.a3l.a3leducacional

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	// Sample AdMob app ID: ca-app-pub-1610170770030834~6659434082
        MobileAds.initialize(this, "ca-app-pub-1610170770030834~6659434082")
    }
}
