package q0;

import f1.s;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.p f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1.c f10553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10554d;

    public /* synthetic */ g(r1.p pVar, n1.c cVar, int i7, int i10) {
        this.f10551a = i10;
        this.f10552b = pVar;
        this.f10553c = cVar;
        this.f10554d = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f10551a;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                n4.h.c(this.f10552b, this.f10553c, sVar, f1.b.y(this.f10554d | 1));
                break;
            case 1:
                n4.h.e(this.f10552b, this.f10553c, sVar, f1.b.y(this.f10554d | 1));
                break;
            case 2:
                k.d(this.f10552b, this.f10553c, sVar, f1.b.y(this.f10554d | 1));
                break;
            case 3:
                n3.l.f(this.f10552b, this.f10553c, sVar, f1.b.y(this.f10554d | 1));
                break;
            default:
                n3.l.e(this.f10552b, this.f10553c, sVar, f1.b.y(this.f10554d | 1));
                break;
        }
        return z.f12851a;
    }
}
