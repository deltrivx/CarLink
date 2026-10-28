package qc;

import pc.m0;
import pc.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pc.x f11042a = m0.a("kotlinx.serialization.json.JsonUnquotedLiteral", x0.f10518a);

    public static final y a(j jVar) {
        y yVar = jVar instanceof y ? (y) jVar : null;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException("Element " + i9.y.f6689a.b(jVar.getClass()) + " is not a JsonPrimitive");
    }

    public static final long b(y yVar) {
        String strC = yVar.c();
        ja.e eVar = new ja.e(strC);
        long jI = eVar.i();
        if (eVar.f() == 10) {
            return jI;
        }
        int i7 = eVar.f6996b;
        int i10 = i7 - 1;
        ja.e.n(eVar, a2.f.G("Expected input to contain a single valid number, but got '", (i7 == strC.length() || i10 < 0) ? "EOF" : String.valueOf(strC.charAt(i10)), "' after it"), i10, null, 4);
        throw null;
    }
}
