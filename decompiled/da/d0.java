package da;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends s implements na.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f3864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f3865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3867d;

    public d0(b0 b0Var, Annotation[] annotationArr, String str, boolean z10) {
        i9.l.e(annotationArr, "reflectAnnotations");
        this.f3864a = b0Var;
        this.f3865b = annotationArr;
        this.f3866c = str;
        this.f3867d = z10;
    }

    @Override // na.b
    public final e a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        return i2.c.x(this.f3865b, cVar);
    }

    @Override // na.b
    public final Collection getAnnotations() {
        return i2.c.z(this.f3865b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d0.class.getName());
        sb2.append(": ");
        sb2.append(this.f3867d ? "vararg " : "");
        String str = this.f3866c;
        sb2.append(str != null ? wa.e.d(str) : null);
        sb2.append(": ");
        sb2.append(this.f3864a);
        return sb2.toString();
    }
}
