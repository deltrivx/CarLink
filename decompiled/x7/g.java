package x7;

import f1.s;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14646c;

    public /* synthetic */ g(k kVar, List list, int i7, int i10) {
        this.f14644a = i10;
        this.f14645b = kVar;
        this.f14646c = list;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f14644a;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f14645b.c(this.f14646c, sVar, f1.b.y(49));
                break;
            case 1:
                this.f14645b.a(this.f14646c, sVar, f1.b.y(49));
                break;
            default:
                this.f14645b.b(this.f14646c, sVar, f1.b.y(49));
                break;
        }
        return z.f12851a;
    }
}
