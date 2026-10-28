package p2;

import f1.k1;
import n3.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f10124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f10125c = f1.b.s(null);

    public g(f fVar) {
        this.f10124b = fVar;
    }

    @Override // n3.l
    public final boolean s(f fVar) {
        return fVar == this.f10124b;
    }

    @Override // n3.l
    public final Object v(f fVar) {
        if (fVar != this.f10124b) {
            n2.a.b("Check failed.");
        }
        Object value = this.f10125c.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
