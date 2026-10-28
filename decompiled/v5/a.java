package v5;

import a2.f;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13609h = new a(4201, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f13610i = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f13611j;
    public static final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f13612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f13613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f13614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f13615o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f13619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13622g;

    static {
        a aVar = new a(67, 64, 1);
        f13611j = aVar;
        k = new a(19, 16, 1);
        f13612l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f13613m = aVar2;
        f13614n = aVar2;
        f13615o = aVar;
    }

    public a(int i7, int i10, int i11) {
        this.f13621f = i7;
        this.f13620e = i10;
        this.f13622g = i11;
        this.f13616a = new int[i10];
        this.f13617b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f13616a[i13] = i12;
            i12 <<= 1;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f13617b[this.f13616a[i14]] = i14;
        }
        this.f13618c = new b(this, new int[]{0});
        this.f13619d = new b(this, new int[]{1});
    }

    public final b a(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f13618c;
        }
        int[] iArr = new int[i7 + 1];
        iArr[0] = i10;
        return new b(this, iArr);
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f13616a[(this.f13620e - this.f13617b[i7]) - 1];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f13617b;
        return this.f13616a[(iArr[i7] + iArr[i10]) % (this.f13620e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f13621f));
        sb2.append(',');
        return f.H(sb2, this.f13620e, ')');
    }
}
