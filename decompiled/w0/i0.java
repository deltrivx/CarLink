package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements q, i9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.a f13808a;

    public i0(h9.a aVar) {
        this.f13808a = aVar;
    }

    @Override // w0.q
    public final /* synthetic */ long a() {
        return ((x1.b) this.f13808a.invoke()).f14521a;
    }

    @Override // i9.h
    public final t8.e b() {
        return this.f13808a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q) || !(obj instanceof i9.h)) {
            return false;
        }
        return i9.l.a(this.f13808a, ((i9.h) obj).b());
    }

    public final int hashCode() {
        return this.f13808a.hashCode();
    }
}
