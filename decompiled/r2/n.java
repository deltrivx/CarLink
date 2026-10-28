package r2;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f11336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f11337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f11338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f11339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f11340f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11341a;

    static {
        int i7 = 1;
        f11336b = new n(i7, 0);
        f11337c = new n(i7, 1);
        f11338d = new n(i7, 2);
        f11339e = new n(i7, 3);
        f11340f = new n(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i7, int i10) {
        super(i7);
        this.f11341a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11341a) {
            case 0:
                return t8.z.f12851a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                f1.c0 c0Var = n0.f11342a;
                n1.g gVar = (n1.g) ((f1.q1) obj);
                gVar.getClass();
                f1.b.t(gVar, c0Var);
                return ((Context) f1.b.t(gVar, n0.f11343b)).getResources();
            default:
                return Boolean.valueOf(j0.g(obj));
        }
    }
}
