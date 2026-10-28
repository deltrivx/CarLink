package x9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f14735b = new q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f14736c = new q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f14737d = new q(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f14738e = new q(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14739a;

    public /* synthetic */ q(int i7) {
        this.f14739a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14739a) {
            case 0:
                i9.l.e((wa.b) obj, "it");
                return 0;
            case 1:
                d0 d0Var = (d0) obj;
                i9.l.e(d0Var, "it");
                return ((aa.j0) d0Var).f364e;
            case 2:
                k kVar = (k) obj;
                i9.l.e(kVar, "it");
                return Boolean.valueOf(!(kVar instanceof j));
            default:
                k kVar2 = (k) obj;
                i9.l.e(kVar2, "it");
                List typeParameters = ((b) kVar2).getTypeParameters();
                i9.l.d(typeParameters, "getTypeParameters(...)");
                return u8.p.f0(typeParameters);
        }
    }
}
