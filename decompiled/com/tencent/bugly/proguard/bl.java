package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bl extends m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3293a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3294b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3295c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3296d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3297e = "";

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3293a = kVar.b(0, true);
        this.f3294b = kVar.b(1, false);
        this.f3295c = kVar.b(2, false);
        this.f3296d = kVar.b(3, false);
        this.f3297e = kVar.b(4, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3293a, 0);
        String str = this.f3294b;
        if (str != null) {
            lVar.a(str, 1);
        }
        String str2 = this.f3295c;
        if (str2 != null) {
            lVar.a(str2, 2);
        }
        String str3 = this.f3296d;
        if (str3 != null) {
            lVar.a(str3, 3);
        }
        String str4 = this.f3297e;
        if (str4 != null) {
            lVar.a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
