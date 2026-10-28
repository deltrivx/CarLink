package l8;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h9.k f8225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Serializable f8228i;

    public /* synthetic */ o(List list, List list2, Serializable serializable, boolean z10, boolean z11, h9.k kVar, int i7, int i10, int i11) {
        this.f8220a = i11;
        this.f8221b = list;
        this.f8222c = list2;
        this.f8228i = serializable;
        this.f8223d = z10;
        this.f8224e = z11;
        this.f8225f = kVar;
        this.f8226g = i7;
        this.f8227h = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8220a) {
            case 0:
                ((Integer) obj2).getClass();
                k9.a.c(this.f8221b, this.f8222c, (String) this.f8228i, this.f8223d, this.f8224e, this.f8225f, (f1.s) obj, f1.b.y(this.f8226g | 1), this.f8227h);
                break;
            default:
                ((Integer) obj2).getClass();
                k9.a.f(this.f8221b, this.f8222c, (t8.j) this.f8228i, this.f8223d, this.f8224e, this.f8225f, (f1.s) obj, f1.b.y(this.f8226g | 1), this.f8227h);
                break;
        }
        return t8.z.f12851a;
    }
}
