package r2;

import android.view.View;
import android.view.ViewGroup;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f11262a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    public static final g3 a(a aVar, f1.v vVar, n1.c cVar) {
        u uVar;
        g3 g3Var;
        Object[] objArr = 0;
        if (s1.f11400a.compareAndSet(false, true)) {
            ec.h hVarC = i2.c.c(1, 6, null);
            cc.b0.s(cc.b0.a((y8.h) s0.f11389m.getValue()), null, new b1.f((Object) hVarC, (y8.c) (objArr == true ? 1 : 0), 10), 3);
            b2.a aVar2 = new b2.a(10, hVarC);
            synchronized (p1.l.f10057c) {
                p1.l.f10063i = u8.p.y0(p1.l.f10063i, aVar2);
            }
            p1.l.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof u) {
                uVar = (u) childAt;
            }
            if (uVar == null) {
                uVar = new u(aVar.getContext(), vVar.j());
                aVar.addView(uVar.getView(), f11262a);
            }
            Object tag = uVar.getView().getTag(R.id.wrapped_composition_tag);
            g3Var = tag instanceof g3 ? (g3) tag : null;
            if (g3Var == null) {
                g3Var = new g3(uVar, new f1.y(vVar, new a2.b(uVar.getRoot())));
                uVar.getView().setTag(R.id.wrapped_composition_tag, g3Var);
            }
            g3Var.i(cVar);
            if (!i9.l.a(uVar.getCoroutineContext(), vVar.j())) {
                uVar.setCoroutineContext(vVar.j());
            }
            return g3Var;
        }
        aVar.removeAllViews();
        uVar = null;
        if (uVar == null) {
            uVar = new u(aVar.getContext(), vVar.j());
            aVar.addView(uVar.getView(), f11262a);
        }
        Object tag2 = uVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof g3) {
        }
        if (g3Var == null) {
            g3Var = new g3(uVar, new f1.y(vVar, new a2.b(uVar.getRoot())));
            uVar.getView().setTag(R.id.wrapped_composition_tag, g3Var);
        }
        g3Var.i(cVar);
        if (!i9.l.a(uVar.getCoroutineContext(), vVar.j())) {
            uVar.setCoroutineContext(vVar.j());
        }
        return g3Var;
    }
}
