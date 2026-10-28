package o1;

import e8.e1;
import f1.s;
import h9.n;
import i9.b0;
import java.util.Arrays;
import l0.t0;
import n3.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0.k f9286a = new u0.k(18, new g0.g(12), new t0(22));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final u0.k b(n nVar, h9.k kVar) {
        int i7 = 18;
        b3.a aVar = new b3.a(i7, nVar);
        b0.d(1, kVar);
        return new u0.k(i7, aVar, kVar);
    }

    public static final Object c(Object[] objArr, j jVar, h9.a aVar, s sVar, int i7) {
        Object[] objArr2;
        j jVar2;
        Object obj;
        Object objC;
        long j5 = sVar.T;
        l.q(36);
        String string = Long.toString(j5, 36);
        i9.l.d(string, "toString(...)");
        i9.l.c(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        f fVar = (f) sVar.j(h.f9281a);
        Object objK = sVar.K();
        Object obj2 = f1.n.f5051a;
        if (objK == obj2) {
            Object objM = (fVar == null || (objC = fVar.c(string)) == null) ? null : jVar.m(objC);
            if (objM == null) {
                objM = aVar.invoke();
            }
            objArr2 = objArr;
            jVar2 = jVar;
            Object aVar2 = new a(jVar2, fVar, string, objM, objArr2);
            sVar.h0(aVar2);
            objK = aVar2;
        } else {
            objArr2 = objArr;
            jVar2 = jVar;
        }
        a aVar3 = (a) objK;
        Object objInvoke = Arrays.equals(objArr2, aVar3.f9267e) ? aVar3.f9266d : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zH = sVar.h(aVar3) | ((((i7 & 112) ^ 48) > 32 && sVar.h(jVar2)) || (i7 & 48) == 32) | sVar.h(fVar) | sVar.f(string) | sVar.h(objInvoke) | sVar.h(objArr2);
        Object objK2 = sVar.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object e1Var = new e1(aVar3, jVar2, fVar, string, obj, objArr3, 1);
            sVar.h0(e1Var);
            objK2 = e1Var;
        } else {
            obj = objInvoke;
        }
        f1.b.h((h9.a) objK2, sVar);
        return obj;
    }

    public static final Object d(Object[] objArr, j jVar, h9.a aVar, s sVar, int i7) {
        return c(Arrays.copyOf(objArr, objArr.length), jVar, aVar, sVar, ((i7 << 3) & 7168) | 384);
    }
}
