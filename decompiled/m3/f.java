package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8410d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8411a;

    static {
        a(0.0f);
        a(0.5f);
        f8408b = 0.5f;
        a(-1.0f);
        f8409c = -1.0f;
        a(1.0f);
        f8410d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            h3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f8408b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f8409c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f8410d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f8411a, ((f) obj).f8411a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8411a);
    }

    public final String toString() {
        return b(this.f8411a);
    }
}
