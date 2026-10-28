package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.e f4946a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f4948c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4947b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1.a f4949d = new n1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.d0 f4950e = new s.d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.d0 f4951f = new s.d0();

    public f(a5.e eVar) {
        this.f4946a = eVar;
    }

    public static final void c(f fVar, Throwable th) {
        int i7;
        synchronized (fVar.f4947b) {
            try {
                if (fVar.f4948c != null) {
                    return;
                }
                fVar.f4948c = th;
                s.d0 d0Var = fVar.f4950e;
                Object[] objArr = d0Var.f12407a;
                int i10 = d0Var.f12408b;
                for (int i11 = 0; i11 < i10; i11++) {
                    cc.l lVar = ((d) objArr[i11]).f4927b;
                    if (lVar != null) {
                        lVar.resumeWith(t8.a.b(th));
                    }
                }
                fVar.f4950e.c();
                n1.a aVar = fVar.f4949d;
                do {
                    i7 = aVar.get();
                } while (!aVar.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(long j5) {
        int i7;
        cc.l lVar;
        Object objB;
        synchronized (this.f4947b) {
            try {
                s.d0 d0Var = this.f4950e;
                this.f4950e = this.f4951f;
                this.f4951f = d0Var;
                n1.a aVar = this.f4949d;
                do {
                    i7 = aVar.get();
                } while (!aVar.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
                int i10 = d0Var.f12408b;
                for (int i11 = 0; i11 < i10; i11++) {
                    d dVar = (d) d0Var.e(i11);
                    h9.k kVar = dVar.f4926a;
                    if (kVar != null && (lVar = dVar.f4927b) != null) {
                        try {
                            objB = kVar.invoke(Long.valueOf(j5));
                        } catch (Throwable th) {
                            objB = t8.a.b(th);
                        }
                        lVar.resumeWith(objB);
                    }
                }
                d0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y8.f
    public final y8.g getKey() {
        return w0.f5183b;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        return n3.u.F(this, gVar);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        return n3.u.A(this, gVar);
    }

    @Override // f1.x0
    public final Object m(h9.k kVar, y8.c cVar) {
        int i7;
        int i10;
        boolean z10 = true;
        cc.l lVar = new cc.l(1, n4.h.L(cVar));
        lVar.p();
        d dVar = new d();
        dVar.f4926a = kVar;
        dVar.f4927b = lVar;
        i9.v vVar = new i9.v();
        vVar.f6686a = -1;
        synchronized (this.f4947b) {
            Throwable th = this.f4948c;
            if (th != null) {
                lVar.resumeWith(t8.a.b(th));
            } else {
                n1.a aVar = this.f4949d;
                do {
                    i7 = aVar.get();
                    i10 = i7 + 1;
                } while (!aVar.compareAndSet(i7, i10));
                if ((134217727 & i10) != 1) {
                    z10 = false;
                }
                vVar.f6686a = (i10 >>> 27) & 15;
                this.f4950e.a(dVar);
                lVar.r(new e(dVar, this, vVar, 0));
                if (z10) {
                    try {
                        this.f4946a.invoke();
                    } catch (Throwable th2) {
                        c(this, th2);
                    }
                }
            }
        }
        return lVar.o();
    }

    @Override // y8.h
    public final Object q(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        return n3.u.G(this, hVar);
    }
}
