package c3;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f2388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f2390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f2391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f2393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2395j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2399o;

    public k(CharSequence charSequence, int i7, TextPaint textPaint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, boolean z10, int i14, int i15, int i16, int i17) {
        this.f2386a = charSequence;
        this.f2387b = i7;
        this.f2388c = textPaint;
        this.f2389d = i10;
        this.f2390e = textDirectionHeuristic;
        this.f2391f = alignment;
        this.f2392g = i11;
        this.f2393h = truncateAt;
        this.f2394i = i12;
        this.f2395j = i13;
        this.k = z10;
        this.f2396l = i14;
        this.f2397m = i15;
        this.f2398n = i16;
        this.f2399o = i17;
        if (i7 < 0) {
            h3.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            h3.a.a("invalid end value");
        }
        if (i11 < 0) {
            h3.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            h3.a.a("invalid width value");
        }
        if (i12 >= 0) {
            return;
        }
        h3.a.a("invalid ellipsizedWidth value");
    }
}
