package ya;

import o9.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15216b;

    public j(Object obj, k kVar) {
        this.f15216b = kVar;
        this.f15215a = obj;
    }

    public final Object a(Object obj, u uVar) {
        i9.l.e(uVar, "property");
        return this.f15215a;
    }

    public final void b(Object obj, u uVar) {
        i9.l.e(uVar, "property");
        if (this.f15216b.f15217a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f15215a = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f15215a + ')';
    }
}
