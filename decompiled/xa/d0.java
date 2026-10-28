package xa;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f14766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f14768c;

    public d0(z zVar, Comparable comparable, Object obj) {
        this.f14768c = zVar;
        this.f14766a = comparable;
        this.f14767b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14766a.compareTo(((d0) obj).f14766a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f14766a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f14767b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14766a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14767b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14766a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14767b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14768c.b();
        Object obj2 = this.f14767b;
        this.f14767b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14766a);
        String strValueOf2 = String.valueOf(this.f14767b);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
