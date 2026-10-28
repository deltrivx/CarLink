package y2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.n f15079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15080c;

    public u(int i7, String str) {
        this(str);
        this.f15080c = true;
    }

    public /* synthetic */ u(String str) {
        this(str, q.f15047s);
    }

    public u(String str, h9.n nVar) {
        this.f15078a = str;
        this.f15079b = nVar;
    }

    public u(String str, boolean z10, h9.n nVar) {
        this(str, nVar);
        this.f15080c = z10;
    }

    public final void a(j jVar, Object obj) {
        jVar.n(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f15078a;
    }
}
