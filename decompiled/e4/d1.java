package e4;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f4335e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4336f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f4337g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4338h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f4339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x3.b f4340d;

    public d1() {
        this.f4339c = i();
    }

    public d1(s1 s1Var) {
        super(s1Var);
        this.f4339c = s1Var.b();
    }

    private static WindowInsets i() {
        if (!f4336f) {
            try {
                f4335e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f4336f = true;
        }
        Field field = f4335e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f4338h) {
            try {
                f4337g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f4338h = true;
        }
        Constructor constructor = f4337g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // e4.h1
    public s1 b() {
        a();
        s1 s1VarC = s1.c(null, this.f4339c);
        x3.b[] bVarArr = this.f4352b;
        o1 o1Var = s1VarC.f4398a;
        o1Var.r(bVarArr);
        o1Var.u(this.f4340d);
        return s1VarC;
    }

    @Override // e4.h1
    public void e(x3.b bVar) {
        this.f4340d = bVar;
    }

    @Override // e4.h1
    public void g(x3.b bVar) {
        WindowInsets windowInsets = this.f4339c;
        if (windowInsets != null) {
            this.f4339c = windowInsets.replaceSystemWindowInsets(bVar.f14563a, bVar.f14564b, bVar.f14565c, bVar.f14566d);
        }
    }
}
