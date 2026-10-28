package x5;

import e4.n;
import j.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b[] f14596h = {new b(1, 10, 10, 8, 8, new g(5, new n(1, 3, 5))), new b(2, 12, 12, 10, 10, new g(7, new n(1, 5, 5))), new b(3, 14, 14, 12, 12, new g(10, new n(1, 8, 5))), new b(4, 16, 16, 14, 14, new g(12, new n(1, 12, 5))), new b(5, 18, 18, 16, 16, new g(14, new n(1, 18, 5))), new b(6, 20, 20, 18, 18, new g(18, new n(1, 22, 5))), new b(7, 22, 22, 20, 20, new g(20, new n(1, 30, 5))), new b(8, 24, 24, 22, 22, new g(24, new n(1, 36, 5))), new b(9, 26, 26, 24, 24, new g(28, new n(1, 44, 5))), new b(10, 32, 32, 14, 14, new g(36, new n(1, 62, 5))), new b(11, 36, 36, 16, 16, new g(42, new n(1, 86, 5))), new b(12, 40, 40, 18, 18, new g(48, new n(1, 114, 5))), new b(13, 44, 44, 20, 20, new g(56, new n(1, 144, 5))), new b(14, 48, 48, 22, 22, new g(68, new n(1, 174, 5))), new b(15, 52, 52, 24, 24, new g(42, new n(2, 102, 5))), new b(16, 64, 64, 14, 14, new g(56, new n(2, 140, 5))), new b(17, 72, 72, 16, 16, new g(36, new n(4, 92, 5))), new b(18, 80, 80, 18, 18, new g(48, new n(4, 114, 5))), new b(19, 88, 88, 20, 20, new g(56, new n(4, 144, 5))), new b(20, 96, 96, 22, 22, new g(68, new n(4, 174, 5))), new b(21, 104, 104, 24, 24, new g(56, new n(6, 136, 5))), new b(22, 120, 120, 18, 18, new g(68, new n(6, 175, 5))), new b(23, 132, 132, 20, 20, new g(62, new n(8, 163, 5))), new b(24, 144, 144, 22, 22, new g(new n(8, 156, 5), new n(2, 155, 5))), new b(25, 8, 18, 6, 16, new g(7, new n(1, 5, 5))), new b(26, 8, 32, 6, 14, new g(11, new n(1, 10, 5))), new b(27, 12, 26, 10, 24, new g(14, new n(1, 16, 5))), new b(28, 12, 36, 10, 16, new g(18, new n(1, 22, 5))), new b(29, 16, 36, 14, 16, new g(24, new n(1, 32, 5))), new b(30, 16, 48, 14, 22, new g(28, new n(1, 49, 5)))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f14602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14603g;

    public b(int i7, int i10, int i11, int i12, int i13, g gVar) {
        this.f14597a = i7;
        this.f14598b = i10;
        this.f14599c = i11;
        this.f14600d = i12;
        this.f14601e = i13;
        this.f14602f = gVar;
        int i14 = gVar.f6794b;
        int i15 = 0;
        for (n nVar : (n[]) gVar.f6795c) {
            i15 += (nVar.f4381c + i14) * nVar.f4380b;
        }
        this.f14603g = i15;
    }

    public final String toString() {
        return String.valueOf(this.f14597a);
    }
}
