package da;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 implements na.d {
    @Override // na.b
    public e a(wa.c cVar) {
        Object next;
        i9.l.e(cVar, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (i9.l.a(d.a(g5.a.L(g5.a.G(((e) next).f3868a))).a(), cVar)) {
                return (e) next;
            }
        }
        next = null;
        return (e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && i9.l.a(b(), ((b0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
