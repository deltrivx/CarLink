package pb;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import n3.r;
import nb.k0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f10415a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f10416b = e.f10367a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10417c = new a(wa.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f10418d = c(k.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f10419e = c(k.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f10420f = r.W(new f());

    public static final g a(h hVar, boolean z10, String... strArr) {
        i9.l.e(strArr, "formatParams");
        if (!z10) {
            return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        i9.l.e(strArr2, "formatParams");
        return new m(hVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kVar, String... strArr) {
        i9.l.e(kVar, "kind");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        i9.l.e(strArr2, "formatParams");
        return e(kVar, w.f13122a, d(kVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static j d(k kVar, String... strArr) {
        i9.l.e(kVar, "kind");
        i9.l.e(strArr, "formatParams");
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static i e(k kVar, List list, k0 k0Var, String... strArr) {
        i9.l.e(kVar, "kind");
        i9.l.e(strArr, "formatParams");
        return new i(k0Var, b(h.ERROR_TYPE_SCOPE, k0Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(x9.k kVar) {
        if (kVar != null) {
            return (kVar instanceof a) || (kVar.l() instanceof a) || kVar == f10416b;
        }
        return false;
    }
}
