package c8;

import b8.m2;
import f1.b1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2545a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f2548d;

    public /* synthetic */ s(h9.k kVar, List list, b1 b1Var) {
        this.f2548d = kVar;
        this.f2546b = list;
        this.f2547c = b1Var;
    }

    public /* synthetic */ s(List list, b1 b1Var, h9.k kVar) {
        this.f2546b = list;
        this.f2547c = b1Var;
        this.f2548d = kVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f2545a) {
            case 0:
                m2 m2Var = (m2) obj;
                i9.l.e(m2Var, "newItem");
                this.f2548d.invoke(u8.p.y0(this.f2546b, m2Var));
                this.f2547c.setValue(Boolean.FALSE);
                break;
            default:
                g0.h hVar = (g0.h) obj;
                i9.l.e(hVar, "$this$LazyVerticalGrid");
                List list = this.f2546b;
                hVar.f5645c.a(list.size(), new g0.f(g0.h.f5643d, new l(1, list), new n1.c(new z(list, this.f2547c, this.f2548d), -1117249557, true)));
                break;
        }
        return t8.z.f12851a;
    }
}
