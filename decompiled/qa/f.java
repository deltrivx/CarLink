package qa;

import ga.y;
import java.security.AccessControlException;
import java.util.HashMap;
import n3.u;
import pa.l;
import pa.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f11012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f11013j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f11017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f11018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f11019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f11020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f11021h;

    static {
        try {
            f11012i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f11012i = false;
        }
        HashMap map = new HashMap();
        f11013j = map;
        map.put(u.L(new wa.c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        map.put(u.L(new wa.c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        map.put(u.L(new wa.c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        map.put(u.L(new wa.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        map.put(u.L(new wa.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }

    @Override // pa.n
    public final l l(wa.b bVar, ca.a aVar) {
        a aVar2;
        wa.c cVarA = bVar.a();
        if (cVarA.equals(y.f6126a)) {
            return new d(this, 0);
        }
        if (cVarA.equals(y.f6139o)) {
            return new d(this, 1);
        }
        if (f11012i || this.f11020g != null || (aVar2 = (a) f11013j.get(bVar)) == null) {
            return null;
        }
        this.f11020g = aVar2;
        return new d(this, 2);
    }
}
