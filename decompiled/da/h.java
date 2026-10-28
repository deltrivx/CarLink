package da;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f implements na.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f3872b;

    public h(wa.e eVar, Object[] objArr) {
        super(eVar);
        this.f3872b = objArr;
    }

    public final ArrayList a() {
        na.a pVar;
        Object[] objArr = this.f3872b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            i9.l.b(obj);
            Class<?> cls = obj.getClass();
            List list = d.f3860a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                pVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                pVar = new h(null, (Object[]) obj);
            } else {
                pVar = obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }
}
