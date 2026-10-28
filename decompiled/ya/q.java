package ya;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override // ya.s
    public final String a(String str) {
        i9.l.e(str, "string");
        return zb.q.n0(zb.q.n0(str, "<", "&lt;"), ">", "&gt;");
    }
}
