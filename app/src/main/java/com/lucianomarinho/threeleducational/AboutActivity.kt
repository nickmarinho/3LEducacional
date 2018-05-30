package com.lucianomarinho.threeleducational

import android.os.Bundle
import android.app.Activity
import com.google.android.gms.ads.MobileAds

class AboutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_main)

        // Sample AdMob app ID: ca-app-pub-1610170770030834~6659434082
        MobileAds.initialize(this, "ca-app-pub-1610170770030834~6659434082")
    }

}