package y1;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14968e;

    public z(long j5, long j10, List list) {
        this.f14966c = list;
        this.f14967d = j5;
        this.f14968e = j10;
    }

    @Override // y1.j0
    public final Shader b(long j5) {
        long j10 = this.f14967d;
        int i7 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i7) == Float.POSITIVE_INFINITY) {
            i7 = (int) (j5 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        int i10 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j5 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10);
        long j11 = this.f14968e;
        int i11 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j5 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j5 & 4294967295L)) : Float.intBitsToFloat(i12);
        return h0.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32), this.f14966c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f14966c.equals(zVar.f14966c) && x1.b.b(this.f14967d, zVar.f14967d) && x1.b.b(this.f14968e, zVar.f14968e);
    }

    public final int hashCode() {
        return (x1.b.f(this.f14968e) + ((x1.b.f(this.f14967d) + (this.f14966c.hashCode() * 961)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j5 = this.f14967d;
        String str2 = "";
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) x1.b.j(j5)) + ", ";
        } else {
            str = "";
        }
        long j10 = this.f14968e;
        if ((((9187343241974906880L ^ (j10 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) x1.b.j(j10)) + ", ";
        }
        return "LinearGradient(colors=" + this.f14966c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
