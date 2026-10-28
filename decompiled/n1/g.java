package n1;

import f1.q1;
import f1.t1;
import f1.z2;
import k1.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k1.c implements q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f8712d = new g(m.f7172e, 0);

    @Override // k1.c
    /* JADX INFO: renamed from: a */
    public final k1.e builder() {
        f fVar = new f(this);
        fVar.f8711g = this;
        return fVar;
    }

    @Override // k1.c, i1.d
    public final i1.c builder() {
        f fVar = new f(this);
        fVar.f8711g = this;
        return fVar;
    }

    public final g c(t1 t1Var, z2 z2Var) {
        j.g gVarU = this.f7150a.u(t1Var.hashCode(), 0, t1Var, z2Var);
        return gVarU == null ? this : new g((m) gVarU.f6795c, this.f7151b + gVarU.f6794b);
    }

    @Override // k1.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof t1) {
            return super.containsKey((t1) obj);
        }
        return false;
    }

    @Override // u8.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    @Override // k1.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof t1) {
            return (z2) super.get((t1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof t1) ? obj2 : (z2) super.getOrDefault((t1) obj, (z2) obj2);
    }
}
