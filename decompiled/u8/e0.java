package u8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13108a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13109b;

    public e0(a2.b bVar) {
        this.f13109b = bVar;
    }

    public e0(List list) {
        i9.l.e(list, "delegate");
        this.f13109b = list;
    }

    @Override // u8.a
    public final int c() {
        switch (this.f13108a) {
            case 0:
                return ((List) this.f13109b).size();
            default:
                return ((Matcher) ((a2.b) this.f13109b).f12b).groupCount() + 1;
        }
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f13108a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f13108a) {
            case 0:
                return ((List) this.f13109b).get(p.d0(i7, this));
            default:
                String strGroup = ((Matcher) ((a2.b) this.f13109b).f12b).group(i7);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // u8.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f13108a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // u8.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f13108a) {
            case 0:
                return new p1.c0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // u8.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f13108a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // u8.e, java.util.List
    public ListIterator listIterator() {
        switch (this.f13108a) {
            case 0:
                return new p1.c0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // u8.e, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f13108a) {
            case 0:
                return new p1.c0(this, i7);
            default:
                return super.listIterator(i7);
        }
    }
}
