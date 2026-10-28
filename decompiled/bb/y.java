package bb;

import nb.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1693b = 0;

    public y(byte b10) {
        super(Byte.valueOf(b10));
    }

    public y(int i7) {
        super(Integer.valueOf(i7));
    }

    public y(long j5) {
        super(Long.valueOf(j5));
    }

    public y(short s2) {
        super(Short.valueOf(s2));
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        a0 a0VarN;
        a0 a0VarN2;
        a0 a0VarN3;
        a0 a0VarN4;
        switch (this.f1693b) {
            case 0:
                i9.l.e(yVar, "module");
                x9.e eVarD = x9.v.d(yVar, u9.n.S);
                return (eVarD == null || (a0VarN = eVarD.n()) == null) ? pb.l.c(pb.k.NOT_FOUND_UNSIGNED_TYPE, "UByte") : a0VarN;
            case 1:
                i9.l.e(yVar, "module");
                x9.e eVarD2 = x9.v.d(yVar, u9.n.U);
                return (eVarD2 == null || (a0VarN2 = eVarD2.n()) == null) ? pb.l.c(pb.k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : a0VarN2;
            case 2:
                i9.l.e(yVar, "module");
                x9.e eVarD3 = x9.v.d(yVar, u9.n.V);
                return (eVarD3 == null || (a0VarN3 = eVarD3.n()) == null) ? pb.l.c(pb.k.NOT_FOUND_UNSIGNED_TYPE, "ULong") : a0VarN3;
            default:
                i9.l.e(yVar, "module");
                x9.e eVarD4 = x9.v.d(yVar, u9.n.T);
                return (eVarD4 == null || (a0VarN4 = eVarD4.n()) == null) ? pb.l.c(pb.k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : a0VarN4;
        }
    }

    @Override // bb.g
    public final String toString() {
        switch (this.f1693b) {
            case 0:
                return ((Number) this.f1683a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f1683a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f1683a).longValue() + ".toULong()";
            default:
                return ((Number) this.f1683a).intValue() + ".toUShort()";
        }
    }
}
