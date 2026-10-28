package r2;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e6.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f11162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f11163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f11164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m3.j f11165h = m3.j.f8417b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m3.j f11166i = m3.j.f8416a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11168d;

    @Override // e6.f
    public final int[] f(int i7) {
        int iD;
        switch (this.f11167c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f11168d;
                    if (breakIterator == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f11168d;
                        if (breakIterator2 == null) {
                            i9.l.j("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i7);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return j(i7, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f11168d;
                    if (breakIterator3 == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            case 1:
                if (k().length() <= 0 || i7 >= k().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!s(i7) && (!s(i7) || (i7 != 0 && s(i7 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f11168d;
                    if (breakIterator4 == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f11168d;
                if (breakIterator5 == null) {
                    i9.l.j("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i7);
                if (iFollowing2 == -1 || !r(iFollowing2)) {
                    return null;
                }
                return j(i7, iFollowing2);
            default:
                if (k().length() <= 0 || i7 >= k().length()) {
                    return null;
                }
                m3.j jVar = f11165h;
                if (i7 < 0) {
                    b3.o0 o0Var = (b3.o0) this.f11168d;
                    if (o0Var == null) {
                        i9.l.j("layoutResult");
                        throw null;
                    }
                    iD = o0Var.f1409b.d(0);
                } else {
                    b3.o0 o0Var2 = (b3.o0) this.f11168d;
                    if (o0Var2 == null) {
                        i9.l.j("layoutResult");
                        throw null;
                    }
                    int iD2 = o0Var2.f1409b.d(i7);
                    iD = p(iD2, jVar) == i7 ? iD2 : iD2 + 1;
                }
                b3.o0 o0Var3 = (b3.o0) this.f11168d;
                if (o0Var3 == null) {
                    i9.l.j("layoutResult");
                    throw null;
                }
                if (iD >= o0Var3.f1409b.f1419f) {
                    return null;
                }
                return j(p(iD, jVar), p(iD, f11166i) + 1);
        }
    }

    @Override // e6.f
    public final int[] n(int i7) {
        int iD;
        switch (this.f11167c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f11168d;
                    if (breakIterator == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f11168d;
                        if (breakIterator2 == null) {
                            i9.l.j("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i7);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return j(iPreceding, i7);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f11168d;
                    if (breakIterator3 == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            case 1:
                int length2 = k().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !s(i7 - 1) && !r(i7)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f11168d;
                    if (breakIterator4 == null) {
                        i9.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f11168d;
                if (breakIterator5 == null) {
                    i9.l.j("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i7);
                if (iPreceding2 == -1 || !s(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !s(iPreceding2 - 1)) {
                    return j(iPreceding2, i7);
                }
                return null;
            default:
                if (k().length() <= 0 || i7 <= 0) {
                    return null;
                }
                int length3 = k().length();
                m3.j jVar = f11166i;
                if (i7 > length3) {
                    b3.o0 o0Var = (b3.o0) this.f11168d;
                    if (o0Var == null) {
                        i9.l.j("layoutResult");
                        throw null;
                    }
                    iD = o0Var.f1409b.d(k().length());
                } else {
                    b3.o0 o0Var2 = (b3.o0) this.f11168d;
                    if (o0Var2 == null) {
                        i9.l.j("layoutResult");
                        throw null;
                    }
                    int iD2 = o0Var2.f1409b.d(i7);
                    iD = p(iD2, jVar) + 1 == i7 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return j(p(iD, f11165h), p(iD, jVar) + 1);
        }
    }

    public int p(int i7, m3.j jVar) {
        b3.o0 o0Var = (b3.o0) this.f11168d;
        if (o0Var == null) {
            i9.l.j("layoutResult");
            throw null;
        }
        int iG = o0Var.g(i7);
        b3.o0 o0Var2 = (b3.o0) this.f11168d;
        if (o0Var2 == null) {
            i9.l.j("layoutResult");
            throw null;
        }
        if (jVar != o0Var2.h(iG)) {
            b3.o0 o0Var3 = (b3.o0) this.f11168d;
            if (o0Var3 != null) {
                return o0Var3.g(i7);
            }
            i9.l.j("layoutResult");
            throw null;
        }
        b3.o0 o0Var4 = (b3.o0) this.f11168d;
        if (o0Var4 != null) {
            return o0Var4.f1409b.c(i7, false) - 1;
        }
        i9.l.j("layoutResult");
        throw null;
    }

    public void q(String str) {
        switch (this.f11167c) {
            case 0:
                this.f4439a = str;
                BreakIterator breakIterator = (BreakIterator) this.f11168d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    i9.l.j("impl");
                    throw null;
                }
            default:
                this.f4439a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f11168d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    i9.l.j("impl");
                    throw null;
                }
        }
    }

    public boolean r(int i7) {
        if (i7 <= 0 || !s(i7 - 1)) {
            return false;
        }
        return i7 == k().length() || !s(i7);
    }

    public boolean s(int i7) {
        if (i7 < 0 || i7 >= k().length()) {
            return false;
        }
        return Character.isLetterOrDigit(k().codePointAt(i7));
    }
}
