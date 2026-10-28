package w2;

import e2.f;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14086b;

    public a(f fVar, int i7) {
        this.f14085a = fVar;
        this.f14086b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f14085a, aVar.f14085a) && this.f14086b == aVar.f14086b;
    }

    public final int hashCode() {
        return (this.f14085a.hashCode() * 31) + this.f14086b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f14085a);
        sb2.append(", configFlags=");
        return a2.f.H(sb2, this.f14086b, ')');
    }
}
