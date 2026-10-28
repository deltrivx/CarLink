package bb;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1686b;

    public j(String str) {
        super(z.f12851a);
        this.f1686b = str;
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        i9.l.e(yVar, "module");
        return pb.l.c(pb.k.ERROR_CONSTANT_VALUE, this.f1686b);
    }

    @Override // bb.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // bb.g
    public final String toString() {
        return this.f1686b;
    }
}
