package s7;

import fc.h0;
import fc.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f12587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f12588f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12592d;

    static {
        o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new e(n8.d.b(60, "FLOAT_ICON_SIZE"), n8.d.b(12, "FLOAT_ICON_CLIP"), n8.d.b(10, "FLOAT_ICON_ALPHA"), n8.d.a("FLOAT_ICON_SWITCH", false)));
        f12587e = h0VarB;
        f12588f = h0VarB;
    }

    public e(int i7, int i10, int i11, boolean z10) {
        this.f12589a = z10;
        this.f12590b = i7;
        this.f12591c = i10;
        this.f12592d = i11;
    }

    public static e a(e eVar, boolean z10, int i7, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            z10 = eVar.f12589a;
        }
        if ((i12 & 2) != 0) {
            i7 = eVar.f12590b;
        }
        if ((i12 & 4) != 0) {
            i10 = eVar.f12591c;
        }
        if ((i12 & 8) != 0) {
            i11 = eVar.f12592d;
        }
        eVar.getClass();
        return new e(i7, i10, i11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12589a == eVar.f12589a && this.f12590b == eVar.f12590b && this.f12591c == eVar.f12591c && this.f12592d == eVar.f12592d;
    }

    public final int hashCode() {
        return ((((((this.f12589a ? 1231 : 1237) * 31) + this.f12590b) * 31) + this.f12591c) * 31) + this.f12592d;
    }

    public final String toString() {
        return "FloatIconState(iconSwitch=" + this.f12589a + ", iconSize=" + this.f12590b + ", iconClip=" + this.f12591c + ", iconAlpha=" + this.f12592d + ")";
    }
}
