package f7;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f5457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f5460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5461e;

    public w(int i7, int i10, int i11, byte[] bArr, int i12) {
        this.f5457a = new t(bArr, i7, i10);
        this.f5459c = i12;
        this.f5458b = i11;
        if (i7 * i10 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i7 + "x" + i10 + " > " + bArr.length);
    }
}
