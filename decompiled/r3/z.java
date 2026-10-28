package r3;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11621e;

    public z(boolean z10, a0 a0Var, boolean z11) {
        c0 c0Var = l.f11571a;
        int i7 = !z10 ? 262152 : 262144;
        i7 = a0Var == a0.f11528b ? i7 | ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT : i7;
        i7 = z11 ? i7 : i7 | 512;
        boolean z12 = a0Var == a0.f11527a;
        this.f11617a = i7;
        this.f11618b = z12;
        this.f11619c = true;
        this.f11620d = true;
        this.f11621e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f11617a == zVar.f11617a && this.f11618b == zVar.f11618b && this.f11619c == zVar.f11619c && this.f11620d == zVar.f11620d && this.f11621e == zVar.f11621e;
    }

    public final int hashCode() {
        return (((((((((this.f11617a * 31) + (this.f11618b ? 1231 : 1237)) * 31) + (this.f11619c ? 1231 : 1237)) * 31) + (this.f11620d ? 1231 : 1237)) * 31) + (this.f11621e ? 1231 : 1237)) * 31) + 1237;
    }
}
