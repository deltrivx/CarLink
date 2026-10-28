package j2;

import cc.b0;
import cc.y;
import i9.x;
import n3.t;
import q2.d2;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o implements d2, a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f6914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f6915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f6916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f6917r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public g(a aVar, d dVar) {
        this.f6914o = aVar;
        this.f6915p = dVar;
    }

    public final y A0() {
        g gVar = this.f11129n ? (g) q2.f.j(this) : null;
        y yVarA0 = gVar != null ? gVar.A0() : null;
        if (yVarA0 != null && b0.q(yVarA0)) {
            return yVarA0;
        }
        y yVar = this.f6915p.f6904d;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // j2.a
    public final long G(int i7, long j5) {
        boolean z10 = this.f11129n;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) q2.f.j(this);
        }
        long jG = gVar != null ? gVar.G(i7, j5) : 0L;
        return x1.b.h(jG, this.f6914o.G(i7, x1.b.g(j5, jG)));
    }

    @Override // j2.a
    public final long f0(long j5, long j10, int i7) {
        long jF0 = this.f6914o.f0(j5, j10, i7);
        boolean z10 = this.f11129n;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) q2.f.j(this);
        }
        g gVar2 = gVar;
        return x1.b.h(jF0, gVar2 != null ? gVar2.f0(x1.b.h(j5, jF0), x1.b.g(j10, jF0), i7) : 0L);
    }

    @Override // q2.d2
    public final Object k() {
        return this.f6917r;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // j2.a
    public final Object l(long j5, long j10, y8.c cVar) {
        e eVar;
        long j11;
        long j12;
        long j13;
        g gVar;
        long j14;
        long j15;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i7 = eVar.f6909e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f6909e = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, (a9.c) cVar);
            }
        } else {
            eVar = new e(this, (a9.c) cVar);
        }
        e eVar2 = eVar;
        Object objL = eVar2.f6907c;
        int i10 = eVar2.f6909e;
        z8.a aVar = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(objL);
            a aVar2 = this.f6914o;
            eVar2.f6905a = j5;
            eVar2.f6906b = j10;
            eVar2.f6909e = 1;
            objL = aVar2.l(j5, j10, eVar2);
            if (objL != aVar) {
                j11 = j5;
                j12 = j10;
            }
            return aVar;
        }
        if (i10 == 1) {
            j12 = eVar2.f6906b;
            j11 = eVar2.f6905a;
            t8.a.e(objL);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j15 = eVar2.f6905a;
            t8.a.e(objL);
        }
        j14 = ((t) objL).f8763a;
        j13 = j15;
        return new t(t.e(j13, j14));
        j13 = ((t) objL).f8763a;
        boolean z10 = this.f11129n;
        if (z10) {
            gVar = null;
            if (z10 && z10) {
                gVar = (g) q2.f.j(this);
            }
        } else {
            gVar = this.f6916q;
        }
        if (gVar != null) {
            long jE = t.e(j11, j13);
            long jD = t.d(j12, j13);
            eVar2.f6905a = j13;
            eVar2.f6909e = 2;
            objL = gVar.l(jE, jD, eVar2);
            if (objL != aVar) {
                j15 = j13;
                j14 = ((t) objL).f8763a;
                j13 = j15;
            }
            return aVar;
        }
        j14 = 0;
        return new t(t.e(j13, j14));
    }

    @Override // r1.o
    public final void q0() {
        d dVar = this.f6915p;
        dVar.f6901a = this;
        dVar.f6902b = null;
        this.f6916q = null;
        dVar.f6903c = new b1.a(8, this);
        dVar.f6904d = m0();
    }

    @Override // r1.o
    public final void s0() {
        x xVar = new x();
        q2.f.z(this, new h(xVar, 0));
        g gVar = (g) ((d2) xVar.f6688a);
        this.f6916q = gVar;
        d dVar = this.f6915p;
        dVar.f6902b = gVar;
        if (dVar.f6901a == this) {
            dVar.f6901a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r12 == r4) goto L29;
     */
    @Override // j2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(long r10, y8.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof j2.f
            if (r0 == 0) goto L13
            r0 = r12
            j2.f r0 = (j2.f) r0
            int r1 = r0.f6913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6913d = r1
            goto L1a
        L13:
            j2.f r0 = new j2.f
            a9.c r12 = (a9.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f6911b
            int r1 = r0.f6913d
            r2 = 2
            r3 = 1
            z8.a r4 = z8.a.f15774a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            long r10 = r0.f6910a
            t8.a.e(r12)
            goto L76
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r10 = r0.f6910a
            t8.a.e(r12)
            goto L5a
        L3c:
            t8.a.e(r12)
            boolean r12 = r9.f11129n
            r1 = 0
            if (r12 == 0) goto L4d
            if (r12 == 0) goto L4d
            q2.d2 r12 = q2.f.j(r9)
            r1 = r12
            j2.g r1 = (j2.g) r1
        L4d:
            if (r1 == 0) goto L62
            r0.f6910a = r10
            r0.f6913d = r3
            java.lang.Object r12 = r1.u(r10, r0)
            if (r12 != r4) goto L5a
            goto L75
        L5a:
            n3.t r12 = (n3.t) r12
            long r5 = r12.f8763a
        L5e:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L65
        L62:
            r5 = 0
            goto L5e
        L65:
            j2.a r12 = r9.f6914o
            long r5 = n3.t.d(r5, r10)
            r0.f6910a = r10
            r0.f6913d = r2
            java.lang.Object r12 = r12.u(r5, r0)
            if (r12 != r4) goto L76
        L75:
            return r4
        L76:
            n3.t r12 = (n3.t) r12
            long r0 = r12.f8763a
            long r10 = n3.t.e(r10, r0)
            n3.t r12 = new n3.t
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.g.u(long, y8.c):java.lang.Object");
    }
}
