package d5;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import cc.s;
import com.baidu.carlifevehicle.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f3767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3768e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3771c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f3770b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3769a = new HashMap();

    public a(Context context) {
        this.f3771c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f3767d == null) {
            synchronized (f3768e) {
                try {
                    if (f3767d == null) {
                        f3767d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3767d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3771c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f3770b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new s(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f3769a;
        if (e0.J()) {
            try {
                e0.m(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f3771c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new s(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
