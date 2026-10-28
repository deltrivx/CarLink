package z7;

import fc.h0;
import fc.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0 f15762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h0 f15763m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15773j;
    public final boolean k;

    static {
        o oVar = n8.d.f8898a;
        int iB = n8.d.b(16, "ROUNDED_CORNER");
        boolean zA = n8.d.a("STATUS_SHOW", false);
        o oVar2 = n8.h.f8903a;
        h0 h0VarB = y.b(new k(iB, zA, n8.d.b(n8.h.d(), "STATUS_SIZE"), n8.d.d("STATUS_COLOR", "#00000000"), n8.d.a("NAVIGATION_SHOW", false), n8.d.b(n8.h.c(), "NAVIGATION_SIZE"), n8.d.a("NAVIGATION_POSITION", false), n8.d.d("NAVIGATION_COLOR", "#00000000"), n8.d.a("FULL_SCREEN_HARMAN", false), n8.d.a("FULL_SCREEN_HOZON", false), n8.d.a("IMMERSIVE_MODE", true)));
        f15762l = h0VarB;
        f15763m = h0VarB;
    }

    public k(int i7, boolean z10, int i10, String str, boolean z11, int i11, boolean z12, String str2, boolean z13, boolean z14, boolean z15) {
        this.f15764a = i7;
        this.f15765b = z10;
        this.f15766c = i10;
        this.f15767d = str;
        this.f15768e = z11;
        this.f15769f = i11;
        this.f15770g = z12;
        this.f15771h = str2;
        this.f15772i = z13;
        this.f15773j = z14;
        this.k = z15;
    }

    public static k a(k kVar, int i7, boolean z10, int i10, String str, boolean z11, int i11, boolean z12, String str2, boolean z13, boolean z14, boolean z15, int i12) {
        if ((i12 & 1) != 0) {
            i7 = kVar.f15764a;
        }
        int i13 = i7;
        if ((i12 & 2) != 0) {
            z10 = kVar.f15765b;
        }
        boolean z16 = z10;
        if ((i12 & 4) != 0) {
            i10 = kVar.f15766c;
        }
        int i14 = i10;
        String str3 = (i12 & 8) != 0 ? kVar.f15767d : str;
        boolean z17 = (i12 & 16) != 0 ? kVar.f15768e : z11;
        int i15 = (i12 & 32) != 0 ? kVar.f15769f : i11;
        boolean z18 = (i12 & 64) != 0 ? kVar.f15770g : z12;
        String str4 = (i12 & 128) != 0 ? kVar.f15771h : str2;
        boolean z19 = (i12 & 256) != 0 ? kVar.f15772i : z13;
        boolean z20 = (i12 & 512) != 0 ? kVar.f15773j : z14;
        boolean z21 = (i12 & 1024) != 0 ? kVar.k : z15;
        kVar.getClass();
        i9.l.e(str3, "statusColor");
        i9.l.e(str4, "navigationColor");
        return new k(i13, z16, i14, str3, z17, i15, z18, str4, z19, z20, z21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f15764a == kVar.f15764a && this.f15765b == kVar.f15765b && this.f15766c == kVar.f15766c && i9.l.a(this.f15767d, kVar.f15767d) && this.f15768e == kVar.f15768e && this.f15769f == kVar.f15769f && this.f15770g == kVar.f15770g && i9.l.a(this.f15771h, kVar.f15771h) && this.f15772i == kVar.f15772i && this.f15773j == kVar.f15773j && this.k == kVar.k;
    }

    public final int hashCode() {
        return ((((ob.a.l(this.f15771h, (((((ob.a.l(this.f15767d, ((((this.f15764a * 31) + (this.f15765b ? 1231 : 1237)) * 31) + this.f15766c) * 31, 31) + (this.f15768e ? 1231 : 1237)) * 31) + this.f15769f) * 31) + (this.f15770g ? 1231 : 1237)) * 31, 31) + (this.f15772i ? 1231 : 1237)) * 31) + (this.f15773j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        return "SystemState(roundedCorner=" + this.f15764a + ", statusShow=" + this.f15765b + ", statusSize=" + this.f15766c + ", statusColor=" + this.f15767d + ", navigationShow=" + this.f15768e + ", navigationSize=" + this.f15769f + ", navigationPosition=" + this.f15770g + ", navigationColor=" + this.f15771h + ", fullHarman=" + this.f15772i + ", fullHozon=" + this.f15773j + ", immersiveMode=" + this.k + ")";
    }
}
