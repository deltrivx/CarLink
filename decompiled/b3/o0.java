package b3;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f1408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1413f;

    public o0(n0 n0Var, p pVar, long j5) {
        this.f1408a = n0Var;
        this.f1409b = pVar;
        this.f1410c = j5;
        ArrayList arrayList = pVar.f1421h;
        float fD = 0.0f;
        this.f1411d = arrayList.isEmpty() ? 0.0f : ((s) arrayList.get(0)).f1441a.f1310d.d(0);
        if (!arrayList.isEmpty()) {
            s sVar = (s) u8.p.s0(arrayList);
            c3.n nVar = sVar.f1441a.f1310d;
            fD = nVar.d(nVar.f2409g - 1) + sVar.f1446f;
        }
        this.f1412e = fD;
        this.f1413f = pVar.f1420g;
    }

    public final m3.j a(int i7) {
        p pVar = this.f1409b;
        ArrayList arrayList = pVar.f1421h;
        pVar.l(i7);
        s sVar = (s) arrayList.get(i7 == ((h) pVar.f1414a.f1433b).f1353b.length() ? n3.l.A(arrayList) : g0.d(i7, arrayList));
        return sVar.f1441a.f1310d.f2408f.isRtlCharAt(sVar.d(i7)) ? m3.j.f8417b : m3.j.f8416a;
    }

    public final x1.c b(int i7) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        p pVar = this.f1409b;
        pVar.k(i7);
        ArrayList arrayList = pVar.f1421h;
        s sVar = (s) arrayList.get(g0.d(i7, arrayList));
        b bVar = sVar.f1441a;
        int iD = sVar.d(i7);
        CharSequence charSequence = bVar.f1311e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbT = ob.a.t("offset(", ") is out of bounds [0,", iD);
            sbT.append(charSequence.length());
            sbT.append(')');
            h3.a.a(sbT.toString());
        }
        c3.n nVar = bVar.f1310d;
        Layout layout = nVar.f2408f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = nVar.g(lineForOffset);
        float fE = nVar.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = nVar.i(iD, false);
                fH2 = nVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = nVar.h(iD, false);
                fH2 = nVar.h(iD + 1, true);
            } else {
                fI = nVar.i(iD, false);
                fI2 = nVar.i(iD + 1, true);
            }
            float f10 = fH;
            fI = fH2;
            fI2 = f10;
        } else {
            fI = nVar.h(iD, false);
            fI2 = nVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return sVar.a(new x1.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final x1.c c(int i7) {
        p pVar = this.f1409b;
        ArrayList arrayList = pVar.f1421h;
        pVar.l(i7);
        s sVar = (s) arrayList.get(i7 == ((h) pVar.f1414a.f1433b).f1353b.length() ? n3.l.A(arrayList) : g0.d(i7, arrayList));
        b bVar = sVar.f1441a;
        int iD = sVar.d(i7);
        CharSequence charSequence = bVar.f1311e;
        c3.n nVar = bVar.f1310d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbT = ob.a.t("offset(", ") is out of bounds [0,", iD);
            sbT.append(charSequence.length());
            sbT.append(']');
            h3.a.a(sbT.toString());
        }
        float fH = nVar.h(iD, false);
        int lineForOffset = nVar.f2408f.getLineForOffset(iD);
        return sVar.a(new x1.c(fH, nVar.g(lineForOffset), fH, nVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j5 = this.f1410c;
        float f10 = (int) (j5 >> 32);
        p pVar = this.f1409b;
        return f10 < pVar.f1417d || pVar.f1416c || ((float) ((int) (j5 & 4294967295L))) < pVar.f1418e;
    }

    public final float e(int i7) {
        p pVar = this.f1409b;
        pVar.m(i7);
        ArrayList arrayList = pVar.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        int i10 = i7 - sVar.f1444d;
        c3.n nVar = bVar.f1310d;
        return nVar.f2408f.getLineLeft(i10) + (i10 == nVar.f2409g + (-1) ? nVar.f2412j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return i9.l.a(this.f1408a, o0Var.f1408a) && this.f1409b.equals(o0Var.f1409b) && n3.m.a(this.f1410c, o0Var.f1410c) && this.f1411d == o0Var.f1411d && this.f1412e == o0Var.f1412e && i9.l.a(this.f1413f, o0Var.f1413f);
    }

    public final float f(int i7) {
        p pVar = this.f1409b;
        pVar.m(i7);
        ArrayList arrayList = pVar.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        int i10 = i7 - sVar.f1444d;
        c3.n nVar = bVar.f1310d;
        return nVar.f2408f.getLineRight(i10) + (i10 == nVar.f2409g + (-1) ? nVar.k : 0.0f);
    }

    public final int g(int i7) {
        p pVar = this.f1409b;
        pVar.m(i7);
        ArrayList arrayList = pVar.f1421h;
        s sVar = (s) arrayList.get(g0.e(i7, arrayList));
        b bVar = sVar.f1441a;
        return bVar.f1310d.f2408f.getLineStart(i7 - sVar.f1444d) + sVar.f1442b;
    }

    public final m3.j h(int i7) {
        p pVar = this.f1409b;
        ArrayList arrayList = pVar.f1421h;
        pVar.l(i7);
        s sVar = (s) arrayList.get(i7 == ((h) pVar.f1414a.f1433b).f1353b.length() ? n3.l.A(arrayList) : g0.d(i7, arrayList));
        b bVar = sVar.f1441a;
        int iD = sVar.d(i7);
        c3.n nVar = bVar.f1310d;
        return nVar.f2408f.getParagraphDirection(nVar.f2408f.getLineForOffset(iD)) == 1 ? m3.j.f8416a : m3.j.f8417b;
    }

    public final int hashCode() {
        int iHashCode = (this.f1409b.hashCode() + (this.f1408a.hashCode() * 31)) * 31;
        long j5 = this.f1410c;
        return this.f1413f.hashCode() + ob.a.j(this.f1412e, ob.a.j(this.f1411d, (((int) (j5 ^ (j5 >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final y1.h i(int i7, int i10) {
        p pVar = this.f1409b;
        h hVar = (h) pVar.f1414a.f1433b;
        if (i7 < 0 || i7 > i10 || i10 > hVar.f1353b.length()) {
            h3.a.a("Start(" + i7 + ") or End(" + i10 + ") is out of range [0.." + hVar.f1353b.length() + "), or start > end!");
        }
        if (i7 == i10) {
            return y1.j.a();
        }
        y1.h hVarA = y1.j.a();
        g0.g(pVar.f1421h, g0.b(i7, i10), new d0.z(hVarA, i7, i10, 2));
        return hVarA;
    }

    public final long j(int i7) {
        int iW;
        int iT;
        int iT2;
        p pVar = this.f1409b;
        ArrayList arrayList = pVar.f1421h;
        pVar.l(i7);
        s sVar = (s) arrayList.get(i7 == ((h) pVar.f1414a.f1433b).f1353b.length() ? n3.l.A(arrayList) : g0.d(i7, arrayList));
        b bVar = sVar.f1441a;
        int iD = sVar.d(i7);
        d3.e eVarJ = bVar.f1310d.j();
        if (eVarJ.r(eVarJ.w(iD))) {
            eVarJ.b(iD);
            iW = iD;
            while (iW != -1 && (!eVarJ.r(iW) || eVarJ.n(iW))) {
                iW = eVarJ.w(iW);
            }
        } else {
            eVarJ.b(iD);
            if (eVarJ.q(iD)) {
                iW = (!eVarJ.o(iD) || eVarJ.m(iD)) ? eVarJ.w(iD) : iD;
            } else {
                iW = eVarJ.m(iD) ? eVarJ.w(iD) : -1;
            }
        }
        if (iW == -1) {
            iW = iD;
        }
        if (eVarJ.n(eVarJ.t(iD))) {
            eVarJ.b(iD);
            iT = iD;
            while (iT != -1 && (eVarJ.r(iT) || !eVarJ.n(iT))) {
                iT = eVarJ.t(iT);
            }
        } else {
            eVarJ.b(iD);
            if (eVarJ.m(iD)) {
                if (!eVarJ.o(iD) || eVarJ.q(iD)) {
                    iT2 = eVarJ.t(iD);
                    iT = iT2;
                } else {
                    iT = iD;
                }
            } else if (eVarJ.q(iD)) {
                iT2 = eVarJ.t(iD);
                iT = iT2;
            } else {
                iT = -1;
            }
        }
        if (iT != -1) {
            iD = iT;
        }
        return sVar.b(g0.b(iW, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f1408a + ", multiParagraph=" + this.f1409b + ", size=" + ((Object) n3.m.b(this.f1410c)) + ", firstBaseline=" + this.f1411d + ", lastBaseline=" + this.f1412e + ", placeholderRects=" + this.f1413f + ')';
    }
}
