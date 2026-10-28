package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class PhoenixActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        Intent[] intentArr = (Intent[]) getIntent().getParcelableArrayListExtra("phoenix_restart_intents").toArray(new Intent[0]);
        if (Build.VERSION.SDK_INT > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        startActivities(intentArr);
        finish();
        Runtime.getRuntime().exit(0);
    }
}
