package oa;

import java.util.Map;
import nb.w;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements y9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9578a = new b();

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
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // y9.b
    public final n0 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // y9.b
    public final w getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
