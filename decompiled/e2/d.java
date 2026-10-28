package e2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4132j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        f10 = (i7 & 2) != 0 ? 0.0f : f10;
        f11 = (i7 & 4) != 0 ? 0.0f : f11;
        f12 = (i7 & 8) != 0 ? 0.0f : f12;
        f13 = (i7 & 16) != 0 ? 1.0f : f13;
        f14 = (i7 & 32) != 0 ? 1.0f : f14;
        f15 = (i7 & 64) != 0 ? 0.0f : f15;
        f16 = (i7 & 128) != 0 ? 0.0f : f16;
        if ((i7 & 256) != 0) {
            int i10 = i0.f4202a;
            list = u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList();
        this.f4123a = str;
        this.f4124b = f10;
        this.f4125c = f11;
        this.f4126d = f12;
        this.f4127e = f13;
        this.f4128f = f14;
        this.f4129g = f15;
        this.f4130h = f16;
        this.f4131i = list;
        this.f4132j = arrayList;
    }
}
