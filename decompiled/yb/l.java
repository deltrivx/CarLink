package yb;

import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.t0;
import u8.w;
import w0.b1;
import x.n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends m {
    public static j M(Iterator it) {
        i9.l.e(it, "<this>");
        return new a(new u8.o(2, it));
    }

    public static int N(j jVar) {
        Iterator it = jVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            it.next();
            i7++;
            if (i7 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i7;
    }

    public static i O(u8.o oVar, h9.k kVar) {
        return new i(oVar, kVar, n.f15281i);
    }

    public static final i P(j jVar) {
        n1 n1Var = new n1(14);
        if (!(jVar instanceof q)) {
            return new i(jVar, new t0(22), n1Var);
        }
        q qVar = (q) jVar;
        return new i(qVar.f15285a, qVar.f15286b, n1Var);
    }

    public static j Q(h9.a aVar) {
        return new a(new c(1, aVar, new b1(aVar, 2)));
    }

    public static j R(Object obj, h9.k kVar) {
        return obj == null ? f.f15266a : new c(1, new j0(1, obj), kVar);
    }

    public static q S(j jVar, h9.k kVar) {
        i9.l.e(kVar, "transform");
        return new q(jVar, kVar);
    }

    public static h T(j jVar, h9.k kVar) {
        return new h(new q(jVar, kVar), false, new n1(15));
    }

    public static List U(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return w.f13122a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return n3.l.I(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
