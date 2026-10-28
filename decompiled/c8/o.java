package c8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2523a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f2525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2529g;

    public /* synthetic */ o(f0 f0Var, List list, boolean z10, h9.a aVar, h9.k kVar, int i7) {
        this.f2527e = f0Var;
        this.f2528f = list;
        this.f2524b = z10;
        this.f2525c = aVar;
        this.f2529g = kVar;
        this.f2526d = i7;
    }

    public /* synthetic */ o(o7.g gVar, boolean z10, h9.a aVar, String str, h9.n nVar, int i7) {
        this.f2527e = gVar;
        this.f2524b = z10;
        this.f2525c = aVar;
        this.f2528f = str;
        this.f2529g = nVar;
        this.f2526d = i7;
    }

    public /* synthetic */ o(w7.f fVar, boolean z10, String str, String str2, h9.a aVar, int i7) {
        this.f2527e = fVar;
        this.f2524b = z10;
        this.f2528f = str;
        this.f2529g = str2;
        this.f2525c = aVar;
        this.f2526d = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2523a) {
            case 0:
                ((Integer) obj2).getClass();
                ((f0) this.f2527e).b((List) this.f2528f, this.f2524b, this.f2525c, (h9.k) this.f2529g, (f1.s) obj, f1.b.y(this.f2526d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((o7.g) this.f2527e).a(this.f2524b, this.f2525c, (String) this.f2528f, (h9.n) this.f2529g, (f1.s) obj, f1.b.y(this.f2526d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((w7.f) this.f2527e).c(this.f2524b, (String) this.f2528f, (String) this.f2529g, this.f2525c, (f1.s) obj, f1.b.y(this.f2526d | 1));
                break;
        }
        return t8.z.f12851a;
    }
}
