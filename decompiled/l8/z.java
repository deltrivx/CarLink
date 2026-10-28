package l8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8279g;

    public /* synthetic */ z(Object obj, Object obj2, boolean z10, h9.a aVar, int i7, int i10, int i11) {
        this.f8273a = i11;
        this.f8277e = obj;
        this.f8278f = obj2;
        this.f8274b = z10;
        this.f8279g = aVar;
        this.f8275c = i7;
        this.f8276d = i10;
    }

    public /* synthetic */ z(List list, String str, boolean z10, int i7, h9.k kVar, int i10) {
        this.f8273a = 1;
        this.f8277e = list;
        this.f8278f = str;
        this.f8274b = z10;
        this.f8275c = i7;
        this.f8279g = kVar;
        this.f8276d = i10;
    }

    public /* synthetic */ z(w7.f fVar, List list, List list2, boolean z10, int i7, int i10) {
        this.f8273a = 3;
        this.f8277e = fVar;
        this.f8278f = list;
        this.f8279g = list2;
        this.f8274b = z10;
        this.f8275c = i7;
        this.f8276d = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8273a) {
            case 0:
                ((Integer) obj2).getClass();
                a.a.h((h9.n) this.f8277e, (h9.n) this.f8278f, this.f8274b, (h9.a) this.f8279g, (f1.s) obj, f1.b.y(this.f8275c | 1), this.f8276d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                g5.a.e((List) this.f8277e, (String) this.f8278f, this.f8274b, this.f8275c, (h9.k) this.f8279g, (f1.s) obj, f1.b.y(this.f8276d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((w7.f) this.f8277e).b((List) this.f8278f, this.f8274b, (h9.a) this.f8279g, (f1.s) obj, f1.b.y(this.f8275c | 1), this.f8276d);
                break;
            default:
                ((Integer) obj2).getClass();
                ((w7.f) this.f8277e).f((List) this.f8278f, (List) this.f8279g, this.f8274b, (f1.s) obj, f1.b.y(this.f8275c | 1), this.f8276d);
                break;
        }
        return t8.z.f12851a;
    }
}
