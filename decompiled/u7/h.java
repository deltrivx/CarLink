package u7;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import fc.h0;
import fc.y;
import i9.l;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h0 f13084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h0 f13085o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f13095j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13097m;

    static {
        o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new h(n8.d.a("TIME_SWITCH", false), n8.d.b(0, "TIME_ALIGNMENT"), n8.d.d("TIME_BACKGROUND_COLOR", "#80000000"), n8.d.b(16, "TIME_ROUNDED_CORNER"), n8.d.b(26, "TIME_MARGIN_VERTICAL"), n8.d.b(26, "TIME_MARGIN_HORIZONTAL"), n8.d.d("TIME_FORMAT", "hh:mm • EEE|yyyy/MM/dd"), n8.d.d("TIME_FONT_COLOR", "#FFFFFFFF"), n8.d.b(30, "TIME_FONT_SIZE"), n8.d.a("TIME_FONT_WEIGHT", true), n8.d.b(30, "TIME_LINE_HEIGHT"), n8.d.b(10, "TIME_PADDING_VERTICAL"), n8.d.b(16, "TIME_PADDING_HORIZONTAL")));
        f13084n = h0VarB;
        f13085o = h0VarB;
    }

    public h(boolean z10, int i7, String str, int i10, int i11, int i12, String str2, String str3, int i13, boolean z11, int i14, int i15, int i16) {
        this.f13086a = z10;
        this.f13087b = i7;
        this.f13088c = str;
        this.f13089d = i10;
        this.f13090e = i11;
        this.f13091f = i12;
        this.f13092g = str2;
        this.f13093h = str3;
        this.f13094i = i13;
        this.f13095j = z11;
        this.k = i14;
        this.f13096l = i15;
        this.f13097m = i16;
    }

    public static h a(h hVar, boolean z10, int i7, String str, int i10, int i11, int i12, String str2, String str3, int i13, boolean z11, int i14, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            z10 = hVar.f13086a;
        }
        boolean z12 = z10;
        int i18 = (i17 & 2) != 0 ? hVar.f13087b : i7;
        String str4 = (i17 & 4) != 0 ? hVar.f13088c : str;
        int i19 = (i17 & 8) != 0 ? hVar.f13089d : i10;
        int i20 = (i17 & 16) != 0 ? hVar.f13090e : i11;
        int i21 = (i17 & 32) != 0 ? hVar.f13091f : i12;
        String str5 = (i17 & 64) != 0 ? hVar.f13092g : str2;
        String str6 = (i17 & 128) != 0 ? hVar.f13093h : str3;
        int i22 = (i17 & 256) != 0 ? hVar.f13094i : i13;
        boolean z13 = (i17 & 512) != 0 ? hVar.f13095j : z11;
        int i23 = (i17 & 1024) != 0 ? hVar.k : i14;
        int i24 = (i17 & 2048) != 0 ? hVar.f13096l : i15;
        int i25 = (i17 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0 ? hVar.f13097m : i16;
        hVar.getClass();
        hVar.getClass();
        l.e(str4, "backgroundColor");
        l.e(str5, "format");
        l.e(str6, "fontColor");
        return new h(z12, i18, str4, i19, i20, i21, str5, str6, i22, z13, i23, i24, i25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f13086a == hVar.f13086a && this.f13087b == hVar.f13087b && l.a(this.f13088c, hVar.f13088c) && this.f13089d == hVar.f13089d && this.f13090e == hVar.f13090e && this.f13091f == hVar.f13091f && l.a(this.f13092g, hVar.f13092g) && l.a(this.f13093h, hVar.f13093h) && this.f13094i == hVar.f13094i && this.f13095j == hVar.f13095j && this.k == hVar.k && this.f13096l == hVar.f13096l && this.f13097m == hVar.f13097m;
    }

    public final int hashCode() {
        return ((((((((((ob.a.l(this.f13093h, ob.a.l(this.f13092g, (((((ob.a.l(this.f13088c, (((this.f13086a ? 1231 : 1237) * 31) + this.f13087b) * 31, 31) + this.f13089d) * 31) + this.f13090e) * 31) + this.f13091f) * 31, 31), 31) + this.f13094i) * 31) + (this.f13095j ? 1231 : 1237)) * 31) + this.k) * 31) + this.f13096l) * 31) + this.f13097m) * 31) + 1237;
    }

    public final String toString() {
        return "FloatTimeState(switch=" + this.f13086a + ", alignment=" + this.f13087b + ", backgroundColor=" + this.f13088c + ", roundedCorner=" + this.f13089d + ", marginVertical=" + this.f13090e + ", marginHorizontal=" + this.f13091f + ", format=" + this.f13092g + ", fontColor=" + this.f13093h + ", fontSize=" + this.f13094i + ", fontWeight=" + this.f13095j + ", lineHeight=" + this.k + ", paddingVertical=" + this.f13096l + ", paddingHorizontal=" + this.f13097m + ", showDialog=false)";
    }
}
