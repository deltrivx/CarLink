package c6;

import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f2443c;

    public c(int i7, int i10, int i11, int i12, int[] iArr) {
        this.f2441a = i7;
        this.f2442b = iArr;
        float f10 = i12;
        this.f2443c = new o[]{new o(i10, f10), new o(i11, f10)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f2441a == ((c) obj).f2441a;
    }

    public final int hashCode() {
        return this.f2441a;
    }
}
