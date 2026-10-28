package xa;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14840f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f14842b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f14843c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile s.a f14845e;

    public z(int i7) {
        this.f14841a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i7;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f14842b.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i7 = 0;
            while (i7 <= i12) {
                i11 = (i7 + i12) / 2;
                iCompareTo = comparable.compareTo(((d0) this.f14842b.get(i11)).f14766a);
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i7 = i11 + 1;
                }
            }
            i10 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d0) this.f14842b.get(i12)).f14766a);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i7 = 0;
                while (i7 <= i12) {
                    i11 = (i7 + i12) / 2;
                    iCompareTo = comparable.compareTo(((d0) this.f14842b.get(i11)).f14766a);
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i7 = i11 + 1;
                    }
                }
                i10 = i7 + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f14844d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f14843c.isEmpty() ? c0.f14764b : this.f14843c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f14842b.isEmpty()) {
            this.f14842b.clear();
        }
        if (this.f14843c.isEmpty()) {
            return;
        }
        this.f14843c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f14843c.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f14843c.isEmpty() && !(this.f14843c instanceof TreeMap)) {
            this.f14843c = new TreeMap();
        }
        return (SortedMap) this.f14843c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((d0) this.f14842b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f14842b.isEmpty();
        int i7 = this.f14841a;
        if (zIsEmpty && !(this.f14842b instanceof ArrayList)) {
            this.f14842b = new ArrayList(i7);
        }
        int i10 = -(iA + 1);
        if (i10 >= i7) {
            return d().put(comparable, obj);
        }
        if (this.f14842b.size() == i7) {
            d0 d0Var = (d0) this.f14842b.remove(i7 - 1);
            d().put(d0Var.f14766a, d0Var.f14767b);
        }
        this.f14842b.add(i10, new d0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f14845e == null) {
            this.f14845e = new s.a(this, 1);
        }
        return this.f14845e;
    }

    public final Object f(int i7) {
        b();
        Object obj = ((d0) this.f14842b.remove(i7)).f14767b;
        if (!this.f14843c.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f14842b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new d0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((d0) this.f14842b.get(iA)).f14767b : this.f14843c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f14843c.isEmpty()) {
            return null;
        }
        return this.f14843c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14843c.size() + this.f14842b.size();
    }
}
