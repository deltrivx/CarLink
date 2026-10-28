package wb;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u8.p;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14300a = new j();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        i9.l.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return w.f13122a;
        }
        if (size == 1) {
            return n3.l.I(p.k0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static i e() {
        return new i(0);
    }

    public static Object f(List list, a aVar, l lVar) {
        b bVar = new b(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(it.next(), aVar, bVar, lVar);
        }
        return lVar.j();
    }

    public static void g(Object obj, a aVar, b bVar, l lVar) {
        if (obj != null) {
            if (((HashSet) bVar.f14284a).add(obj) && lVar.c(obj)) {
                Iterator it = aVar.g(obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), aVar, bVar, lVar);
                }
                lVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean h(List list, a aVar, h9.k kVar) {
        return (Boolean) f(list, aVar, new db.d(kVar, new boolean[1], 2));
    }

    public static final boolean i(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!i9.l.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) throws Throwable {
        if (obj instanceof k) {
            throw ((k) obj).f14299a;
        }
    }

    public void b(Object obj) {
    }

    public abstract boolean c(Object obj);

    public abstract Object j();
}
