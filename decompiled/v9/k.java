package v9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.c f13701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13702b;

    public k(String str, wa.c cVar) {
        i9.l.e(cVar, "packageFqName");
        this.f13701a = cVar;
        this.f13702b = str;
    }

    public final wa.e a(int i7) {
        return wa.e.e(this.f13702b + i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13701a);
        sb2.append('.');
        return a2.f.I(sb2, this.f13702b, 'N');
    }
}
