package e4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1 f4332a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f4334c;

    public d0(View view, o oVar) {
        this.f4333b = view;
        this.f4334c = oVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        s1 s1VarC = s1.c(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.f4334c;
        if (i7 < 30) {
            e0.a(windowInsets, this.f4333b);
            if (s1VarC.equals(this.f4332a)) {
                return oVar.d(view, s1VarC).b();
            }
        }
        this.f4332a = s1VarC;
        s1 s1VarD = oVar.d(view, s1VarC);
        if (i7 >= 30) {
            return s1VarD.b();
        }
        WeakHashMap weakHashMap = l0.f4369a;
        c0.c(view);
        return s1VarD.b();
    }
}
