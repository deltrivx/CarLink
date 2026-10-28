package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends xa.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12206e;

    @Override // xa.i
    public final xa.a a() {
        v vVar = new v(this);
        int i7 = (this.f12205d & 1) != 1 ? 0 : 1;
        vVar.f12226d = this.f12206e;
        vVar.f12225c = i7;
        if (vVar.isInitialized()) {
            return vVar;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        v vVar = null;
        try {
            try {
                v.f12223h.getClass();
                e(new v(eVar, gVar));
                return this;
            } catch (xa.q e7) {
                v vVar2 = (v) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    vVar = vVar2;
                    if (vVar != null) {
                        e(vVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (vVar != null) {
                e(vVar);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        e((v) nVar);
        return this;
    }

    public final Object clone() {
        u uVar = new u();
        v vVar = new v(this);
        int i7 = (this.f12205d & 1) != 1 ? 0 : 1;
        vVar.f12226d = this.f12206e;
        vVar.f12225c = i7;
        uVar.e(vVar);
        return uVar;
    }

    public final void e(v vVar) {
        if (vVar == v.f12222g) {
            return;
        }
        if ((vVar.f12225c & 1) == 1) {
            int i7 = vVar.f12226d;
            this.f12205d = 1 | this.f12205d;
            this.f12206e = i7;
        }
        d(vVar);
        this.f14792a = this.f14792a.d(vVar.f12224b);
    }
}
