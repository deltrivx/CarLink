package y9;

import java.util.Map;
import nb.a0;
import nb.w;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f15113c;

    public c(a0 a0Var, Map map, n0 n0Var) {
        if (a0Var == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.f15111a = a0Var;
        this.f15112b = map;
        this.f15113c = n0Var;
    }

    public static /* synthetic */ void c(int i7) {
        String str = (i7 == 3 || i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "valueArguments";
        } else if (i7 == 2) {
            objArr[0] = "source";
        } else if (i7 == 3 || i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i7 == 3) {
            objArr[1] = "getType";
        } else if (i7 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // y9.b
    public final wa.c a() {
        x9.e eVarD = db.e.d(this);
        if (eVarD != null) {
            if (pb.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return db.e.c(eVarD);
            }
        }
        return null;
    }

    @Override // y9.b
    public final Map b() {
        Map map = this.f15112b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // y9.b
    public final n0 getSource() {
        n0 n0Var = this.f15113c;
        if (n0Var != null) {
            return n0Var;
        }
        c(5);
        throw null;
    }

    @Override // y9.b
    public final w getType() {
        w wVar = this.f15111a;
        if (wVar != null) {
            return wVar;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return ya.g.f15193c.v(this, null);
    }
}
