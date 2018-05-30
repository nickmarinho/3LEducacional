package com.lucianomarinho.threeleducational

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.android.gms.ads.MobileAds;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle(getString(R.string.app_name))

        val menuList = getResources().getStringArray(R.array.menu_list)
        val drawerList = (ListView) findViewById(R.id.left_drawer)

        // Set the adapter for the list view
        drawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, menuList))
        // Set the list's click listener
        drawerList.setOnItemClickListener(new DrawerItemClickListener())

        // Sample AdMob app ID: ca-app-pub-1610170770030834~6659434082
        MobileAds.initialize(this, "ca-app-pub-1610170770030834~6659434082")
    }
}
