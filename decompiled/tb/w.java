package tb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f12948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12949b;

    public w(String str, h9.k kVar) {
        this.f12948a = kVar;
        this.f12949b = "must return ".concat(str);
    }

    @Override // tb.e
    public final String a() {
        return this.f12949b;
    }

    @Override // tb.e
    public final boolean b(ia.e eVar) {
        return i9.l.a(eVar.f478g, this.f12948a.invoke(db.e.e(eVar)));
    }

    @Override // tb.e
    public final String c(ia.e eVar) {
        return n4.h.M(this, eVar);
    }
}
