package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class bn extends m implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static byte[] f3301d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f3302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3304c;

    public bn() {
        this.f3302a = (byte) 0;
        this.f3303b = "";
        this.f3304c = null;
    }

    public bn(byte b10, String str, byte[] bArr) {
        this.f3302a = b10;
        this.f3303b = str;
        this.f3304c = bArr;
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f3302a = kVar.a(this.f3302a, 0, true);
        this.f3303b = kVar.b(1, true);
        if (f3301d == null) {
            f3301d = new byte[]{0};
        }
        this.f3304c = kVar.c(2, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f3302a, 0);
        lVar.a(this.f3303b, 1);
        byte[] bArr = this.f3304c;
        if (bArr != null) {
            lVar.a(bArr, 2);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i7) {
    }
}
