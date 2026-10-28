package gb;

import aa.s0;
import x9.k0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f6192b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6193c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f6194d = new l(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f6195e = new l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6196a;

    public /* synthetic */ l(int i7) {
        this.f6196a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f6196a) {
            case 0:
                i9.l.e((wa.e) obj, "it");
                return Boolean.TRUE;
            case 1:
                s0 s0Var = (s0) obj;
                i9.l.e(s0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return s0Var;
            case 2:
                k0 k0Var = (k0) obj;
                i9.l.e(k0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return k0Var;
            default:
                x9.b bVar = (x9.b) obj;
                i9.l.e(bVar, "$this$selectMostSpecificInEachOverridableGroup");
                return bVar;
        }
    }
}
