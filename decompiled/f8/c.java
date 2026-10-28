package f8;

import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5476b;

    public c(String str, String str2) {
        l.e(str2, "name");
        this.f5475a = str;
        this.f5476b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f5475a, cVar.f5475a) && l.a(this.f5476b, cVar.f5476b);
    }

    public final int hashCode() {
        return this.f5476b.hashCode() + (this.f5475a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceItem(label=" + this.f5475a + ", name=" + this.f5476b + ")";
    }
}
