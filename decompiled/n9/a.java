package n9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8964b;

    public a(float f10, float f11) {
        this.f8963a = f10;
        this.f8964b = f11;
    }

    public static boolean a(Float f10, Float f11) {
        return f10.floatValue() <= f11.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f10 = this.f8963a;
        float f11 = this.f8964b;
        if (f10 > f11) {
            a aVar = (a) obj;
            if (aVar.f8963a > aVar.f8964b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f10 == aVar2.f8963a && f11 == aVar2.f8964b;
    }

    public final int hashCode() {
        float f10 = this.f8963a;
        float f11 = this.f8964b;
        if (f10 > f11) {
            return -1;
        }
        return Float.floatToIntBits(f11) + (Float.floatToIntBits(f10) * 31);
    }

    public final String toString() {
        return this.f8963a + ".." + this.f8964b;
    }
}
