package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bs extends m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3367a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3368b = "";

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3367a = kVar.b(0, true);
        this.f3368b = kVar.b(1, true);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3367a, 0);
        lVar.a(this.f3368b, 1);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
