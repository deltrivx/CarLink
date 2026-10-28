package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ar implements Comparable<ar> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3168a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3169b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3170c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3171d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3172e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3173f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ar arVar) {
        ar arVar2 = arVar;
        if (arVar2 == null) {
            return 1;
        }
        long j5 = this.f3169b - arVar2.f3169b;
        if (j5 <= 0) {
            return j5 < 0 ? -1 : 0;
        }
        return 1;
    }
}
