package bb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1680b = 1;

    public c(double d10) {
        super(Double.valueOf(d10));
    }

    public c(float f10) {
        super(Float.valueOf(f10));
    }

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        switch (this.f1680b) {
            case 0:
                i9.l.e(yVar, "module");
                u9.i iVarK = yVar.k();
                iVarK.getClass();
                return iVarK.t(u9.k.BOOLEAN);
            case 1:
                i9.l.e(yVar, "module");
                u9.i iVarK2 = yVar.k();
                iVarK2.getClass();
                return iVarK2.t(u9.k.DOUBLE);
            default:
                i9.l.e(yVar, "module");
                u9.i iVarK3 = yVar.k();
                iVarK3.getClass();
                return iVarK3.t(u9.k.FLOAT);
        }
    }

    @Override // bb.g
    public String toString() {
        switch (this.f1680b) {
            case 1:
                return ((Number) this.f1683a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f1683a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }
}
