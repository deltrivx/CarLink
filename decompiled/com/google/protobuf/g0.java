package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f2749b;

    public g0(o0 o0Var, int i7, r2 r2Var, boolean z10, boolean z11) {
        this.f2748a = i7;
        this.f2749b = r2Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2748a - ((g0) obj).f2748a;
    }
}
