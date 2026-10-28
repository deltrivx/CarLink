package m7;

import android.os.Build;
import fc.h0;
import fc.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f8589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h0 f8590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h0 f8591o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8601j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8602l;

    static {
        boolean z10 = Build.VERSION.SDK_INT < 23;
        f8589m = z10;
        o oVar = n8.d.f8898a;
        h0 h0VarB = y.b(new j(n8.d.a("AUDIO_MEDIA_LOSS_PLAY", true), n8.d.b(100, "AUDIO_MEDIA_VOLUME"), n8.d.b(256, "AUDIO_MEDIA_CACHE"), n8.d.a("AUDIO_MEDIA_VERSION", false), n8.d.a("AUDIO_TTS_VERSION", false), n8.d.a("AUDIO_VR_VERSION", false), n8.d.a("AUDIO_MEDIA_FOCUS", true), n8.d.a("AUDIO_TTS_FOCUS", true), n8.d.a("AUDIO_VR_FOCUS", true), n8.d.b(z10 ? 3 : 1, "AUDIO_MEDIA"), n8.d.b(z10 ? 3 : 12, "AUDIO_TTS"), n8.d.b(z10 ? 3 : 1, "AUDIO_VR")));
        f8590n = h0VarB;
        f8591o = h0VarB;
    }

    public j(boolean z10, int i7, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, int i12, int i13) {
        this.f8592a = z10;
        this.f8593b = i7;
        this.f8594c = i10;
        this.f8595d = z11;
        this.f8596e = z12;
        this.f8597f = z13;
        this.f8598g = z14;
        this.f8599h = z15;
        this.f8600i = z16;
        this.f8601j = i11;
        this.k = i12;
        this.f8602l = i13;
    }

    public static j a(j jVar, boolean z10, int i7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            z10 = jVar.f8592a;
        }
        boolean z17 = z10;
        if ((i13 & 2) != 0) {
            i7 = jVar.f8593b;
        }
        int i14 = i7;
        int i15 = jVar.f8594c;
        boolean z18 = (i13 & 8) != 0 ? jVar.f8595d : z11;
        boolean z19 = (i13 & 16) != 0 ? jVar.f8596e : z12;
        boolean z20 = (i13 & 32) != 0 ? jVar.f8597f : z13;
        boolean z21 = (i13 & 64) != 0 ? jVar.f8598g : z14;
        boolean z22 = (i13 & 128) != 0 ? jVar.f8599h : z15;
        boolean z23 = (i13 & 256) != 0 ? jVar.f8600i : z16;
        int i16 = (i13 & 512) != 0 ? jVar.f8601j : i10;
        int i17 = (i13 & 1024) != 0 ? jVar.k : i11;
        int i18 = (i13 & 2048) != 0 ? jVar.f8602l : i12;
        jVar.getClass();
        return new j(z17, i14, i15, z18, z19, z20, z21, z22, z23, i16, i17, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f8592a == jVar.f8592a && this.f8593b == jVar.f8593b && this.f8594c == jVar.f8594c && this.f8595d == jVar.f8595d && this.f8596e == jVar.f8596e && this.f8597f == jVar.f8597f && this.f8598g == jVar.f8598g && this.f8599h == jVar.f8599h && this.f8600i == jVar.f8600i && this.f8601j == jVar.f8601j && this.k == jVar.k && this.f8602l == jVar.f8602l;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f8592a ? 1231 : 1237) * 31) + this.f8593b) * 31) + this.f8594c) * 31) + (this.f8595d ? 1231 : 1237)) * 31) + (this.f8596e ? 1231 : 1237)) * 31) + (this.f8597f ? 1231 : 1237)) * 31) + (this.f8598g ? 1231 : 1237)) * 31) + (this.f8599h ? 1231 : 1237)) * 31) + (this.f8600i ? 1231 : 1237)) * 31) + this.f8601j) * 31) + this.k) * 31) + this.f8602l;
    }

    public final String toString() {
        return "AudioState(lossPlayMedia=" + this.f8592a + ", volumeMedia=" + this.f8593b + ", cacheMedia=" + this.f8594c + ", isOldVerMedia=" + this.f8595d + ", isOldVerTTS=" + this.f8596e + ", isOldVerVR=" + this.f8597f + ", focusMedia=" + this.f8598g + ", focusTTS=" + this.f8599h + ", focusVR=" + this.f8600i + ", channelMedia=" + this.f8601j + ", channelTTS=" + this.k + ", channelVR=" + this.f8602l + ")";
    }
}
