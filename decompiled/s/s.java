package s;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.q f12493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n4.e f12494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12497f;

    public s(int i7) {
        this.f12492a = i7;
        if (i7 <= 0) {
            t.a.c("maxSize <= 0");
            throw null;
        }
        this.f12493b = new oa.q(1);
        this.f12494c = new n4.e(14);
    }

    public final Object a(Object obj) {
        i9.l.e(obj, "key");
        synchronized (this.f12494c) {
            oa.q qVar = this.f12493b;
            qVar.getClass();
            Object obj2 = qVar.f9620a.get(obj);
            if (obj2 != null) {
                this.f12496e++;
                return obj2;
            }
            this.f12497f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        i9.l.e(obj, "key");
        synchronized (this.f12494c) {
            this.f12495d++;
            oa.q qVar = this.f12493b;
            qVar.getClass();
            objPut = qVar.f9620a.put(obj, obj2);
            if (objPut != null) {
                this.f12495d--;
            }
        }
        d(this.f12492a);
        return objPut;
    }

    public final Object c(Object obj) {
        Object objRemove;
        synchronized (this.f12494c) {
            oa.q qVar = this.f12493b;
            qVar.getClass();
            objRemove = qVar.f9620a.remove(obj);
            if (objRemove != null) {
                this.f12495d--;
            }
        }
        return objRemove;
    }

    public final void d(int i7) {
        while (true) {
            synchronized (this.f12494c) {
                try {
                    if (this.f12495d < 0 || (this.f12493b.f9620a.isEmpty() && this.f12495d != 0)) {
                        break;
                    }
                    if (this.f12495d > i7 && !this.f12493b.f9620a.isEmpty()) {
                        Set setEntrySet = this.f12493b.f9620a.entrySet();
                        i9.l.d(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) u8.p.l0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        oa.q qVar = this.f12493b;
                        qVar.getClass();
                        i9.l.e(key, "key");
                        qVar.f9620a.remove(key);
                        int i10 = this.f12495d;
                        i9.l.e(value, "value");
                        this.f12495d = i10 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f12494c) {
            try {
                int i7 = this.f12496e;
                int i10 = this.f12497f + i7;
                str = "LruCache[maxSize=" + this.f12492a + ",hits=" + this.f12496e + ",misses=" + this.f12497f + ",hitRate=" + (i10 != 0 ? (i7 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
