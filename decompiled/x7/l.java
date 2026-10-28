package x7;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import fc.h0;
import fc.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h0 f14659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h0 f14660o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14670j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f14672m;

    static {
        t8.o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new l(n8.d.b(0, "SECONDARY_SCREEN_ID"), n8.d.b(0, "SECONDARY_SCREEN_TYPE"), n8.d.b(5, "SECONDARY_SCREEN_DELAY"), n8.d.b(0, "SECONDARY_SCREEN_WIDTH"), n8.d.b(0, "SECONDARY_SCREEN_HEIGHT"), n8.d.b(0, "SECONDARY_SCREEN_OFFSET_X"), n8.d.b(0, "SECONDARY_SCREEN_OFFSET_Y"), n8.d.b(0, "SECONDARY_HUD_ID"), n8.d.b(0, "SECONDARY_HUD_TYPE"), n8.d.b(0, "SECONDARY_HUD_WIDTH"), n8.d.b(0, "SECONDARY_HUD_HEIGHT"), n8.d.b(0, "SECONDARY_HUD_OFFSET_X"), n8.d.b(0, "SECONDARY_HUD_OFFSET_Y")));
        f14659n = h0VarB;
        f14660o = h0VarB;
    }

    public l(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.f14661a = i7;
        this.f14662b = i10;
        this.f14663c = i11;
        this.f14664d = i12;
        this.f14665e = i13;
        this.f14666f = i14;
        this.f14667g = i15;
        this.f14668h = i16;
        this.f14669i = i17;
        this.f14670j = i18;
        this.k = i19;
        this.f14671l = i20;
        this.f14672m = i21;
    }

    public static l a(l lVar, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        if ((i22 & 1) != 0) {
            i7 = lVar.f14661a;
        }
        int i23 = i7;
        int i24 = (i22 & 2) != 0 ? lVar.f14662b : i10;
        int i25 = (i22 & 4) != 0 ? lVar.f14663c : i11;
        int i26 = (i22 & 8) != 0 ? lVar.f14664d : i12;
        int i27 = (i22 & 16) != 0 ? lVar.f14665e : i13;
        int i28 = (i22 & 32) != 0 ? lVar.f14666f : i14;
        int i29 = (i22 & 64) != 0 ? lVar.f14667g : i15;
        int i30 = (i22 & 128) != 0 ? lVar.f14668h : i16;
        int i31 = (i22 & 256) != 0 ? lVar.f14669i : i17;
        int i32 = (i22 & 512) != 0 ? lVar.f14670j : i18;
        int i33 = (i22 & 1024) != 0 ? lVar.k : i19;
        int i34 = (i22 & 2048) != 0 ? lVar.f14671l : i20;
        int i35 = (i22 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? lVar.f14672m : i21;
        lVar.getClass();
        return new l(i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f14661a == lVar.f14661a && this.f14662b == lVar.f14662b && this.f14663c == lVar.f14663c && this.f14664d == lVar.f14664d && this.f14665e == lVar.f14665e && this.f14666f == lVar.f14666f && this.f14667g == lVar.f14667g && this.f14668h == lVar.f14668h && this.f14669i == lVar.f14669i && this.f14670j == lVar.f14670j && this.k == lVar.k && this.f14671l == lVar.f14671l && this.f14672m == lVar.f14672m;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.f14661a * 31) + this.f14662b) * 31) + this.f14663c) * 31) + this.f14664d) * 31) + this.f14665e) * 31) + this.f14666f) * 31) + this.f14667g) * 31) + this.f14668h) * 31) + this.f14669i) * 31) + this.f14670j) * 31) + this.k) * 31) + this.f14671l) * 31) + this.f14672m;
    }

    public final String toString() {
        return "SecondaryState(screenId=" + this.f14661a + ", screenType=" + this.f14662b + ", screenDelay=" + this.f14663c + ", screenWidth=" + this.f14664d + ", screenHeight=" + this.f14665e + ", screenOffsetX=" + this.f14666f + ", screenOffsetY=" + this.f14667g + ", hudId=" + this.f14668h + ", hudType=" + this.f14669i + ", hudWidth=" + this.f14670j + ", hudHeight=" + this.k + ", hudOffsetX=" + this.f14671l + ", hudOffsetY=" + this.f14672m + ")";
    }
}
