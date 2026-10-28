package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f11071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f11072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f11073c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11074d = 0;

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11074d != fVar.f11074d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f11071a, this.f11072b, 0);
        this.f11073c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
