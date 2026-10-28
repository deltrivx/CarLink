package f1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5151d;

    public t0() {
        this.f5149b = new Object();
        this.f5150c = new ArrayList();
        this.f5151d = new ArrayList();
        this.f5148a = true;
    }

    public t0(h0.t tVar, o2.h1 h1Var, h0.t0 t0Var) {
        this.f5149b = tVar;
        this.f5150c = h1Var;
        this.f5151d = t0Var;
        this.f5148a = true;
    }

    public t0(t5.b bVar) throws n5.f {
        int i7 = bVar.f12762b;
        if (i7 < 21 || (i7 & 3) != 1) {
            throw n5.f.a();
        }
        this.f5149b = bVar;
    }

    public int a(int i7, int i10, int i11) {
        t5.b bVar = (t5.b) this.f5149b;
        return this.f5148a ? bVar.b(i10, i7) : bVar.b(i7, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f5149b) {
            z10 = this.f5148a;
        }
        return z10;
    }

    public k6.d c() throws n5.f {
        k6.d dVar = (k6.d) this.f5151d;
        if (dVar != null) {
            return dVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i7 = 0; i7 < 6; i7++) {
            iA2 = a(i7, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i10 = 5; i10 >= 0; i10--) {
            iA3 = a(8, i10, iA3);
        }
        int i11 = ((t5.b) this.f5149b).f12762b;
        int i12 = i11 - 7;
        for (int i13 = i11 - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = i11 - 8; i14 < i11; i14++) {
            iA = a(i14, 8, iA);
        }
        k6.d dVarA = k6.d.a(iA3, iA);
        if (dVarA == null) {
            dVarA = k6.d.a(iA3 ^ 21522, iA ^ 21522);
        }
        this.f5151d = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw n5.f.a();
    }

    public k6.g d() throws n5.f {
        k6.g gVar = (k6.g) this.f5150c;
        if (gVar != null) {
            return gVar;
        }
        int i7 = ((t5.b) this.f5149b).f12762b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return k6.g.c(i10);
        }
        int i11 = i7 - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i7 - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        k6.g gVarB = k6.g.b(iA2);
        if (gVarB != null && (gVarB.f7331a * 4) + 17 == i7) {
            this.f5150c = gVarB;
            return gVarB;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        k6.g gVarB2 = k6.g.b(iA);
        if (gVarB2 == null || (gVarB2.f7331a * 4) + 17 != i7) {
            throw n5.f.a();
        }
        this.f5150c = gVarB2;
        return gVarB2;
    }

    public void e() {
        if (((k6.d) this.f5151d) == null) {
            return;
        }
        int i7 = e1.d.c(8)[((k6.d) this.f5151d).f7316b];
        t5.b bVar = (t5.b) this.f5149b;
        int i10 = bVar.f12762b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (k6.c.a(i7, i11, i12)) {
                    bVar.a(i12, i11);
                }
            }
        }
    }
}
