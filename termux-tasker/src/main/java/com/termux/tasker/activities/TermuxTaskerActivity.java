package com.termux.tasker.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.termux.tasker.R;

public class TermuxTaskerActivity extends AppCompatActivity {

    private static final String LOG_TAG = "TermuxTaskerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termux_tasker);

        //AppCompatActivityUtils.setToolbar(this, R.id.toolbar);
        //AppCompatActivityUtils.setToolbarTitle(this, R.id.toolbar, TermuxConstants.TERMUX_TASKER_APP_NAME, 0);

        TextView pluginInfo = findViewById(R.id.textview_plugin_info);
        //pluginInfo.setText(getString(R.string.plugin_info, TermuxConstants.TERMUX_GITHUB_REPO_URL, TermuxConstants.TERMUX_TASKER_GITHUB_REPO_URL));

        Button disableLauncherIconButton = findViewById(R.id.btn_disable_launcher_icon);
        disableLauncherIconButton.setOnClickListener(v -> {
            //String message = getString(R.string.msg_disabling_launcher_icon, TermuxConstants.TERMUX_TASKER_APP_NAME);
            //PackageUtils.setComponentState(TermuxTaskerActivity.this, TermuxConstants.TERMUX_TASKER_PACKAGE_NAME, TermuxConstants.TERMUX_TASKER.TERMUX_TASKER_ACTIVITY_NAME, false, message, true);
        });
    }

}
