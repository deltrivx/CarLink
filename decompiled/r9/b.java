package r9;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11651b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11652c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11653d = new b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11654e = new b(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11655f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f11656g = new b(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f11657h = new b(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f11658i = new b(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f11659j = new b(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11660a;

    public /* synthetic */ b(int i7) {
        this.f11660a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11660a) {
            case 0:
                Class cls = (Class) obj;
                android.support.v4.media.session.r rVar = c.f11664a;
                i9.l.e(cls, "it");
                return new a0(cls);
            case 1:
                Class cls2 = (Class) obj;
                android.support.v4.media.session.r rVar2 = c.f11664a;
                i9.l.e(cls2, "it");
                return new s0(cls2);
            case 2:
                Class<?> returnType = ((Method) obj).getReturnType();
                i9.l.d(returnType, "getReturnType(...)");
                return da.d.b(returnType);
            case 3:
                Class cls3 = (Class) obj;
                i9.l.b(cls3);
                return da.d.b(cls3);
            case 4:
                x9.k0 k0Var = (x9.k0) obj;
                zb.i iVar = e0.f11673a;
                i9.l.e(k0Var, "descriptor");
                return ya.g.f15195e.u(k0Var) + " | " + v1.b(k0Var).d();
            case 5:
                x9.t tVar = (x9.t) obj;
                zb.i iVar2 = e0.f11673a;
                i9.l.e(tVar, "descriptor");
                return ya.g.f15195e.u(tVar) + " | " + v1.c(tVar).P();
            case 6:
                ya.g gVar = u1.f11769a;
                nb.w type = ((aa.y0) obj).getType();
                i9.l.d(type, "getType(...)");
                return u1.d(type);
            case 7:
                ya.g gVar2 = u1.f11769a;
                nb.w type2 = ((aa.y0) obj).getType();
                i9.l.d(type2, "getType(...)");
                return u1.d(type2);
            default:
                Class cls4 = (Class) obj;
                i9.l.b(cls4);
                return da.d.b(cls4);
        }
    }
}
