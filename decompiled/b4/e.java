package b4;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f1480c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f1478a, eVar.f1478a) && Objects.equals(this.f1479b, eVar.f1479b) && Objects.equals(this.f1480c, eVar.f1480c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1478a, this.f1479b, this.f1480c);
    }
}
