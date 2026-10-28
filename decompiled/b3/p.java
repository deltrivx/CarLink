package b3;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1421h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public p(r rVar, long j5, int i7, int i10) {
        boolean z10;
        int i11;
        int iG;
        int i12;
        this.f1414a = rVar;
        this.f1415b = i7;
        if (n3.a.j(j5) != 0 || n3.a.i(j5) != 0) {
            h3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) rVar.f1432a;
        int size = arrayList2.size();
        int i13 = 0;
        int i14 = 0;
        float f10 = 0.0f;
        while (true) {
            if (i13 >= size) {
                z10 = false;
                break;
            }
            t tVar = (t) arrayList2.get(i13);
            j3.d dVar = tVar.f1449a;
            int iH = n3.a.h(j5);
            if (n3.a.c(j5)) {
                i11 = i13;
                iG = n3.a.g(j5) - ((int) Math.ceil(f10));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i11 = i13;
                iG = n3.a.g(j5);
            }
            b bVar = new b(dVar, this.f1415b - i14, i10, n3.b.b(iH, iG, 5));
            float fB = bVar.b() + f10;
            c3.n nVar = bVar.f1310d;
            int i15 = i14 + nVar.f2409g;
            arrayList.add(new s(bVar, tVar.f1450b, tVar.f1451c, i14, i15, f10, fB));
            if (!nVar.f2406d) {
                if (i15 == this.f1415b) {
                    i12 = i11;
                    if (i12 != n3.l.A((ArrayList) this.f1414a.f1432a)) {
                    }
                } else {
                    i12 = i11;
                }
                i13 = i12 + 1;
                i14 = i15;
                f10 = fB;
            }
            z10 = true;
            i14 = i15;
            f10 = fB;
            break;
        }
        this.f1418e = f10;
        this.f1419f = i14;
        this.f1416c = z10;
        this.f1421h = arrayList;
        this.f1417d = n3.a.h(j5);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            s sVar = (s) arrayList.get(i16);
            ?? r8 = sVar.f1441a.f1312f;
            ArrayList arrayList4 = new ArrayList(r8.size());
            int size3 = r8.size();
            for (int i17 = 0; i17 < size3; i17++) {
                x1.c cVar = (x1.c) r8.get(i17);
                arrayList4.add(cVar != null ? sVar.a(cVar) : null);
            }
            u8.u.c0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f1414a.f1434c).size()) {
            int size4 = ((List) this.f1414a.f1434c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList5.add(null);
            }
            arrayList3 = u8.p.x0(arrayList5, arrayList3);
        }
        this.f1420g = arrayList3;
    }

    public static void i(p pVar, y1.o oVar, long j5, y1.k0 k0Var, m3.l lVar, a2.h hVar) {
        oVar.h();
        ArrayList arrayList = pVar.f1421h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) arrayList.get(i7);
            sVar.f1441a.f(oVar, j5, k0Var, lVar, hVar);
            oVar.n(0.0f, sVar.f1441a.b());
        }
        oVar.r();
    }

    public static void j(p pVar, y1.o oVar, y1.m mVar, float f10, y1.k0 k0Var, m3.l lVar, a2.h hVar) {
        oVar.h();
        ArrayList arrayList = pVar.f1421h;
        if (arrayList.size() <= 1 || (mVar instanceof y1.n0)) {
            j3.k.a(pVar, oVar, mVar, f10, k0Var, lVar, hVar);
        } else {
            if (!(mVar instanceof y1.j0)) {
                throw new cc.s();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i7 = 0; i7 < size; i7++) {
                s sVar = (s) arrayList.get(i7);
                fB += sVar.f1441a.b();
                fMax = Math.max(fMax, sVar.f1441a.d());
            }
            Shader shaderB = ((y1.j0) mVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                b bVar = ((s) arrayList.get(i10)).f1441a;
                bVar.g(oVar, new y1.n(shaderB), f10, k0Var, lVar, hVar);
                oVar.n(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        oVar.r();
    }

    public final void a(long j5, float[] fArr) {
        k(q0.f(j5));
        l(q0.e(j5));
        i9.v vVar = new i9.v();
        vVar.f6686a = 0;
        g0.g(this.f1421h, j5, new o(j5, fArr, vVar, new i9.u()));
    }

    public final float b(int i7) {
        m(i7);
        ArrayList arrayList = this.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        return bVar.f1310d.e(i7 - sVar.f1444d) + sVar.f1446f;
    }

    public final int c(int i7, boolean z10) {
        int iF;
        m(i7);
        ArrayList arrayList = this.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        int i10 = i7 - sVar.f1444d;
        c3.n nVar = bVar.f1310d;
        if (z10) {
            Layout layout = nVar.f2408f;
            c3.m mVar = c3.o.f2419a;
            if (layout.getEllipsisCount(i10) <= 0 || nVar.f2404b != TextUtils.TruncateAt.END) {
                r rVarC = nVar.c();
                Layout layout2 = (Layout) rVarC.f1433b;
                iF = rVarC.p(layout2.getLineEnd(i10), layout2.getLineStart(i10));
            } else {
                iF = layout.getEllipsisStart(i10) + layout.getLineStart(i10);
            }
        } else {
            iF = nVar.f(i10);
        }
        return iF + sVar.f1442b;
    }

    public final int d(int i7) {
        int iD;
        int length = ((h) this.f1414a.f1433b).f1353b.length();
        ArrayList arrayList = this.f1421h;
        if (i7 >= length) {
            iD = n3.l.A(arrayList);
        } else {
            iD = i7 < 0 ? 0 : g0.d(i7, arrayList);
        }
        s sVar = (s) arrayList.get(iD);
        return sVar.f1441a.f1310d.f2408f.getLineForOffset(sVar.d(i7)) + sVar.f1444d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f1421h;
        s sVar = (s) arrayList.get(g0.f(arrayList, f10));
        int i7 = sVar.f1443c - sVar.f1442b;
        int i10 = sVar.f1444d;
        if (i7 == 0) {
            return i10;
        }
        b bVar = sVar.f1441a;
        float f11 = f10 - sVar.f1446f;
        c3.n nVar = bVar.f1310d;
        return nVar.f2408f.getLineForVertical(((int) f11) - nVar.f2410h) + i10;
    }

    public final float f(int i7) {
        m(i7);
        ArrayList arrayList = this.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        return bVar.f1310d.g(i7 - sVar.f1444d) + sVar.f1446f;
    }

    public final int g(long j5) {
        int i7 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        ArrayList arrayList = this.f1421h;
        s sVar = (s) arrayList.get(g0.f(arrayList, fIntBitsToFloat));
        int i10 = sVar.f1443c;
        int i11 = sVar.f1442b;
        if (i10 - i11 == 0) {
            return i11;
        }
        b bVar = sVar.f1441a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i7) - sVar.f1446f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        c3.n nVar = bVar.f1310d;
        int lineForVertical = nVar.f2408f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - nVar.f2410h);
        return nVar.f2408f.getOffsetForHorizontal(lineForVertical, (nVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i11;
    }

    public final long h(x1.c cVar, int i7, l0 l0Var) {
        long jB;
        long j5;
        float f10 = cVar.f14524b;
        ArrayList arrayList = this.f1421h;
        int iF = g0.f(arrayList, f10);
        float f11 = ((s) arrayList.get(iF)).f1447g;
        float f12 = cVar.f14526d;
        if (f11 >= f12 || iF == n3.l.A(arrayList)) {
            s sVar = (s) arrayList.get(iF);
            return sVar.b(sVar.f1441a.c(sVar.c(cVar), i7, l0Var), true);
        }
        int iF2 = g0.f(arrayList, f12);
        long jB2 = q0.f1428b;
        while (true) {
            jB = q0.f1428b;
            if (!q0.b(jB2, jB) || iF > iF2) {
                break;
            }
            s sVar2 = (s) arrayList.get(iF);
            jB2 = sVar2.b(sVar2.f1441a.c(sVar2.c(cVar), i7, l0Var), true);
            iF++;
        }
        if (q0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j5 = q0.f1428b;
            if (!q0.b(jB, j5) || iF > iF2) {
                break;
            }
            s sVar3 = (s) arrayList.get(iF2);
            jB = sVar3.b(sVar3.f1441a.c(sVar3.c(cVar), i7, l0Var), true);
            iF2--;
        }
        return q0.b(jB, j5) ? jB2 : g0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i7) {
        boolean z10 = false;
        r rVar = this.f1414a;
        if (i7 >= 0 && i7 < ((h) rVar.f1433b).f1353b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbT = ob.a.t("offset(", ") is out of bounds [0, ", i7);
        sbT.append(((h) rVar.f1433b).f1353b.length());
        sbT.append(')');
        h3.a.a(sbT.toString());
    }

    public final void l(int i7) {
        boolean z10 = false;
        r rVar = this.f1414a;
        if (i7 >= 0 && i7 <= ((h) rVar.f1433b).f1353b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbT = ob.a.t("offset(", ") is out of bounds [0, ", i7);
        sbT.append(((h) rVar.f1433b).f1353b.length());
        sbT.append(']');
        h3.a.a(sbT.toString());
    }

    public final void m(int i7) {
        boolean z10 = false;
        int i10 = this.f1419f;
        if (i7 >= 0 && i7 < i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        h3.a.a("lineIndex(" + i7 + ") is out of bounds [0, " + i10 + ')');
    }
}
