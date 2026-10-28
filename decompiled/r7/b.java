package r7;

import fc.h0;
import fc.y;
import n8.d;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f11640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f11641f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11645d;

    static {
        o oVar = d.f8898a;
        h0 h0VarB = y.b(new b(d.b(150, "FLOAT_GESTURE_WIDTH"), d.b(6, "FLOAT_GESTURE_HEIGHT"), d.b(22, "FLOAT_GESTURE_BOTTOM"), d.a("FLOAT_GESTURE_SWITCH", true)));
        f11640e = h0VarB;
        f11641f = h0VarB;
    }

    public b(int i7, int i10, int i11, boolean z10) {
        this.f11642a = z10;
        this.f11643b = i7;
        this.f11644c = i10;
        this.f11645d = i11;
    }

    public static b a(b bVar, boolean z10, int i7, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            z10 = bVar.f11642a;
        }
        if ((i12 & 2) != 0) {
            i7 = bVar.f11643b;
        }
        if ((i12 & 4) != 0) {
            i10 = bVar.f11644c;
        }
        if ((i12 & 8) != 0) {
            i11 = bVar.f11645d;
        }
        bVar.getClass();
        return new b(i7, i10, i11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11642a == bVar.f11642a && this.f11643b == bVar.f11643b && this.f11644c == bVar.f11644c && this.f11645d == bVar.f11645d;
    }

    public final int hashCode() {
        return ((((((this.f11642a ? 1231 : 1237) * 31) + this.f11643b) * 31) + this.f11644c) * 31) + this.f11645d;
    }

    public final String toString() {
        return "FloatGestureState(gestureSwitch=" + this.f11642a + ", gestureWidth=" + this.f11643b + ", gestureHeight=" + this.f11644c + ", gestureBottom=" + this.f11645d + ")";
    }
}
