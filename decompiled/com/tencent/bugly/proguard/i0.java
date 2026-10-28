package com.tencent.bugly.proguard;

import android.os.Trace;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3435a;

    public /* synthetic */ i0(int i7) {
        this.f3435a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3435a) {
            case 0:
                NativeCrashHandler.getInstance().unBlockSigquit(true);
                return;
            case 1:
                NativeCrashHandler.getInstance().unBlockSigquit(false);
                return;
            default:
                try {
                    int i7 = a4.j.f38a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l4.j.d()) {
                        l4.j.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i10 = a4.j.f38a;
                    Trace.endSection();
                }
        }
    }
}
