package o2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f9321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f9322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f9324e;

    public /* synthetic */ e0(n0 n0Var, i0 i0Var, int i7, n0 n0Var2, int i10) {
        this.f9320a = i10;
        this.f9322c = i0Var;
        this.f9323d = i7;
        this.f9324e = n0Var2;
        this.f9321b = n0Var;
    }

    @Override // o2.n0
    public final Map b() {
        switch (this.f9320a) {
            case 0:
                break;
        }
        return this.f9321b.b();
    }

    @Override // o2.n0
    public final void c() {
        switch (this.f9320a) {
            case 0:
                int i7 = this.f9323d;
                i0 i0Var = this.f9322c;
                i0Var.f9345e = i7;
                this.f9324e.c();
                s.h0 h0Var = i0Var.f9351l;
                long[] jArr = h0Var.f12437a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j5) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = h0Var.f12438b[i13];
                                    f1 f1Var = (f1) h0Var.f12439c[i13];
                                    int iJ = i0Var.f9352m.j(obj);
                                    if (iJ < 0 || iJ >= i0Var.f9345e) {
                                        f1Var.a();
                                        h0Var.l(i13);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        }
                    }
                }
                break;
            default:
                int i14 = this.f9323d;
                i0 i0Var2 = this.f9322c;
                i0Var2.f9344d = i14;
                this.f9324e.c();
                i0Var2.d(i0Var2.f9344d);
                break;
        }
    }

    @Override // o2.n0
    public final h9.k d() {
        switch (this.f9320a) {
            case 0:
                break;
        }
        return this.f9321b.d();
    }

    @Override // o2.n0
    public final int getHeight() {
        switch (this.f9320a) {
            case 0:
                break;
        }
        return this.f9321b.getHeight();
    }

    @Override // o2.n0
    public final int getWidth() {
        switch (this.f9320a) {
            case 0:
                break;
        }
        return this.f9321b.getWidth();
    }
}
