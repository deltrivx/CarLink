package com.tencent.bugly.proguard;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Thread f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f3447f;

    public k0(Thread thread, int i7, String str, String str2, String str3, Map map) {
        this.f3442a = thread;
        this.f3443b = i7;
        this.f3444c = str;
        this.f3445d = str2;
        this.f3446e = str3;
        this.f3447f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (au.f3218a == null) {
                al.e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
            } else {
                au.a(au.f3218a, this.f3442a, this.f3443b, this.f3444c, this.f3445d, this.f3446e, this.f3447f);
            }
        } catch (Throwable th) {
            if (!al.b(th)) {
                th.printStackTrace();
            }
            al.e("[ExtraCrashManager] Crash error %s %s %s", this.f3444c, this.f3445d, this.f3446e);
        }
    }
}
