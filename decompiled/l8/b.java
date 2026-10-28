package l8;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8101a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f8103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8106f;

    public /* synthetic */ b(i9.x xVar, float f10, v.f fVar, v.k kVar, h9.k kVar2) {
        this.f8104d = xVar;
        this.f8102b = f10;
        this.f8105e = fVar;
        this.f8106f = kVar;
        this.f8103c = kVar2;
    }

    public /* synthetic */ b(List list, float f10, j0 j0Var, h9.k kVar, h9.o oVar) {
        this.f8104d = list;
        this.f8102b = f10;
        this.f8105e = j0Var;
        this.f8103c = kVar;
        this.f8106f = oVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f8101a) {
            case 0:
                List list = (List) this.f8104d;
                j0 j0Var = (j0) this.f8105e;
                h9.o oVar = (h9.o) this.f8106f;
                g0.h hVar = (g0.h) obj;
                i9.l.e(hVar, "$this$LazyVerticalGrid");
                hVar.f5645c.a(list.size(), new g0.f(g0.h.f5643d, new c8.l(2, list), new n1.c(new e(list, this.f8102b, j0Var, this.f8103c, oVar), -1117249557, true)));
                break;
            default:
                i9.x xVar = (i9.x) this.f8104d;
                v.f fVar = (v.f) this.f8105e;
                v.k kVar = (v.k) this.f8106f;
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = xVar.f6688a;
                i9.l.b(obj2);
                v.d.h((v.i) obj2, jLongValue, this.f8102b, fVar, kVar, this.f8103c);
                break;
        }
        return t8.z.f12851a;
    }
}
