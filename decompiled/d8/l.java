package d8;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import b3.b0;
import b8.a1;
import b8.c2;
import b8.n2;
import b8.u0;
import com.baidu.carlife.sdk.util.Logger;
import i9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f3821a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f3822b = new SparseArray();

    public static u0 a(int i7, int i10) {
        Object next;
        n2.Companion.getClass();
        yb.g gVar = new yb.g(new yb.h(yb.l.S(yb.l.O(u8.p.f0((Iterable) n2.f1622h.getValue()), new b0(13)), new b0(14)), true, k.f3816b));
        while (gVar.hasNext()) {
            next = gVar.next();
            u0 u0Var = (u0) next;
            if (u0Var.f1656b == i7 && u0Var.f1657c == i10) {
                return (u0) next;
            }
        }
        next = null;
        return (u0) next;
    }

    public static boolean b(int i7, final boolean z10) {
        n2.Companion.getClass();
        yb.g gVar = new yb.g(new yb.h(yb.l.S(yb.l.O(u8.p.f0((Iterable) n2.f1622h.getValue()), new b0(11)), new b0(12)), true, new h9.k() { // from class: d8.i
            @Override // h9.k
            public final Object invoke(Object obj) {
                c2 c2Var = (c2) obj;
                i9.l.e(c2Var, "it");
                return Boolean.valueOf(z10 ? c2Var instanceof a1 : c2Var instanceof u0);
            }
        }));
        while (gVar.hasNext()) {
            c2 c2Var = (c2) gVar.next();
            if (c2Var instanceof u0) {
                if (((u0) c2Var).f1656b == i7) {
                    return true;
                }
            } else if ((c2Var instanceof a1) && ((a1) c2Var).f1564b == i7) {
                return true;
            }
        }
        return false;
    }

    public static void c(KeyEvent keyEvent, h9.k kVar) {
        int keyCode = keyEvent.getKeyCode();
        x xVar = new x();
        SparseArray sparseArray = f3822b;
        Object obj = sparseArray.get(keyCode);
        xVar.f6688a = obj;
        if (obj == null) {
            j jVar = new j();
            xVar.f6688a = jVar;
            sparseArray.put(keyCode, jVar);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int action = keyEvent.getAction();
        Handler handler = f3821a;
        if (action == 0) {
            if (keyEvent.getRepeatCount() == 0) {
                j jVar2 = (j) xVar.f6688a;
                jVar2.f3814c = false;
                handler.removeCallbacksAndMessages(jVar2.f3812a);
                handler.postAtTime(new h(xVar, keyCode, kVar), ((j) xVar.f6688a).f3812a, jUptimeMillis + 600);
                return;
            }
            return;
        }
        if (action != 1) {
            return;
        }
        handler.removeCallbacksAndMessages(((j) xVar.f6688a).f3812a);
        j jVar3 = (j) xVar.f6688a;
        if (jVar3.f3814c) {
            jVar3.f3813b = 0;
            return;
        }
        if (jVar3.f3813b != 1 || jUptimeMillis - jVar3.f3815d >= 400) {
            jVar3.f3813b = 1;
            jVar3.f3815d = jUptimeMillis;
            handler.postAtTime(new h(keyCode, kVar, xVar), jVar3.f3812a, jUptimeMillis + 400);
        } else {
            Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(keyCode, "【按键事件】触发双击: "));
            kVar.invoke(1);
            ((j) xVar.f6688a).f3813b = 0;
        }
    }
}
