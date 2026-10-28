package l8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t8.j f8152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.k f8154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8156g;

    public /* synthetic */ g(List list, t8.j jVar, boolean z10, h9.k kVar, int i7, int i10, int i11) {
        this.f8150a = i11;
        this.f8151b = list;
        this.f8152c = jVar;
        this.f8153d = z10;
        this.f8154e = kVar;
        this.f8155f = i7;
        this.f8156g = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8150a) {
            case 0:
                ((Integer) obj2).getClass();
                i2.c.g(this.f8151b, this.f8152c, this.f8153d, this.f8154e, (f1.s) obj, f1.b.y(this.f8155f | 1), this.f8156g);
                break;
            default:
                ((Integer) obj2).getClass();
                g5.a.g(this.f8151b, this.f8152c, this.f8153d, this.f8154e, (f1.s) obj, f1.b.y(this.f8155f | 1), this.f8156g);
                break;
        }
        return t8.z.f12851a;
    }
}
