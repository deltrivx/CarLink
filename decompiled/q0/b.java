package q0;

import a8.f1;
import i9.x;
import o2.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.e f10533c;

    public /* synthetic */ b(f fVar, s0.e eVar, int i7) {
        this.f10531a = i7;
        this.f10532b = fVar;
        this.f10533c = eVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f10531a) {
            case 0:
                f fVar = this.f10532b;
                a aVar = fVar.f10547f;
                a5.e eVar = new a5.e(21, this.f10533c);
                x xVar = new x();
                fVar.f10546e.c("dataBuilder", aVar, new f1(12, xVar, eVar));
                Object obj = xVar.f6688a;
                if (obj != null) {
                    return (o0.c) obj;
                }
                i9.l.j("result");
                throw null;
            case 1:
                f fVar2 = this.f10532b;
                a aVar2 = fVar2.f10548g;
                b bVar = new b(fVar2, this.f10533c, 2);
                x xVar2 = new x();
                fVar2.f10546e.c("positioner", aVar2, new f1(12, xVar2, bVar));
                Object obj2 = xVar2.f6688a;
                if (obj2 != null) {
                    return (x1.c) obj2;
                }
                i9.l.j("result");
                throw null;
            default:
                w wVar = (w) this.f10532b.f10544c.invoke();
                return this.f10533c.C(wVar).i(wVar.E(0L));
        }
    }
}
