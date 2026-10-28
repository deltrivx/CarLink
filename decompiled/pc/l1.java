package pc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f10472a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f10473b = new s0("kotlin.uuid.Uuid", nc.c.k);

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        bc.a aVar = (bc.a) obj;
        i9.l.e(aVar, "value");
        sVar.r(aVar.toString());
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        String strConcat;
        String strL = bVar.l();
        i9.l.e(strL, "uuidString");
        int length = strL.length();
        if (length == 32) {
            long jB = zb.d.b(strL, 0, 16);
            long jB2 = zb.d.b(strL, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new bc.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strL.length() <= 64) {
                    strConcat = strL;
                } else {
                    String strSubstring = strL.substring(0, 64);
                    i9.l.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb2.append(strConcat);
                sb2.append("\" of length ");
                sb2.append(strL.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long jB3 = zb.d.b(strL, 0, 8);
            k9.a.k(8, strL);
            long jB4 = zb.d.b(strL, 9, 13);
            k9.a.k(13, strL);
            long jB5 = zb.d.b(strL, 14, 18);
            k9.a.k(18, strL);
            long jB6 = zb.d.b(strL, 19, 23);
            k9.a.k(23, strL);
            long j5 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = zb.d.b(strL, 24, 36) | (jB6 << 48);
            if (j5 != 0 || jB7 != 0) {
                return new bc.a(j5, jB7);
            }
        }
        return bc.a.f1694c;
    }

    @Override // mc.a
    public final nc.e d() {
        return f10473b;
    }
}
