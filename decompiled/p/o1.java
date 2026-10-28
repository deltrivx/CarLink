package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f9855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f9856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f9857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9858d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f9855a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f9856b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f9857c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f9858d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
