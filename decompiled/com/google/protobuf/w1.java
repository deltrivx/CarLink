package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f2873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2876d;

    public w1(l1 l1Var, String str, Object[] objArr) {
        this.f2873a = l1Var;
        this.f2874b = str;
        this.f2875c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2876d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f2876d = i7 | (cCharAt2 << i10);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }
}
