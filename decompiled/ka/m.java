package ka;

import aa.s0;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f7449b = new m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f7450c = new m(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f7451d = new m(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7452e = new m(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f7453f = new m(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7454a;

    public /* synthetic */ m(int i7) {
        this.f7454a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7454a) {
            case 0:
                da.w wVar = (da.w) obj;
                int i7 = o.f7457v;
                i9.l.e(wVar, "it");
                return Boolean.valueOf(!Modifier.isStatic(wVar.b().getModifiers()));
            case 1:
                s0 s0Var = (s0) obj;
                o9.u[] uVarArr = a0.f7389m;
                i9.l.e(s0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return s0Var;
            case 2:
                da.w wVar2 = (da.w) obj;
                int i10 = d0.f7410p;
                i9.l.e(wVar2, "it");
                return Boolean.valueOf(Modifier.isStatic(wVar2.b().getModifiers()));
            case 3:
                gb.o oVar = (gb.o) obj;
                int i11 = d0.f7410p;
                i9.l.e(oVar, "it");
                return oVar.g();
            default:
                int i12 = d0.f7410p;
                x9.h hVarL = ((nb.w) obj).D0().l();
                if (hVarL instanceof x9.e) {
                    return (x9.e) hVarL;
                }
                return null;
        }
    }
}
