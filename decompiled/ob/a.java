package ob;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import i9.z;
import java.util.concurrent.ExecutorService;
import o2.l0;
import o2.v;
import q2.d1;
import q2.h0;
import q2.j1;
import q2.k1;
import q2.x;
import y1.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean A(Object obj) {
        return obj != null;
    }

    public static String B(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String D(int i7) {
        if (i7 == 1) {
            return "DECLARATION";
        }
        if (i7 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i7 != 3) {
            return i7 != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static /* synthetic */ int E(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("PUT")) {
            return 2;
        }
        if (str.equals("POST")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("HEAD")) {
            return 5;
        }
        if (str.equals("OPTIONS")) {
            return 6;
        }
        if (str.equals("TRACE")) {
            return 7;
        }
        if (str.equals("CONNECT")) {
            return 8;
        }
        if (str.equals("PATCH")) {
            return 9;
        }
        if (str.equals("PROPFIND")) {
            return 10;
        }
        if (str.equals("PROPPATCH")) {
            return 11;
        }
        if (str.equals("MKCOL")) {
            return 12;
        }
        if (str.equals("MOVE")) {
            return 13;
        }
        if (str.equals("COPY")) {
            return 14;
        }
        if (str.equals("LOCK")) {
            return 15;
        }
        if (str.equals("UNLOCK")) {
            return 16;
        }
        throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p2.d, q2.l] */
    public static Object a(p2.d dVar, p2.f fVar) {
        d1 d1Var;
        r1.o oVar = (r1.o) dVar;
        if (!oVar.f11117a.f11129n) {
            n2.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar2 = oVar.f11117a.f11121e;
        h0 h0VarV = q2.f.v(dVar);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 32) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f11119c & 32) != 0) {
                        ?? F = oVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof p2.d) {
                                p2.d dVar2 = (p2.d) F;
                                if (dVar2.N().s(fVar)) {
                                    return dVar2.N().v(fVar);
                                }
                            } else if ((F.f11119c & 32) != 0 && (F instanceof q2.m)) {
                                r1.o oVar3 = ((q2.m) F).f10746p;
                                int i7 = 0;
                                F = F;
                                eVar = eVar;
                                while (oVar3 != null) {
                                    if ((oVar3.f11119c & 32) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            eVar = eVar;
                                            F = oVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar.b(F);
                                                F = 0;
                                            }
                                            eVar.b(oVar3);
                                        }
                                    }
                                    oVar3 = oVar3.f11122f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F = q2.f.f(eVar);
                        }
                    }
                    oVar2 = oVar2.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
        return fVar.f10123a.invoke();
    }

    public static boolean b(v.f fVar, long j5) {
        return j5 >= fVar.b();
    }

    public static int c(x xVar, o2.r rVar, l0 l0Var, int i7) {
        return xVar.b(new v(rVar, rVar.getLayoutDirection()), new o2.k(l0Var, j1.f10723b, k1.f10727b, 2), n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int d(x xVar, o2.r rVar, l0 l0Var, int i7) {
        return xVar.b(new v(rVar, rVar.getLayoutDirection()), new o2.k(l0Var, j1.f10723b, k1.f10726a, 2), n3.b.b(0, i7, 7)).getWidth();
    }

    public static int e(x xVar, o2.r rVar, l0 l0Var, int i7) {
        return xVar.b(new v(rVar, rVar.getLayoutDirection()), new o2.k(l0Var, j1.f10722a, k1.f10727b, 2), n3.b.b(i7, 0, 13)).getHeight();
    }

    public static int f(x xVar, o2.r rVar, l0 l0Var, int i7) {
        return xVar.b(new v(rVar, rVar.getLayoutDirection()), new o2.k(l0Var, j1.f10722a, k1.f10726a, 2), n3.b.b(0, i7, 7)).getWidth();
    }

    public static r1.p g(r1.p pVar, r1.p pVar2) {
        return pVar2 == r1.m.f11116a ? pVar : new r1.j(pVar, pVar2);
    }

    public static int h(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return E(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static void i(e0 e0Var, x1.d dVar) {
        y1.h hVar = (y1.h) e0Var;
        if (hVar.f14896b == null) {
            hVar.f14896b = new RectF();
        }
        RectF rectF = hVar.f14896b;
        i9.l.b(rectF);
        float f10 = dVar.f14527a;
        long j5 = dVar.f14534h;
        long j10 = dVar.f14533g;
        long j11 = dVar.f14532f;
        long j12 = dVar.f14531e;
        rectF.set(f10, dVar.f14528b, dVar.f14529c, dVar.f14530d);
        if (hVar.f14897c == null) {
            hVar.f14897c = new float[8];
        }
        float[] fArr = hVar.f14897c;
        i9.l.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        Path path = hVar.f14895a;
        RectF rectF2 = hVar.f14896b;
        i9.l.b(rectF2);
        float[] fArr2 = hVar.f14897c;
        i9.l.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static int j(float f10, int i7, int i10) {
        return (Float.floatToIntBits(f10) + i7) * i10;
    }

    public static int k(int i7, int i10, long j5) {
        return (t8.u.a(j5) + i7) * i10;
    }

    public static int l(String str, int i7, int i10) {
        return (str.hashCode() + i7) * i10;
    }

    public static b0.k m(f1.s sVar) {
        b0.k kVar = new b0.k();
        sVar.h0(kVar);
        return kVar;
    }

    public static cc.s n(Object obj) {
        t8.a.e(obj);
        return new cc.s();
    }

    public static cc.s o(String str) {
        n2.a.c(str);
        return new cc.s();
    }

    public static String p(z zVar, Class cls, StringBuilder sb2) {
        sb2.append(zVar.b(cls));
        return sb2.toString();
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder t(String str, String str2, int i7) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static o9.k u(Class cls, String str, String str2, int i7, z zVar) {
        return zVar.e(new i9.o(cls, str, str2, i7));
    }

    public static o9.t v(Class cls, String str, String str2, int i7, z zVar) {
        return zVar.g(new i9.r(cls, str, str2, i7));
    }

    public static void w(int i7, f1.s sVar, int i10, q2.h hVar) {
        sVar.h0(Integer.valueOf(i7));
        sVar.b(hVar, Integer.valueOf(i10));
    }

    public static void x(long j5, StringBuilder sb2, String str) {
        sb2.append((Object) y1.q.i(j5));
        sb2.append(str);
    }

    public static void y(a2.b bVar, long j5) {
        bVar.z().r();
        bVar.b0(j5);
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            a4.h.w((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }
}
