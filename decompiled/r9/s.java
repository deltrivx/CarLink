package r9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class s implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f11759b;

    public /* synthetic */ s(a0 a0Var, int i7) {
        this.f11758a = i7;
        this.f11759b = a0Var;
    }

    public s(a0 a0Var, w wVar) {
        this.f11758a = 6;
        this.f11759b = a0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, t8.h] */
    @Override // h9.a
    public final Object invoke() throws InvocationTargetException {
        int i7 = this.f11758a;
        c0 c0Var = c0.f11666a;
        c0 c0Var2 = c0.f11667b;
        a0 a0Var = this.f11759b;
        switch (i7) {
            case 0:
                return new w(a0Var);
            case 1:
                int i10 = a0.f11647d;
                wa.b bVarT = a0Var.t();
                Class cls = a0Var.f11648b;
                r1 r1Var = ((w) a0Var.f11649c.getValue()).f11662a;
                o9.u uVar = b0.f11661b[0];
                Object objInvoke = r1Var.invoke();
                i9.l.d(objInvoke, "getValue(...)");
                ca.f fVar = (ca.f) objInvoke;
                jb.i iVar = fVar.f2581a;
                x9.e eVarB = (bVarT.f14238c && cls.isAnnotationPresent(Metadata.class)) ? iVar.b(bVarT) : x9.v.d(iVar.f7019b, bVarT);
                if (eVarB != null) {
                    return eVarB;
                }
                if (cls.isSynthetic()) {
                    return a0.s(bVarT, fVar);
                }
                ca.c cVarW = a.a.w(cls);
                qa.a aVar = cVarW != null ? cVarW.f2577b.f10999a : null;
                switch (aVar == null ? -1 : x.f11791a[aVar.ordinal()]) {
                    case -1:
                    case 6:
                        throw new cc.a0(2, "Unresolved class: " + cls + " (kind = " + aVar + ')');
                    case 0:
                    default:
                        throw new cc.s();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return a0.s(bVarT, fVar);
                    case 5:
                        throw new cc.a0(2, "Unknown class: " + cls + " (kind = " + aVar + ')');
                }
            case 2:
                return a0Var.h(a0Var.u().n().U(), c0Var);
            case 3:
                gb.o oVarQ = a0Var.u().Q();
                i9.l.d(oVarQ, "getStaticScope(...)");
                return a0Var.h(oVarQ, c0Var);
            case 4:
                return a0Var.h(a0Var.u().n().U(), c0Var2);
            case 5:
                gb.o oVarQ2 = a0Var.u().Q();
                i9.l.d(oVarQ2, "getStaticScope(...)");
                return a0Var.h(oVarQ2, c0Var2);
            case 6:
                Class cls2 = a0Var.f11648b;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                wa.b bVarT2 = a0Var.t();
                if (!bVarT2.f14238c) {
                    String strB = bVarT2.f().b();
                    i9.l.d(strB, "asString(...)");
                    return strB;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return zb.j.M0(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return zb.j.L0(simpleName, '$', simpleName);
                }
                return zb.j.M0(simpleName, enclosingConstructor.getName() + '$');
            case 7:
                if (a0Var.f11648b.isAnonymousClass()) {
                    return null;
                }
                wa.b bVarT3 = a0Var.t();
                if (bVarT3.f14238c) {
                    return null;
                }
                return bVarT3.a().f14240a.f14243a;
            default:
                Collection collectionE = a0Var.e();
                ArrayList arrayList = new ArrayList(u8.q.a0(collectionE, 10));
                Iterator it = collectionE.iterator();
                while (it.hasNext()) {
                    arrayList.add(new g0(a0Var, (x9.j) it.next()));
                }
                return arrayList;
        }
    }
}
