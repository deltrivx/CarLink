package g8;

import fc.h0;
import fc.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h0 f6024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h0 f6025j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6033h;

    static {
        o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new i(n8.d.b(0, "VIDEO_WIDTH"), n8.d.b(0, "VIDEO_HEIGHT"), n8.d.b(0, "VIDEO_ALIGNMENT"), n8.d.b(30, "VIDEO_FRAME_RATE"), n8.d.b(0, "VIDEO_RENDER_TYPE"), n8.d.a("VIDEO_STREAM_STATE", false), n8.d.a("VIDEO_REFRESH", false), n8.d.a("VIDEO_RESTART", false)));
        f6024i = h0VarB;
        f6025j = h0VarB;
    }

    public i(int i7, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f6026a = i7;
        this.f6027b = i10;
        this.f6028c = i11;
        this.f6029d = i12;
        this.f6030e = i13;
        this.f6031f = z10;
        this.f6032g = z11;
        this.f6033h = z12;
    }

    public static i a(i iVar, int i7, int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
        if ((i13 & 1) != 0) {
            i7 = iVar.f6026a;
        }
        int i14 = i7;
        if ((i13 & 2) != 0) {
            i10 = iVar.f6027b;
        }
        int i15 = i10;
        if ((i13 & 4) != 0) {
            i11 = iVar.f6028c;
        }
        int i16 = i11;
        int i17 = iVar.f6029d;
        if ((i13 & 16) != 0) {
            i12 = iVar.f6030e;
        }
        int i18 = i12;
        boolean z12 = iVar.f6031f;
        boolean z13 = (i13 & 64) != 0 ? iVar.f6032g : z10;
        boolean z14 = (i13 & 128) != 0 ? iVar.f6033h : z11;
        iVar.getClass();
        return new i(i14, i15, i16, i17, i18, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6026a == iVar.f6026a && this.f6027b == iVar.f6027b && this.f6028c == iVar.f6028c && this.f6029d == iVar.f6029d && this.f6030e == iVar.f6030e && this.f6031f == iVar.f6031f && this.f6032g == iVar.f6032g && this.f6033h == iVar.f6033h;
    }

    public final int hashCode() {
        return (((((((((((((this.f6026a * 31) + this.f6027b) * 31) + this.f6028c) * 31) + this.f6029d) * 31) + this.f6030e) * 31) + (this.f6031f ? 1231 : 1237)) * 31) + (this.f6032g ? 1231 : 1237)) * 31) + (this.f6033h ? 1231 : 1237);
    }

    public final String toString() {
        return "VideoState(width=" + this.f6026a + ", height=" + this.f6027b + ", alignment=" + this.f6028c + ", frameRate=" + this.f6029d + ", renderType=" + this.f6030e + ", streamState=" + this.f6031f + ", refresh=" + this.f6032g + ", restart=" + this.f6033h + ")";
    }
}
