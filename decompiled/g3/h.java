package g3;

import b3.g0;
import b3.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3.e f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5863e;

    public h(b3.h hVar, long j5) {
        String str = hVar.f1353b;
        d3.e eVar = new d3.e();
        eVar.f3763d = str;
        eVar.f3761b = -1;
        eVar.f3762c = -1;
        this.f5859a = eVar;
        this.f5860b = q0.f(j5);
        this.f5861c = q0.e(j5);
        this.f5862d = -1;
        this.f5863e = -1;
        int iF = q0.f(j5);
        int iE = q0.e(j5);
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbT = ob.a.t("start (", ") offset is outside of text region ", iF);
            sbT.append(str.length());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbT2 = ob.a.t("end (", ") offset is outside of text region ", iE);
            sbT2.append(str.length());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (iF > iE) {
            throw new IllegalArgumentException(a2.f.D(iF, iE, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i7, int i10) {
        long jB = g0.b(i7, i10);
        this.f5859a.y("", i7, i10);
        long jR0 = g5.a.r0(g0.b(this.f5860b, this.f5861c), jB);
        h(q0.f(jR0));
        g(q0.e(jR0));
        int i11 = this.f5862d;
        if (i11 != -1) {
            long jR1 = g5.a.r0(g0.b(i11, this.f5863e), jB);
            if (q0.c(jR1)) {
                this.f5862d = -1;
                this.f5863e = -1;
            } else {
                this.f5862d = q0.f(jR1);
                this.f5863e = q0.e(jR1);
            }
        }
    }

    public final char b(int i7) {
        d3.e eVar = this.f5859a;
        com.google.protobuf.q qVar = (com.google.protobuf.q) eVar.f3764e;
        if (qVar != null && i7 >= eVar.f3761b) {
            int iA = qVar.f2834b - qVar.a();
            int i10 = eVar.f3761b;
            if (i7 >= iA + i10) {
                return ((String) eVar.f3763d).charAt(i7 - ((iA - eVar.f3762c) + i10));
            }
            int i11 = i7 - i10;
            int i12 = qVar.f2835c;
            return i11 < i12 ? ((char[]) qVar.f2837e)[i11] : ((char[]) qVar.f2837e)[(i11 - i12) + qVar.f2836d];
        }
        return ((String) eVar.f3763d).charAt(i7);
    }

    public final q0 c() {
        int i7 = this.f5862d;
        if (i7 != -1) {
            return new q0(g0.b(i7, this.f5863e));
        }
        return null;
    }

    public final void d(String str, int i7, int i10) {
        d3.e eVar = this.f5859a;
        if (i7 < 0 || i7 > eVar.l()) {
            StringBuilder sbT = ob.a.t("start (", ") offset is outside of text region ", i7);
            sbT.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 < 0 || i10 > eVar.l()) {
            StringBuilder sbT2 = ob.a.t("end (", ") offset is outside of text region ", i10);
            sbT2.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a2.f.D(i7, i10, "Do not set reversed range: ", " > "));
        }
        eVar.y(str, i7, i10);
        h(str.length() + i7);
        g(str.length() + i7);
        this.f5862d = -1;
        this.f5863e = -1;
    }

    public final void e(int i7, int i10) {
        d3.e eVar = this.f5859a;
        if (i7 < 0 || i7 > eVar.l()) {
            StringBuilder sbT = ob.a.t("start (", ") offset is outside of text region ", i7);
            sbT.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 < 0 || i10 > eVar.l()) {
            StringBuilder sbT2 = ob.a.t("end (", ") offset is outside of text region ", i10);
            sbT2.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i7 >= i10) {
            throw new IllegalArgumentException(a2.f.D(i7, i10, "Do not set reversed or empty range: ", " > "));
        }
        this.f5862d = i7;
        this.f5863e = i10;
    }

    public final void f(int i7, int i10) {
        d3.e eVar = this.f5859a;
        if (i7 < 0 || i7 > eVar.l()) {
            StringBuilder sbT = ob.a.t("start (", ") offset is outside of text region ", i7);
            sbT.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i10 < 0 || i10 > eVar.l()) {
            StringBuilder sbT2 = ob.a.t("end (", ") offset is outside of text region ", i10);
            sbT2.append(eVar.l());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a2.f.D(i7, i10, "Do not set reversed range: ", " > "));
        }
        h(i7);
        g(i10);
    }

    public final void g(int i7) {
        if (!(i7 >= 0)) {
            h3.a.a("Cannot set selectionEnd to a negative value: " + i7);
        }
        this.f5861c = i7;
    }

    public final void h(int i7) {
        if (!(i7 >= 0)) {
            h3.a.a("Cannot set selectionStart to a negative value: " + i7);
        }
        this.f5860b = i7;
    }

    public final String toString() {
        return this.f5859a.toString();
    }
}
