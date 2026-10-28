package e4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f4429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4432d;

    public y0(t0 t0Var) {
        super(t0Var.f4400a);
        this.f4432d = new HashMap();
        this.f4429a = t0Var;
    }

    public final b1 a(WindowInsetsAnimation windowInsetsAnimation) {
        b1 b1Var = (b1) this.f4432d.get(windowInsetsAnimation);
        if (b1Var == null) {
            b1Var = new b1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                b1Var.f4321a = new z0(windowInsetsAnimation);
            }
            this.f4432d.put(windowInsetsAnimation, b1Var);
        }
        return b1Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f4429a.a(a(windowInsetsAnimation));
        this.f4432d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        t0 t0Var = this.f4429a;
        a(windowInsetsAnimation);
        t0Var.b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f4431c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4431c = arrayList2;
            this.f4430b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = b2.k.j(list.get(size));
            b1 b1VarA = a(windowInsetsAnimationJ);
            b1VarA.f4321a.e(windowInsetsAnimationJ.getFraction());
            this.f4431c.add(b1VarA);
        }
        return this.f4429a.c(s1.c(null, windowInsets), this.f4430b).b();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        android.support.v4.media.session.r rVarE = this.f4429a.e(a(windowInsetsAnimation), new android.support.v4.media.session.r(bounds));
        rVarE.getClass();
        b2.k.m();
        return b2.k.h(((x3.b) rVarE.f604b).d(), ((x3.b) rVarE.f605c).d());
    }
}
