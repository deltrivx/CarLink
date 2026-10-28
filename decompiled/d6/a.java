package d6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.b f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6.b f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c6.c f3774c;

    public a(c6.b bVar, c6.b bVar2, c6.c cVar) {
        this.f3772a = bVar;
        this.f3773b = bVar2;
        this.f3774c = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f3772a, aVar.f3772a) && Objects.equals(this.f3773b, aVar.f3773b) && Objects.equals(this.f3774c, aVar.f3774c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f3772a) ^ Objects.hashCode(this.f3773b)) ^ Objects.hashCode(this.f3774c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f3772a);
        sb2.append(" , ");
        sb2.append(this.f3773b);
        sb2.append(" : ");
        c6.c cVar = this.f3774c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.f2441a));
        sb2.append(" ]");
        return sb2.toString();
    }
}
