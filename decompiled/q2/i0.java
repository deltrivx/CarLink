package q2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2.v0 f10710a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f10715f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10717h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10711b = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f10716g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public i0(a aVar, int i7) {
        this.f10717h = i7;
        this.f10710a = (o2.v0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [h9.n, i9.j] */
    /* JADX WARN: Type inference failed for: r3v6, types: [o2.v0, q2.a] */
    public static final void a(i0 i0Var, o2.m mVar, int i7, h1 h1Var) {
        HashMap map = i0Var.f10716g;
        float f10 = i7;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f10)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f10)) & 4294967295L;
        while (true) {
            long jN = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (i0Var.f10717h) {
                    case 0:
                        p1 p1Var = h1Var.I;
                        if (p1Var != null) {
                            jN = p1Var.g(jN, false);
                        }
                        jN = o9.e0.N(jN, h1Var.f10703z);
                        break;
                    default:
                        q0 q0VarE0 = h1Var.E0();
                        i9.l.b(q0VarE0);
                        long j5 = q0VarE0.f10780p;
                        jN = x1.b.h((((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32), jN);
                        break;
                }
                h1Var = h1Var.f10694q;
                i9.l.b(h1Var);
                if (h1Var.equals(i0Var.f10710a.f())) {
                    int iRound = Math.round(mVar instanceof o2.m ? Float.intBitsToFloat((int) (jN & 4294967295L)) : Float.intBitsToFloat((int) (jN >> 32)));
                    if (map.containsKey(mVar)) {
                        int iIntValue = ((Number) u8.b0.V0(mVar, map)).intValue();
                        o2.m mVar2 = o2.c.f9302a;
                        iRound = ((Number) mVar.f9380a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(mVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!i0Var.b(h1Var).containsKey(mVar));
            float fC = i0Var.c(h1Var, mVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(h1 h1Var) {
        switch (this.f10717h) {
            case 0:
                return h1Var.o0().b();
            default:
                q0 q0VarE0 = h1Var.E0();
                i9.l.b(q0VarE0);
                return q0VarE0.o0().b();
        }
    }

    public final int c(h1 h1Var, o2.m mVar) {
        switch (this.f10717h) {
            case 0:
                return h1Var.j0(mVar);
            default:
                q0 q0VarE0 = h1Var.E0();
                i9.l.b(q0VarE0);
                return q0VarE0.j0(mVar);
        }
    }

    public final boolean d() {
        return this.f10712c || this.f10713d || this.f10714e;
    }

    public final boolean e() {
        h();
        return this.f10715f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o2.v0, q2.a] */
    public final void f() {
        this.f10711b = true;
        ?? r8 = this.f10710a;
        a aVarJ = r8.j();
        if (aVarJ == null) {
            return;
        }
        if (this.f10712c) {
            aVarJ.requestLayout();
        }
        if (this.f10713d) {
            r8.G();
        }
        if (this.f10714e) {
            r8.requestLayout();
        }
        aVarJ.b().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o2.v0, q2.a] */
    public final void g() {
        HashMap map = this.f10716g;
        map.clear();
        b2.a aVar = new b2.a(3, this);
        ?? r8 = this.f10710a;
        r8.D(aVar);
        map.putAll(b(r8.f()));
        this.f10711b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o2.v0, q2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q2.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        a aVar;
        i0 i0VarB;
        i0 i0VarB2;
        boolean zD = d();
        ?? r8 = this.f10710a;
        ?? r10 = r8;
        if (!zD) {
            a aVarJ = r8.j();
            if (aVarJ == null) {
                return;
            }
            aVar = aVarJ.b().f10715f;
            if (aVar == null || !aVar.b().d()) {
                r10 = aVar;
                a aVar2 = this.f10715f;
                if (aVar2 == null || aVar2.b().d()) {
                    return;
                }
                a aVarJ2 = aVar2.j();
                if (aVarJ2 != null && (i0VarB2 = aVarJ2.b()) != null) {
                    i0VarB2.h();
                }
                a aVarJ3 = aVar2.j();
                r10 = (aVarJ3 == null || (i0VarB = aVarJ3.b()) == null) ? 0 : i0VarB.f10715f;
            }
        }
        r10 = aVar;
        this.f10715f = r10;
    }
}
