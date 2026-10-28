package oa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.f0;
import nb.a0;
import nb.u0;
import nb.w;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Enum f9626f;

    public r() {
        this.f9621a = 1;
        this.f9622b = true;
        this.f9624d = "    ";
        this.f9625e = "type";
        this.f9623c = true;
        this.f9626f = qc.a.f11030b;
    }

    public r(y9.a aVar, boolean z10, da.a aVar2, ga.a aVar3, boolean z11) {
        this.f9621a = 0;
        i9.l.e(aVar2, "containerContext");
        this.f9624d = aVar;
        this.f9622b = z10;
        this.f9625e = aVar2;
        this.f9626f = aVar3;
        this.f9623c = z11;
    }

    public static void a(Object obj, ArrayList arrayList, aa.a aVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) aVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, aVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:64:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:3: B:26:0x005c->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.util.Collection] */
    public static i b(r0 r0Var) {
        ?? arrayList;
        w wVarF;
        h hVar;
        i9.l.e(r0Var, "<this>");
        if (!(r0Var instanceof f0)) {
            return null;
        }
        List<qb.d> upperBounds = r0Var.getUpperBounds();
        i9.l.d(upperBounds, "getUpperBounds(...)");
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!ob.h.B((qb.d) it.next())) {
                if (upperBounds.isEmpty()) {
                    if (upperBounds.isEmpty()) {
                        return null;
                    }
                    for (qb.d dVar : upperBounds) {
                        i9.l.e(dVar, "<this>");
                        if (nb.c.f((w) dVar) != null) {
                            arrayList = new ArrayList();
                            for (qb.d dVar2 : upperBounds) {
                                i9.l.e(dVar2, "<this>");
                                wVarF = nb.c.f((w) dVar2);
                                if (wVarF != null) {
                                    arrayList.add(wVarF);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = upperBounds.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (upperBounds.isEmpty()) {
                            return null;
                        }
                        while (r1.hasNext()) {
                            i9.l.e(dVar, "<this>");
                            if (nb.c.f((w) dVar) != null) {
                                arrayList = new ArrayList();
                                while (r2.hasNext()) {
                                    i9.l.e(dVar2, "<this>");
                                    wVarF = nb.c.f((w) dVar2);
                                    if (wVarF != null) {
                                        arrayList.add(wVarF);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (d((qb.d) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                if (arrayList.isEmpty()) {
                    hVar = h.f9592b;
                    break;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        hVar = h.f9592b;
                        break;
                    }
                    if (!ob.h.H((qb.d) it3.next())) {
                        hVar = h.f9593c;
                        break;
                    }
                }
                return new i(hVar, arrayList != upperBounds);
            }
        }
        return null;
    }

    public static wa.d c(a0 a0Var) {
        pb.i iVar = u0.f9041a;
        x9.h hVarL = a0Var.D0().l();
        x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
        if (eVar != null) {
            return za.d.g(eVar);
        }
        return null;
    }

    public static h d(qb.d dVar) {
        a0 a0VarH;
        a0 a0VarH2;
        i9.l.e(dVar, "<this>");
        nb.p pVarG = ob.h.g(dVar);
        if (pVarG == null || (a0VarH = ob.h.N(pVarG)) == null) {
            a0VarH = ob.h.h(dVar);
            i9.l.b(a0VarH);
        }
        if (ob.h.F(a0VarH)) {
            return h.f9592b;
        }
        nb.p pVarG2 = ob.h.g(dVar);
        if (pVarG2 == null || (a0VarH2 = ob.h.X(pVarG2)) == null) {
            a0VarH2 = ob.h.h(dVar);
            i9.l.b(a0VarH2);
        }
        if (ob.h.F(a0VarH2)) {
            return null;
        }
        return h.f9593c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, t8.h] */
    public ArrayList e(qb.d dVar) {
        da.a aVar = (da.a) this.f9625e;
        ga.v vVar = (ga.v) aVar.f3849d.getValue();
        ga.b bVar = ((ja.a) aVar.f3847b).f6979q;
        i9.l.e(dVar, "<this>");
        a aVar2 = new a(dVar, bVar.b(vVar, ((w) dVar).getAnnotations()), null);
        aa.a aVar3 = new aa.a(24, this);
        ArrayList arrayList = new ArrayList(1);
        a(aVar2, arrayList, aVar3);
        return arrayList;
    }

    public String toString() {
        switch (this.f9621a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f9622b + ", prettyPrintIndent='" + ((String) this.f9624d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f9625e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f9623c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((qc.a) this.f9626f) + ')';
            default:
                return super.toString();
        }
    }
}
