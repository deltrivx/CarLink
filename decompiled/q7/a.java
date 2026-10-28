package q7;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import d0.m;
import f1.q1;
import f1.s;
import h9.n;
import i9.l;
import o2.m0;
import q2.a0;
import q2.j;
import r1.p;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10956b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10957a = 0;

    public /* synthetic */ a() {
    }

    public a(h hVar) {
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f10957a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    z7.f.f15751a.a(6, sVar);
                    MainActivity mainActivity = MainActivity.f2912y;
                    if (mainActivity != null) {
                        mainActivity.moveTaskToBack(true);
                    }
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(1849434622);
                    Object objK = sVar2.K();
                    if (objK == f1.n.f5051a) {
                        objK = new n8.f(14);
                        sVar2.h0(objK);
                    }
                    h9.a aVar = (h9.a) objK;
                    sVar2.p(false);
                    int i10 = h.f10976e;
                    l.e(aVar, "onDoubleTap");
                    SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(zVar, null, new g(0, aVar), 6);
                    m0 m0VarD = m.d(r1.c.f11092a, false);
                    long j5 = sVar2.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    p pVarC = r1.a.c(sVar2, suspendPointerInputElement);
                    j.f10719d0.getClass();
                    a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar2, i11, hVar);
                    }
                    f1.b.w(sVar2, q2.i.f10706c, pVarC);
                    z7.f.f15751a.a(6, sVar2);
                    sVar2.p(true);
                }
                break;
        }
        return zVar;
    }
}
