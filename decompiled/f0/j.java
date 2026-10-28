package f0;

import f1.w1;
import h0.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f4778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7.l f4781d;

    public j(u uVar, g gVar, c cVar, g7.l lVar) {
        this.f4778a = uVar;
        this.f4779b = gVar;
        this.f4780c = cVar;
        this.f4781d = lVar;
    }

    @Override // h0.v
    public final int a() {
        return this.f4779b.k().f5998b;
    }

    @Override // h0.v
    public final Object b(int i7) {
        g7.l lVar = this.f4781d;
        Object[] objArr = (Object[]) lVar.f6000d;
        int i10 = i7 - lVar.f5998b;
        Object obj = (i10 < 0 || i10 >= objArr.length) ? null : objArr[i10];
        return obj == null ? this.f4779b.l(i7) : obj;
    }

    @Override // h0.v
    public final Object c(int i7) {
        return this.f4779b.j(i7);
    }

    @Override // h0.v
    public final int d(Object obj) {
        return this.f4781d.d(obj);
    }

    @Override // h0.v
    public final void e(int i7, Object obj, f1.s sVar, int i10) {
        sVar.Y(-462424778);
        int i11 = (sVar.d(i7) ? 4 : 2) | i10 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.N(i11 & 1, (i11 & 147) != 146)) {
            z.b(obj, i7, this.f4778a.f4868r, n1.h.e(-824725566, new i(this, i7, 0), sVar), sVar, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h(this, i7, obj, i10, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return i9.l.a(this.f4779b, ((j) obj).f4779b);
    }

    public final int hashCode() {
        return this.f4779b.hashCode();
    }
}
