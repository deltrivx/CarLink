package q7;

import fc.h0;
import fc.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f10981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f10982g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10987e;

    static {
        o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new i(n8.d.b(0, "FLOAT_APP_SWITCH"), n8.d.b(((Number) n8.h.e().f12830a).intValue() / 2, "FLOAT_APP_WIDTH"), n8.d.b(((Number) n8.h.e().f12831b).intValue() / 2, "FLOAT_APP_HEIGHT"), n8.d.b(0, "FLOAT_APP_OFFSET_X"), n8.d.b(0, "FLOAT_APP_OFFSET_Y")));
        f10981f = h0VarB;
        f10982g = h0VarB;
    }

    public i(int i7, int i10, int i11, int i12, int i13) {
        this.f10983a = i7;
        this.f10984b = i10;
        this.f10985c = i11;
        this.f10986d = i12;
        this.f10987e = i13;
    }

    public static i a(i iVar, int i7, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i7 = iVar.f10983a;
        }
        int i15 = i7;
        if ((i14 & 2) != 0) {
            i10 = iVar.f10984b;
        }
        int i16 = i10;
        if ((i14 & 4) != 0) {
            i11 = iVar.f10985c;
        }
        int i17 = i11;
        if ((i14 & 8) != 0) {
            i12 = iVar.f10986d;
        }
        int i18 = i12;
        if ((i14 & 16) != 0) {
            i13 = iVar.f10987e;
        }
        iVar.getClass();
        return new i(i15, i16, i17, i18, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10983a == iVar.f10983a && this.f10984b == iVar.f10984b && this.f10985c == iVar.f10985c && this.f10986d == iVar.f10986d && this.f10987e == iVar.f10987e;
    }

    public final int hashCode() {
        return (((((((this.f10983a * 31) + this.f10984b) * 31) + this.f10985c) * 31) + this.f10986d) * 31) + this.f10987e;
    }

    public final String toString() {
        return "FloatAppState(appSwitch=" + this.f10983a + ", appWidth=" + this.f10984b + ", appHeight=" + this.f10985c + ", appOffsetX=" + this.f10986d + ", appOffsetY=" + this.f10987e + ")";
    }
}
