package o3;

import i9.l;
import java.util.Arrays;
import n4.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9455b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f9454a = fArr;
        this.f9455b = fArr2;
    }

    @Override // o3.a
    public final float a(float f10) {
        return e.g(f10, this.f9455b, this.f9454a);
    }

    @Override // o3.a
    public final float b(float f10) {
        return e.g(f10, this.f9454a, this.f9455b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f9454a, cVar.f9454a) && Arrays.equals(this.f9455b, cVar.f9455b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9455b) + (Arrays.hashCode(this.f9454a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f9454a);
        l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f9455b);
        l.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
