package j3;

import android.graphics.Typeface;
import f3.n;
import h9.p;
import o2.w;
import t8.z;
import w0.a0;
import w0.w0;
import w1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6922b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f6921a = i7;
        this.f6922b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        a0 a0Var;
        char c10;
        long jB;
        switch (this.f6921a) {
            case 0:
                d dVar = (d) this.f6922b;
                f3.p pVarB = ((f3.e) dVar.f6927e).b((n) obj, (f3.k) obj2, ((f3.i) obj3).f5255a, ((f3.j) obj4).f5256a);
                if (pVarB instanceof f3.p) {
                    Object obj5 = pVarB.f5270a;
                    i9.l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                a2.b bVar = new a2.b(pVarB, dVar.f6932j);
                dVar.f6932j = bVar;
                Object obj6 = bVar.f14d;
                i9.l.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            default:
                w0 w0Var = (w0) this.f6922b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w wVar = (w) obj2;
                a0 a0Var2 = (a0) obj4;
                long jL = wVar.l();
                float fIntBitsToFloat = (int) (jL >> 32);
                float fIntBitsToFloat2 = (int) (jL & 4294967295L);
                long jFloatToRawIntBits = ((x1.b) obj3).f14521a;
                int i7 = (int) (jFloatToRawIntBits >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (0.0f <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fIntBitsToFloat) {
                    a0Var = a0Var2;
                    c10 = ' ';
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (0.0f > fIntBitsToFloat4 || fIntBitsToFloat4 > fIntBitsToFloat2) {
                    }
                    jB = w0Var.b(wVar, jFloatToRawIntBits);
                    if ((9223372034707292159L & jB) != 9205357640488583168L) {
                        w0Var.l(zBooleanValue);
                        w0Var.f13997t = null;
                        w0Var.o(jB, 9205357640488583168L, false, a0Var);
                        o.b(w0Var.f13986h);
                        w0Var.f14001x = false;
                        w0Var.p();
                        w0Var.f13998u = true;
                    }
                    return z.f12851a;
                }
                a0Var = a0Var2;
                c10 = ' ';
                if (Float.intBitsToFloat(i7) < 0.0f) {
                    fIntBitsToFloat = 0.0f;
                } else if (Float.intBitsToFloat(i7) <= fIntBitsToFloat) {
                    fIntBitsToFloat = Float.intBitsToFloat(i7);
                }
                int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i10) < 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else if (Float.intBitsToFloat(i10) <= fIntBitsToFloat2) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i10);
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c10) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                jB = w0Var.b(wVar, jFloatToRawIntBits);
                if ((9223372034707292159L & jB) != 9205357640488583168L) {
                    w0Var.l(zBooleanValue);
                    w0Var.f13997t = null;
                    w0Var.o(jB, 9205357640488583168L, false, a0Var);
                    o.b(w0Var.f13986h);
                    w0Var.f14001x = false;
                    w0Var.p();
                    w0Var.f13998u = true;
                }
                return z.f12851a;
        }
    }
}
