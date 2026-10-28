package rc;

import a8.f1;
import android.app.PendingIntent;
import i9.y;
import i9.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l0.o0;
import pc.m0;
import u8.b0;
import u8.f0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qc.u f12329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nc.e f12330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12332i;

    public /* synthetic */ m(qc.b bVar, qc.u uVar, String str, int i7) {
        this(bVar, uVar, (i7 & 4) != 0 ? null : str, (nc.e) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qc.b bVar, qc.u uVar, String str, nc.e eVar) {
        super(bVar, str);
        i9.l.e(bVar, "json");
        this.f12329f = uVar;
        this.f12330g = eVar;
    }

    @Override // rc.a
    public qc.j B(String str) {
        i9.l.e(str, "tag");
        return (qc.j) b0.V0(str, Q());
    }

    @Override // rc.a
    public String O(nc.e eVar, int i7) throws PendingIntent.CanceledException {
        Object next;
        i9.l.e(eVar, "descriptor");
        qc.b bVar = this.f12313c;
        j.l(eVar, bVar);
        String strL = eVar.l(i7);
        if (this.f12315e.f9623c && !Q().f11052a.keySet().contains(strL)) {
            o0 o0Var = bVar.f11035c;
            f1 f1Var = new f1(17, eVar, bVar);
            o0Var.getClass();
            k kVar = j.f12326a;
            Object objW = o0Var.W(eVar, kVar);
            if (objW == null) {
                objW = f1Var.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o0Var.f7772b;
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(kVar, objW);
            }
            Map map = (Map) objW;
            Iterator it = Q().f11052a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i7) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strL;
    }

    @Override // rc.a
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public qc.u Q() {
        return this.f12329f;
    }

    @Override // rc.a, oc.b
    public final oc.a m(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        nc.e eVar2 = this.f12330g;
        if (eVar != eVar2) {
            return super.m(eVar);
        }
        qc.j jVarC = C();
        String strH = eVar2.h();
        if (jVarC instanceof qc.u) {
            String str = this.f12314d;
            return new m(this.f12313c, (qc.u) jVarC, str, eVar2);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        z zVar = y.f6689a;
        sb2.append(zVar.b(qc.u.class).l());
        sb2.append(", but had ");
        sb2.append(zVar.b(jVarC.getClass()).l());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(S());
        throw j.e(sb2.toString(), jVarC.toString(), -1);
    }

    @Override // rc.a, oc.b
    public final boolean o() {
        return !this.f12332i && super.o();
    }

    @Override // rc.a, oc.a
    public void p(nc.e eVar) {
        Set setG0;
        i9.l.e(eVar, "descriptor");
        qc.b bVar = this.f12313c;
        if (j.i(eVar, bVar) || (eVar.f() instanceof nc.b)) {
            return;
        }
        j.l(eVar, bVar);
        if (this.f12315e.f9623c) {
            Set setD = m0.d(eVar);
            Map map = (Map) bVar.f11035c.W(eVar, j.f12326a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = u8.y.f13124a;
            }
            setG0 = f0.g0(setD, setKeySet);
        } else {
            setG0 = m0.d(eVar);
        }
        for (String str : Q().f11052a.keySet()) {
            if (!setG0.contains(str) && !i9.l.a(str, this.f12314d)) {
                throw j.d(-1, "Encountered an unknown key '" + str + "' at element: " + S() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) j.k(Q().toString(), -1)));
            }
        }
    }

    @Override // oc.a
    public int w(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        while (this.f12331h < eVar.k()) {
            int i7 = this.f12331h;
            this.f12331h = i7 + 1;
            String strP = P(eVar, i7);
            int i10 = this.f12331h - 1;
            this.f12332i = false;
            if (Q().containsKey(strP)) {
                this.f12315e.getClass();
                return i10;
            }
            if (!this.f12313c.f11033a.f9622b && !eVar.o(i10)) {
                eVar.n(i10).i();
            }
            this.f12332i = false;
        }
        return -1;
    }
}
