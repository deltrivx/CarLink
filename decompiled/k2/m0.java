package k2;

import a8.c1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cc.o1;
import java.util.ArrayList;
import q2.b2;
import q2.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends r1.o implements z, n3.c, v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f7254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f7255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PointerInputEventHandler f7256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o1 f7257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f7258s = h0.f7217a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1.e f7259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1.e f7260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1.e f7261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f7262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7263x;

    public m0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f7254o = obj;
        this.f7255p = obj2;
        this.f7256q = pointerInputEventHandler;
        h1.e eVar = new h1.e(new l0[16]);
        this.f7259t = eVar;
        this.f7260u = eVar;
        this.f7261v = new h1.e(new l0[16]);
        this.f7263x = 0L;
    }

    public final Object A0(h9.n nVar, y8.c cVar) {
        cc.l lVar = new cc.l(1, n4.h.L(cVar));
        lVar.p();
        l0 l0Var = new l0(this, lVar);
        synchronized (this.f7260u) {
            this.f7259t.b(l0Var);
            new y8.j(n4.h.L(n4.h.x(nVar, l0Var, l0Var))).resumeWith(t8.z.f12851a);
        }
        lVar.r(new b2.a(2, l0Var));
        return lVar.o();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void B0(n nVar, o oVar) {
        Object[] objArr;
        int i7;
        int i10;
        l0 l0Var;
        cc.l lVar;
        cc.l lVar2;
        synchronized (this.f7260u) {
            h1.e eVar = this.f7261v;
            eVar.c(eVar.f6423c, this.f7259t);
        }
        try {
            int iOrdinal = oVar.ordinal();
            if (iOrdinal == 0) {
                h1.e eVar2 = this.f7261v;
                objArr = eVar2.f6421a;
                i7 = eVar2.f6423c;
                for (i10 = 0; i10 < i7; i10++) {
                    l0Var = (l0) objArr[i10];
                    if (oVar != l0Var.f7249d && (lVar = l0Var.f7248c) != null) {
                        l0Var.f7248c = null;
                        lVar.resumeWith(nVar);
                    }
                }
            } else if (iOrdinal == 1) {
                h1.e eVar3 = this.f7261v;
                int i11 = eVar3.f6423c - 1;
                Object[] objArr2 = eVar3.f6421a;
                if (i11 < objArr2.length) {
                    while (i11 >= 0) {
                        l0 l0Var2 = (l0) objArr2[i11];
                        if (oVar == l0Var2.f7249d && (lVar2 = l0Var2.f7248c) != null) {
                            l0Var2.f7248c = null;
                            lVar2.resumeWith(nVar);
                        }
                        i11--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new cc.s();
                }
                h1.e eVar4 = this.f7261v;
                objArr = eVar4.f6421a;
                i7 = eVar4.f6423c;
                while (i10 < i7) {
                    l0Var = (l0) objArr[i10];
                    if (oVar != l0Var.f7249d) {
                    }
                }
            }
            this.f7261v.h();
        } catch (Throwable th) {
            this.f7261v.h();
            throw th;
        }
    }

    public final void C0() {
        o1 o1Var = this.f7257r;
        if (o1Var != null) {
            o1Var.C(new y(2, "Pointer input was reset"));
            this.f7257r = null;
        }
    }

    @Override // n3.c
    public final long F(float f10) {
        return a2.f.o(L(f10), this);
    }

    @Override // q2.v1
    public final /* synthetic */ void I() {
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // n3.c
    public final float O() {
        return q2.f.v(this).f10689x.O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return q2.f.v(this).f10689x.a();
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    @Override // q2.v1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    @Override // q2.v1
    public final void g0() {
        C0();
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // q2.v1
    public final void l0(n nVar, o oVar, long j5) {
        this.f7263x = j5;
        if (oVar == o.f7269a) {
            this.f7258s = nVar;
        }
        y8.c cVar = null;
        if (this.f7257r == null) {
            this.f7257r = cc.b0.s(m0(), null, new c1(this, cVar, 18), 1);
        }
        B0(nVar, oVar);
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!u.c((v) r8.get(i7))) {
                this.f7262w = nVar;
            }
        }
        nVar = null;
        this.f7262w = nVar;
    }

    @Override // q2.v1
    public final long m() {
        return b2.f10596a;
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // r1.o
    public final void r0() {
        C0();
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }

    @Override // r1.o
    public final void s0() {
        C0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // q2.v1
    public final void z() {
        n nVar = this.f7262w;
        if (nVar == null) {
            return;
        }
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((v) r8.get(i7)).f7281d) {
                ArrayList arrayList = new ArrayList(r8.size());
                int size2 = r8.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    v vVar = (v) r8.get(i10);
                    long j5 = vVar.f7278a;
                    long j10 = vVar.f7280c;
                    long j11 = vVar.f7279b;
                    float f10 = vVar.f7282e;
                    boolean z10 = vVar.f7281d;
                    arrayList.add(new v(j5, j11, j10, false, f10, j11, j10, z10, z10, vVar.f7286i, 0L));
                }
                n nVar2 = new n(arrayList, null);
                this.f7258s = nVar2;
                B0(nVar2, o.f7269a);
                B0(nVar2, o.f7270b);
                B0(nVar2, o.f7271c);
                this.f7262w = null;
                return;
            }
        }
    }
}
