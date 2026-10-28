package o7;

import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f9505c;

    public /* synthetic */ n(j jVar, List list, int i7, int i10) {
        this.f9503a = i10;
        this.f9504b = jVar;
        this.f9505c = list;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9503a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f9504b.g(this.f9505c, sVar, f1.b.y(49));
                break;
            default:
                this.f9504b.h(this.f9505c, sVar, f1.b.y(55));
                break;
        }
        return z.f12851a;
    }
}
