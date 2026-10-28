package l0;

import android.graphics.Paint;
import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7616f;

    public /* synthetic */ c1(g3.w wVar, u0.b bVar, g3.k kVar, a8.u0 u0Var, h9.k kVar2) {
        this.f7611a = 2;
        this.f7614d = wVar;
        this.f7612b = bVar;
        this.f7613c = kVar;
        this.f7615e = u0Var;
        this.f7616f = kVar2;
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f7611a = i7;
        this.f7612b = obj;
        this.f7613c = obj2;
        this.f7614d = obj3;
        this.f7615e = obj4;
        this.f7616f = obj5;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f7611a;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f7616f;
        Object obj3 = this.f7615e;
        Object obj4 = this.f7614d;
        Object obj5 = this.f7613c;
        Object obj6 = this.f7612b;
        switch (i7) {
            case 0:
                g3.q qVar = (g3.q) obj5;
                g3.w wVar = (g3.w) obj4;
                u0 u0Var = (u0) obj3;
                y1.n0 n0Var = (y1.n0) obj2;
                q2.j0 j0Var = (q2.j0) obj;
                j0Var.b();
                a2.c cVar = j0Var.f10720a;
                float f10 = ((u0.g) obj6).f12985c.f();
                if (f10 != 0.0f) {
                    long j5 = wVar.f5890b;
                    int i10 = b3.q0.f1429c;
                    int iB = qVar.b((int) (j5 >> 32));
                    s1 s1VarD = u0Var.d();
                    x1.c cVarC = s1VarD != null ? s1VarD.f7828a.c(iB) : new x1.c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(j0Var.R(d1.f7626a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f11 = fFloor / 2;
                    float f12 = cVarC.f14523a + f11;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f16b.J() >> 32)) - f11;
                    if (f12 > fIntBitsToFloat) {
                        f12 = fIntBitsToFloat;
                    }
                    if (f12 >= f11) {
                        f11 = f12;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f14524b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f14526d)) & 4294967295L);
                    y1.o oVar = cVar.f15a.f8c;
                    f7.q qVarH = cVar.f18d;
                    if (qVarH == null) {
                        qVarH = y1.h0.h();
                        qVarH.r(1);
                        cVar.f18d = qVarH;
                    }
                    Paint paint = (Paint) qVarH.f5447c;
                    n0Var.a(f10, cVar.f16b.J(), qVarH);
                    if (!i9.l.a((y1.k) qVarH.f5449e, null)) {
                        qVarH.l(null);
                    }
                    if (qVarH.f5446b != 3) {
                        qVarH.j(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        qVarH.q(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (qVarH.e() != 0) {
                        qVarH.o(0);
                    }
                    if (qVarH.f() != 0) {
                        qVarH.p(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        qVarH.m(1);
                    }
                    oVar.a(jFloatToRawIntBits, jFloatToRawIntBits2, qVarH);
                }
                return zVar;
            case 1:
                f1.h1 h1Var = (f1.h1) obj4;
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "it");
                h1Var.g(j0Var2.f8197b.a());
                t8.o oVar2 = n8.d.f8898a;
                n8.d.f(h1Var.f(), (String) ((t8.j) obj6).f12830a);
                Boolean bool = (Boolean) ((f1.b1) obj3).getValue();
                bool.booleanValue();
                Integer numValueOf = Integer.valueOf(h1Var.f());
                Boolean bool2 = (Boolean) ((f1.b1) obj2).getValue();
                bool2.booleanValue();
                ((h9.o) obj5).invoke(bool, numValueOf, bool2);
                return zVar;
            case 2:
                u0.p pVar = (u0.p) obj;
                u0.l lVar = ((u0.b) obj6).f12967a;
                pVar.f13021h = (g3.w) obj4;
                pVar.f13022i = (g3.k) obj5;
                pVar.f13016c = (a8.u0) obj3;
                pVar.f13017d = (h9.k) obj2;
                pVar.f13018e = lVar != null ? lVar.f12993p : null;
                pVar.f13019f = lVar != null ? lVar.f12994q : null;
                pVar.f13020g = lVar != null ? (r2) q2.f.i(lVar, r2.j1.f11286s) : null;
                return zVar;
            default:
                z.w0 w0Var = (z.w0) obj6;
                i9.x xVar = (i9.x) obj5;
                i9.u uVar = (i9.u) obj4;
                z.t1 t1Var = (z.t1) obj3;
                i9.t tVar = (i9.t) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                z.q0 q0VarF = z.w0.f((ec.h) w0Var.f15577f);
                if (q0VarF != null) {
                    w0Var.g(q0VarF);
                    z.q0 q0VarA = ((z.q0) xVar.f6688a).a(q0VarF);
                    xVar.f6688a = q0VarA;
                    float fG = t1Var.g(t1Var.e(q0VarA.f15457a));
                    uVar.f6685a = fG;
                    tVar.f6684a = !z.p0.a(fG - fFloatValue);
                }
                return Boolean.valueOf(q0VarF != null);
        }
    }
}
