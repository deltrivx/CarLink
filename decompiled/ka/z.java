package ka;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.w f7491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7494d;

    public z(nb.w wVar, List list, ArrayList arrayList, List list2) {
        this.f7491a = wVar;
        this.f7492b = list;
        this.f7493c = arrayList;
        this.f7494d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f7491a.equals(zVar.f7491a) && this.f7492b.equals(zVar.f7492b) && this.f7493c.equals(zVar.f7493c) && this.f7494d.equals(zVar.f7494d);
    }

    public final int hashCode() {
        return this.f7494d.hashCode() + ((((this.f7493c.hashCode() + ((this.f7492b.hashCode() + (this.f7491a.hashCode() * 961)) * 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f7491a + ", receiverType=null, valueParameters=" + this.f7492b + ", typeParameters=" + this.f7493c + ", hasStableParameterNames=false, errors=" + this.f7494d + ')';
    }
}
