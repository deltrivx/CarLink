package f0;

import f1.u1;
import l0.q0;
import t8.z;
import v.s0;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4774d;

    public /* synthetic */ h(int i7, int i10, Object obj, Object obj2) {
        this.f4771a = i10;
        this.f4773c = obj;
        this.f4774d = obj2;
        this.f4772b = i7;
    }

    public /* synthetic */ h(h0.v vVar, int i7, Object obj, int i10, int i11) {
        this.f4771a = i11;
        this.f4773c = vVar;
        this.f4772b = i7;
        this.f4774d = obj;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4771a) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = f1.b.y(1);
                ((j) this.f4773c).e(this.f4772b, this.f4774d, (f1.s) obj, iY);
                break;
            case 1:
                ((Integer) obj2).intValue();
                f1.b.a((u1) this.f4773c, (h9.n) this.f4774d, (f1.s) obj, f1.b.y(this.f4772b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                f1.b.b((u1[]) this.f4773c, (h9.n) this.f4774d, (f1.s) obj, f1.b.y(this.f4772b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iY2 = f1.b.y(1);
                ((g0.i) this.f4773c).e(this.f4772b, this.f4774d, (f1.s) obj, iY2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                q0.d((t1) this.f4773c, (n1.c) this.f4774d, (f1.s) obj, f1.b.y(this.f4772b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                i2.c.o((String) this.f4773c, (h9.a) this.f4774d, (f1.s) obj, f1.b.y(this.f4772b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iY3 = f1.b.y(this.f4772b) | 1;
                ((n1.c) this.f4773c).f(this.f4774d, (f1.s) obj, iY3);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((s0) this.f4773c).a((Enum) this.f4774d, (f1.s) obj, f1.b.y(this.f4772b | 1));
                break;
            default:
                r1.p pVar = (r1.p) this.f4773c;
                h9.k kVar = (h9.k) this.f4774d;
                ((Integer) obj2).getClass();
                n3.u.a(f1.b.y(this.f4772b | 1), (f1.s) obj, kVar, pVar);
                break;
        }
        return z.f12851a;
    }
}
