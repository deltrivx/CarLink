package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends h1 implements y8.c, y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y8.h f2587c;

    public a(y8.h hVar, boolean z10) {
        super(z10);
        P((a1) hVar.l(v.f2678b));
        this.f2587c = hVar.s(this);
    }

    @Override // cc.h1
    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // cc.h1
    public final void O(s sVar) {
        b0.o(sVar, this.f2587c);
    }

    @Override // cc.h1
    public final void W(Object obj) {
        if (!(obj instanceof r)) {
            f0(obj);
        } else {
            r rVar = (r) obj;
            e0(rVar.f2662a, r.f2661b.get(rVar) != 0);
        }
    }

    public void e0(Throwable th, boolean z10) {
    }

    public void f0(Object obj) {
    }

    public final void g0(z zVar, a aVar, h9.n nVar) {
        Object objInvoke;
        int iOrdinal = zVar.ordinal();
        t8.z zVar2 = t8.z.f12851a;
        if (iOrdinal == 0) {
            try {
                hc.a.h(zVar2, n4.h.L(n4.h.x(nVar, aVar, this)));
                return;
            } catch (Throwable th) {
                resumeWith(t8.a.b(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i9.l.e(nVar, "<this>");
                n4.h.L(n4.h.x(nVar, aVar, this)).resumeWith(zVar2);
                return;
            }
            if (iOrdinal != 3) {
                throw new s();
            }
            try {
                y8.h hVar = this.f2587c;
                Object objL = hc.a.l(hVar, null);
                try {
                    if (nVar instanceof a9.a) {
                        i9.b0.d(2, nVar);
                        objInvoke = nVar.invoke(aVar, this);
                    } else {
                        objInvoke = n4.h.i0(nVar, aVar, this);
                    }
                    hc.a.g(hVar, objL);
                    if (objInvoke != z8.a.f15774a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    hc.a.g(hVar, objL);
                    throw th2;
                }
            } catch (Throwable th3) {
                resumeWith(t8.a.b(th3));
            }
        }
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f2587c;
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        Throwable thA = t8.m.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        Object objS = S(obj);
        if (objS == b0.f2594e) {
            return;
        }
        A(objS);
    }

    @Override // cc.y
    public final y8.h u() {
        return this.f2587c;
    }
}
