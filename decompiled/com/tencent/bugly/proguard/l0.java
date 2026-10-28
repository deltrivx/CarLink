package com.tencent.bugly.proguard;

import android.os.FileObserver;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3450a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ay f3451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ay ayVar) {
        super("/data/anr/", 8);
        this.f3451b = ayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ay ayVar, String str) {
        super(str, 8);
        this.f3451b = ayVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        int i10 = this.f3450a;
        ay ayVar = this.f3451b;
        switch (i10) {
            case 0:
                if (str != null) {
                    String strConcat = "/data/anr/".concat(str);
                    al.d("watching file %s", strConcat);
                    if (!strConcat.contains("trace")) {
                        al.d("not anr file %s", strConcat);
                    } else {
                        ayVar.f3244d.a(new b4.a(4, this, strConcat, false));
                    }
                    break;
                }
                break;
            default:
                if (str != null) {
                    al.d("observe file, dir:%s fileName:%s", ayVar.f3245e, str);
                    if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                        al.c("not manual trace file, ignore.", new Object[0]);
                    } else if (!ayVar.f3241a.get()) {
                        al.c("proc is not in anr, just ignore", new Object[0]);
                    } else if (!ayVar.f3243c.a()) {
                        al.c("Found background anr, resend sigquit later.", new Object[0]);
                        ayVar.a(am.a(str, "manual_bugly_trace_", ".txt"), ayVar.f3245e + "/" + str);
                        al.c("Finish handling one anr, now resend sigquit.", new Object[0]);
                        NativeCrashHandler.getInstance().resendSigquit();
                    } else {
                        al.c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                        NativeCrashHandler.getInstance().resendSigquit();
                        ayVar.a(am.a(str, "manual_bugly_trace_", ".txt"), ayVar.f3245e + "/" + str);
                        al.c("Finish handling one anr.", new Object[0]);
                    }
                    break;
                }
                break;
        }
    }
}
