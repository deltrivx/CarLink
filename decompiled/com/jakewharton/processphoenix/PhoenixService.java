package com.jakewharton.processphoenix;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class PhoenixService extends IntentService {
    public PhoenixService() {
        super("PhoenixService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        int i7 = Build.VERSION.SDK_INT;
        Intent intent2 = i7 >= 33 ? (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class) : (Intent) intent.getParcelableExtra("phoenix_restart_intent");
        if (i7 > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        if (i7 >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        Runtime.getRuntime().exit(0);
    }
}
