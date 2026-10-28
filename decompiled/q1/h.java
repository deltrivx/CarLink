package q1;

import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10585b;

    public h(int i7, Integer num) {
        this.f10584a = i7;
        this.f10585b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10584a == hVar.f10584a && l.a(this.f10585b, hVar.f10585b);
    }

    public final int hashCode() {
        int i7 = this.f10584a * 31;
        Integer num = this.f10585b;
        return i7 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f10584a + ", dataOffset=" + this.f10585b + ')';
    }
}
