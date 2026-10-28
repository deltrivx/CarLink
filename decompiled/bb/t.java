package bb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends o {
    public t(long j5) {
        super(Long.valueOf(j5));
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        i9.l.e(yVar, "module");
        u9.i iVarK = yVar.k();
        iVarK.getClass();
        return iVarK.t(u9.k.LONG);
    }

    @Override // bb.g
    public final String toString() {
        return ((Number) this.f1683a).longValue() + ".toLong()";
    }
}
