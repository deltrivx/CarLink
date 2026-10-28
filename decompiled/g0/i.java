package g0;

import f1.w1;
import h0.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f5646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7.l f5648c;

    public i(v vVar, h hVar, g7.l lVar) {
        this.f5646a = vVar;
        this.f5647b = hVar;
        this.f5648c = lVar;
    }

    @Override // h0.v
    public final int a() {
        return this.f5647b.k().f5998b;
    }

    @Override // h0.v
    public final Object b(int i7) {
        g7.l lVar = this.f5648c;
        Object[] objArr = (Object[]) lVar.f6000d;
        int i10 = i7 - lVar.f5998b;
        Object obj = (i10 < 0 || i10 >= objArr.length) ? null : objArr[i10];
        return obj == null ? this.f5647b.l(i7) : obj;
    }

    @Override // h0.v
    public final Object c(int i7) {
        return this.f5647b.j(i7);
    }

    @Override // h0.v
    public final int d(Object obj) {
        return this.f5648c.d(obj);
    }

    @Override // h0.v
    public final void e(int i7, Object obj, f1.s sVar, int i10) {
        sVar.Y(1493551140);
        int i11 = (sVar.d(i7) ? 4 : 2) | i10 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.N(i11 & 1, (i11 & 147) != 146)) {
            z.b(obj, i7, this.f5646a.f5753q, n1.h.e(726189336, new f0.i(this, i7, 1), sVar), sVar, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(this, i7, obj, i10, 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return i9.l.a(this.f5647b, ((i) obj).f5647b);
    }

    public final int hashCode() {
        return this.f5647b.hashCode();
    }
}
