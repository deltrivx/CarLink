package h0;

import android.util.DisplayMetrics;
import f1.b1;
import f1.g1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6397a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6401e;

    public /* synthetic */ w(DisplayMetrics displayMetrics, g1 g1Var, b1 b1Var, g1 g1Var2) {
        this.f6398b = displayMetrics;
        this.f6399c = g1Var;
        this.f6400d = b1Var;
        this.f6401e = g1Var2;
    }

    public /* synthetic */ w(h9.a aVar, r1.p pVar, i0 i0Var, f0.m mVar, int i7) {
        this.f6398b = aVar;
        this.f6399c = pVar;
        this.f6400d = i0Var;
        this.f6401e = mVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6397a) {
            case 0:
                ((Integer) obj2).getClass();
                z.a((h9.a) this.f6398b, (r1.p) this.f6399c, (i0) this.f6400d, (f0.m) this.f6401e, (f1.s) obj, f1.b.y(1));
                break;
            default:
                DisplayMetrics displayMetrics = (DisplayMetrics) this.f6398b;
                g1 g1Var = (g1) this.f6399c;
                b1 b1Var = (b1) this.f6400d;
                g1 g1Var2 = (g1) this.f6401e;
                k2.v vVar = (k2.v) obj;
                x1.b bVar = (x1.b) obj2;
                i9.l.e(vVar, "change");
                vVar.a();
                g1Var.g(n3.r.l(Float.intBitsToFloat((int) (bVar.f14521a >> 32)) + g1Var.f(), 0.0f, displayMetrics.widthPixels - ((int) (((n3.m) b1Var.getValue()).f8746a >> 32))));
                g1Var2.g(n3.r.l(Float.intBitsToFloat((int) (bVar.f14521a & 4294967295L)) + g1Var2.f(), 0.0f, displayMetrics.heightPixels - ((int) (((n3.m) b1Var.getValue()).f8746a & 4294967295L))));
                break;
        }
        return t8.z.f12851a;
    }
}
