package l0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7603c;

    public /* synthetic */ b(int i7, int i10, Object obj) {
        this.f7601a = i10;
        this.f7603c = obj;
        this.f7602b = i7;
    }

    public /* synthetic */ b(r1.p pVar, int i7, int i10) {
        this.f7601a = 0;
        this.f7603c = pVar;
        this.f7602b = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7601a) {
            case 0:
                ((Integer) obj2).getClass();
                f.b((r1.p) this.f7603c, (f1.s) obj, f1.b.y(1), this.f7602b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                i2.c.p((String) this.f7603c, (f1.s) obj, f1.b.y(this.f7602b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                i2.c.j((List) this.f7603c, (f1.s) obj, f1.b.y(this.f7602b | 1));
                break;
        }
        return t8.z.f12851a;
    }
}
