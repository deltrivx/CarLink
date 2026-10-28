package rb;

import h9.k;
import i9.l;
import nb.w0;
import x9.h;
import x9.q0;
import x9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12308b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12309c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12310a;

    public /* synthetic */ a(int i7) {
        this.f12310a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        w0 w0Var = (w0) obj;
        switch (this.f12310a) {
            case 0:
                l.e(w0Var, "it");
                h hVarL = w0Var.D0().l();
                return Boolean.valueOf(hVarL != null && (hVarL instanceof r0) && (((r0) hVarL).l() instanceof q0));
            default:
                l.e(w0Var, "it");
                h hVarL2 = w0Var.D0().l();
                return Boolean.valueOf(hVarL2 != null && ((hVarL2 instanceof q0) || (hVarL2 instanceof r0)));
        }
    }
}
