package com.developndesign.firebaseautomlvisionedge;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MlKitTuto extends AppCompatActivity {
    WebView web;
    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ml_kit_tuto);
        alert = new AlertDialog.Builder(this);



        web = findViewById(R.id.web);
        web.loadUrl("https://firebase.google.com/docs/ml-kit");
        WebSettings webSettings=web.getSettings();
        webSettings.setAllowContentAccess(true);

        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

        // demo1TrySpecificURL();
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }




//    @Override
//    public void onBackPressed() {
//        //  super.onBackPressed();
//        if(web.canGoBack()){
//            web.goBack();
//        }
//        else{
//            AlertDialog dialog=alert.create();
//            dialog.setMessage("are you sure want to exit");
//            dialog.show();
//            //  finish();
//        }
//    }
}
