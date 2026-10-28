package l8;

import f1.w2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8259a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t8.e f8262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8263e;

    public /* synthetic */ v(i9.x xVar, h9.n nVar, float f10, f7.q qVar) {
        this.f8261c = xVar;
        this.f8262d = nVar;
        this.f8260b = f10;
        this.f8263e = qVar;
    }

    public /* synthetic */ v(n9.d dVar, float f10, h9.k kVar, w2 w2Var) {
        this.f8261c = dVar;
        this.f8260b = f10;
        this.f8262d = kVar;
        this.f8263e = w2Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f8259a) {
            case 0:
                n9.d dVar = (n9.d) this.f8261c;
                h9.k kVar = (h9.k) this.f8262d;
                w2 w2Var = (w2) this.f8263e;
                f0.g gVar = (f0.g) obj;
                i9.l.e(gVar, "$this$LazyColumn");
                List listJ0 = u8.p.J0(dVar);
                gVar.f4770b.a(listJ0.size(), new f0.f(new c8.l(3, listJ0), new n1.c(new x(listJ0, this.f8260b, kVar, w2Var), 802480018, true)));
                break;
            default:
                i9.x xVar = (i9.x) this.f8261c;
                h9.n nVar = (h9.n) this.f8262d;
                f7.q qVar = (f7.q) this.f8263e;
                n3.m mVar = (n3.m) obj;
                long j5 = mVar.f8746a;
                if (((int) (j5 >> 32)) != 0 && ((int) (j5 & 4294967295L)) != 0) {
                    y1.f fVarF = y1.h0.f((int) (j5 >> 32), (int) (j5 & 4294967295L), 0);
                    y1.b bVarA = y1.h0.a(fVarF);
                    nVar.invoke(bVarA, mVar);
                    m5.j.b(bVarA, mVar.f8746a, this.f8260b, qVar);
                    xVar.f6688a = fVarF;
                }
                break;
        }
        return t8.z.f12851a;
    }
}
