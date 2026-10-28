package androidx.compose.foundation.layout;

import c1.v;
import d0.u;
import i9.l;
import r1.f;
import r1.g;
import r1.h;
import r1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f828i;

    static {
        u uVar = u.f3633b;
        f820a = new FillElement(uVar);
        u uVar2 = u.f3632a;
        f821b = new FillElement(uVar2);
        u uVar3 = u.f3634c;
        f822c = new FillElement(uVar3);
        f fVar = r1.c.f11104n;
        int i7 = 3;
        f823d = new WrapContentElement(uVar, new b3.a(i7, fVar), fVar);
        f fVar2 = r1.c.f11103m;
        f824e = new WrapContentElement(uVar, new b3.a(i7, fVar2), fVar2);
        g gVar = r1.c.k;
        int i10 = 4;
        f825f = new WrapContentElement(uVar2, new b3.a(i10, gVar), gVar);
        g gVar2 = r1.c.f11101j;
        f826g = new WrapContentElement(uVar2, new b3.a(i10, gVar2), gVar2);
        h hVar = r1.c.f11096e;
        int i11 = 5;
        f827h = new WrapContentElement(uVar3, new b3.a(i11, hVar), hVar);
        h hVar2 = r1.c.f11092a;
        f828i = new WrapContentElement(uVar3, new b3.a(i11, hVar2), hVar2);
    }

    public static final p a(p pVar, float f10, float f11) {
        return pVar.a(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static final p b(p pVar, float f10) {
        return pVar.a(new SizeElement(0.0f, f10, 0.0f, f10, 5));
    }

    public static final p c(p pVar, float f10, float f11) {
        return pVar.a(new SizeElement(0.0f, f10, 0.0f, f11, 5));
    }

    public static /* synthetic */ p d(p pVar, float f10, float f11, int i7) {
        if ((i7 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f11 = Float.NaN;
        }
        return c(pVar, f10, f11);
    }

    public static final p e(p pVar) {
        float f10 = v.f2205b;
        return pVar.a(new SizeElement(f10, f10, f10, f10, false));
    }

    public static final p f(p pVar, float f10, float f11) {
        return pVar.a(new SizeElement(f10, f11, f10, f11, false));
    }

    public static p g(p pVar, float f10, float f11, float f12, float f13, int i7) {
        return pVar.a(new SizeElement(f10, (i7 & 2) != 0 ? Float.NaN : f11, (i7 & 4) != 0 ? Float.NaN : f12, (i7 & 8) != 0 ? Float.NaN : f13, false));
    }

    public static final p h(p pVar, float f10) {
        return pVar.a(new SizeElement(f10, f10, f10, f10, true));
    }

    public static final p i(p pVar, float f10, float f11) {
        return pVar.a(new SizeElement(f10, f11, f10, f11, true));
    }

    public static final p j(p pVar) {
        float f10 = y.f.f14858a;
        float f11 = y.f.f14860c;
        return pVar.a(new SizeElement(f10, f11, y.f.f14859b, f11, true));
    }

    public static final p k(p pVar, float f10) {
        return pVar.a(new SizeElement(f10, 0.0f, f10, 0.0f, 10));
    }

    public static p l(float f10, float f11, int i7) {
        return new SizeElement((i7 & 1) != 0 ? Float.NaN : f10, 0.0f, (i7 & 2) != 0 ? Float.NaN : f11, 0.0f, 10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static p m(p pVar, int i7) {
        WrapContentElement wrapContentElement;
        g gVar = r1.c.k;
        if (gVar.equals(gVar)) {
            wrapContentElement = f825f;
        } else if (gVar.equals(r1.c.f11101j)) {
            wrapContentElement = f826g;
        } else {
            wrapContentElement = new WrapContentElement(u.f3632a, new b3.a(4, gVar), gVar);
        }
        return pVar.a(wrapContentElement);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static p n(p pVar, int i7) {
        WrapContentElement wrapContentElement;
        h hVar = r1.c.f11096e;
        if (hVar.equals(hVar)) {
            wrapContentElement = f827h;
        } else if (hVar.equals(r1.c.f11092a)) {
            wrapContentElement = f828i;
        } else {
            wrapContentElement = new WrapContentElement(u.f3634c, new b3.a(5, hVar), hVar);
        }
        return pVar.a(wrapContentElement);
    }

    public static p o(p pVar) {
        WrapContentElement wrapContentElement;
        f fVar = r1.c.f11104n;
        if (l.a(fVar, fVar)) {
            wrapContentElement = f823d;
        } else if (l.a(fVar, r1.c.f11103m)) {
            wrapContentElement = f824e;
        } else {
            wrapContentElement = new WrapContentElement(u.f3633b, new b3.a(3, fVar), fVar);
        }
        return pVar.a(wrapContentElement);
    }
}
