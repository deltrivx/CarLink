package gc;

import b3.a0;
import cc.b0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f6224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec.a f6226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fc.d f6227d;

    public f(fc.d dVar, y8.h hVar, int i7, ec.a aVar) {
        this.f6224a = hVar;
        this.f6225b = i7;
        this.f6226c = aVar;
        this.f6227d = dVar;
    }

    public abstract f a(y8.h hVar, int i7, ec.a aVar);

    public fc.d b() {
        return null;
    }

    public abstract Object c(fc.e eVar, y8.c cVar);

    public final String d() {
        ArrayList arrayList = new ArrayList(4);
        y8.i iVar = y8.i.f15108a;
        y8.h hVar = this.f6224a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i7 = this.f6225b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        ec.a aVar = ec.a.f4685a;
        ec.a aVar2 = this.f6226c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return a2.f.I(sb2, u8.p.q0(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // gc.r
    public final fc.d g(y8.h hVar, int i7, ec.a aVar) {
        y8.h hVar2 = this.f6224a;
        y8.h hVarS = hVar.s(hVar2);
        ec.a aVar2 = ec.a.f4685a;
        ec.a aVar3 = this.f6226c;
        int i10 = this.f6225b;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i7 == -3) {
                    i7 = i10;
                } else if (i10 != -2) {
                    if (i7 == -2) {
                        i7 = i10;
                    } else {
                        i7 += i10;
                        if (i7 < 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (i9.l.a(hVarS, hVar2) && i7 == i10 && aVar == aVar3) ? this : a(hVarS, i7, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080 A[RETURN] */
    @Override // fc.d
    public final Object l(fc.e eVar, y8.c cVar) {
        Object objG;
        int i7 = this.f6225b;
        z8.a aVar = z8.a.f15774a;
        y8.c cVar2 = null;
        t8.z zVar = t8.z.f12851a;
        if (i7 == -3) {
            y8.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            a0 a0Var = new a0(25);
            y8.h hVar = this.f6224a;
            y8.h hVarS = !((Boolean) hVar.q(a0Var, bool)).booleanValue() ? context.s(hVar) : b0.j(context, hVar, false);
            if (i9.l.a(hVarS, context)) {
                Object objC = c(eVar, cVar);
                if (objC == aVar) {
                    return objC;
                }
            } else {
                y8.d dVar = y8.d.f15107a;
                if (i9.l.a(hVarS.l(dVar), context.l(dVar))) {
                    y8.h context2 = cVar.getContext();
                    if (!(eVar instanceof x) && !(eVar instanceof t)) {
                        eVar = new fc.m(eVar, context2);
                    }
                    Object objA = c.a(hVarS, eVar, hc.a.k(hVarS), new e(this, cVar2, 1), cVar);
                    if (objA == aVar) {
                        return objA;
                    }
                } else {
                    objG = b0.g(new b1.f(eVar, this, cVar2, 3), cVar);
                    if (objG != aVar) {
                        objG = zVar;
                    }
                    if (objG == aVar) {
                        return objG;
                    }
                }
            }
        } else {
            objG = b0.g(new b1.f(eVar, this, cVar2, 3), cVar);
            if (objG != aVar) {
                objG = zVar;
            }
            if (objG == aVar) {
                return objG;
            }
        }
        return zVar;
    }

    public final String toString() {
        return this.f6227d + " -> " + d();
    }
}
