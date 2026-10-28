package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends y8.a implements y8.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f2675b = new t(y8.d.f15107a, new b3.b0(9));

    public u() {
        super(y8.d.f15107a);
    }

    public abstract void g(y8.h hVar, Runnable runnable);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((y8.f) r3.f2668a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (y8.d.f15107a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return y8.i.f15108a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // y8.a, y8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y8.h h(y8.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            i9.l.e(r3, r0)
            boolean r0 = r3 instanceof cc.t
            if (r0 == 0) goto L20
            cc.t r3 = (cc.t) r3
            y8.g r0 = r2.f15104a
            if (r0 == r3) goto L15
            y8.g r1 = r3.f2669b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            h9.k r3 = r3.f2668a
            java.lang.Object r3 = r3.invoke(r2)
            y8.f r3 = (y8.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            y8.d r0 = y8.d.f15107a
            if (r0 != r3) goto L27
        L24:
            y8.i r3 = y8.i.f15108a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.u.h(y8.g):y8.h");
    }

    @Override // y8.a, y8.h
    public final y8.f l(y8.g gVar) {
        y8.f fVar;
        i9.l.e(gVar, "key");
        if (!(gVar instanceof t)) {
            if (y8.d.f15107a == gVar) {
                return this;
            }
            return null;
        }
        t tVar = (t) gVar;
        y8.g gVar2 = this.f15104a;
        if ((gVar2 == tVar || tVar.f2669b == gVar2) && (fVar = (y8.f) tVar.f2668a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this);
    }

    public void u(y8.h hVar, Runnable runnable) {
        g(hVar, runnable);
    }

    public boolean v(y8.h hVar) {
        return !(this instanceof w1);
    }

    public u w(int i7) {
        hc.a.a(i7);
        return new hc.g(this, i7);
    }
}
