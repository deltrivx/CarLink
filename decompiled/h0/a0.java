package h0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements hb.d, y9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6279a;

    public a0() {
        s.w wVar = s.l.f12468a;
        this.f6279a = new s.w();
    }

    public a0(nb.w wVar) {
        if (wVar != null) {
            this.f6279a = wVar;
        } else {
            D(0);
            throw null;
        }
    }

    public a0(y9.h hVar) {
        if (hVar != null) {
            this.f6279a = hVar;
        } else {
            p0(0);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i7 == 1) {
            objArr[1] = "getType";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 1 && i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void p0(int i7) {
        String str = i7 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 1 ? 3 : 2];
        if (i7 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i7 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i7 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // y9.a
    public y9.h getAnnotations() {
        y9.h hVar = (y9.h) this.f6279a;
        if (hVar != null) {
            return hVar;
        }
        p0(1);
        throw null;
    }

    @Override // hb.d, x9.t0
    public nb.w getType() {
        nb.w wVar = (nb.w) this.f6279a;
        if (wVar != null) {
            return wVar;
        }
        D(1);
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public List v0(x xVar, int i7, long j5) {
        s.w wVar = (s.w) this.f6279a;
        List list = (List) wVar.b(i7);
        if (list != null) {
            return list;
        }
        v vVar = xVar.f6406c;
        s.w wVar2 = xVar.f6407d;
        List listB0 = (List) wVar2.b(i7);
        if (listB0 == null) {
            Object objB = vVar.b(i7);
            listB0 = xVar.f6405b.b0(xVar.f6404a.a(i7, objB, vVar.c(i7)), objB);
            wVar2.h(i7, listB0);
        }
        int size = listB0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((o2.l0) listB0.get(i10)).u(j5));
        }
        wVar.h(i7, arrayList);
        return arrayList;
    }
}
