package ka;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f7484b;

    public /* synthetic */ w(a0 a0Var, int i7) {
        this.f7483a = i7;
        this.f7484b = a0Var;
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
    @Override // h9.a
    public final Object invoke() {
        switch (this.f7483a) {
            case 0:
                gb.f fVar = gb.f.f6173m;
                gb.o.f6199a.getClass();
                gb.l lVar = gb.l.f6192b;
                i9.l.e(fVar, "kindFilter");
                List list = fVar.f6180a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = fVar.a(gb.f.f6172l);
                a0 a0Var = this.f7484b;
                fa.b bVar = fa.b.f5505d;
                if (zA) {
                    for (wa.e eVar : a0Var.h(fVar, lVar)) {
                        lVar.invoke(eVar);
                        wb.l.a(linkedHashSet, a0Var.a(eVar, bVar));
                    }
                }
                if (fVar.a(gb.f.f6170i) && !list.contains(gb.b.f6159a)) {
                    for (wa.e eVar2 : a0Var.i(fVar, lVar)) {
                        lVar.invoke(eVar2);
                        linkedHashSet.addAll(a0Var.f(eVar2, bVar));
                    }
                }
                if (fVar.a(gb.f.f6171j) && !list.contains(gb.b.f6159a)) {
                    for (wa.e eVar3 : a0Var.o(fVar)) {
                        lVar.invoke(eVar3);
                        linkedHashSet.addAll(a0Var.b(eVar3, bVar));
                    }
                }
                return u8.p.J0(linkedHashSet);
            case 1:
                return this.f7484b.k();
            case 2:
                return this.f7484b.i(gb.f.f6176p, null);
            case 3:
                return this.f7484b.o(gb.f.f6177q);
            default:
                return this.f7484b.h(gb.f.f6175o, null);
        }
    }
}
