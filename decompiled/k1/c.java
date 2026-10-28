package k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class c extends u8.f implements i1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f7149c = new c(m.f7172e, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7151b;

    public c(m mVar, int i7) {
        this.f7150a = mVar;
        this.f7151b = i7;
    }

    @Override // i1.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, l1.a aVar) {
        j.g gVarU = this.f7150a.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return gVarU == null ? this : new c((m) gVarU.f6795c, this.f7151b + gVarU.f6794b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f7150a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f7150a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
