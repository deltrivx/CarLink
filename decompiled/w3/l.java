package w3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14122a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f14123b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14124c = new Object();

    public static void a(j jVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f14124c) {
            try {
                WeakHashMap weakHashMap = f14123b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i7, new i(colorStateList, jVar.f14120a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
