package m7;

import android.app.Activity;
import s.s;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f8583b;

    public /* synthetic */ f(Activity activity, int i7) {
        this.f8582a = i7;
        this.f8583b = activity;
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
        boolean zA;
        int i7 = this.f8582a;
        Activity activity = this.f8583b;
        switch (i7) {
            case 0:
                o oVar = w7.g.f14171a;
                s sVar = x6.a.f14604a;
                z6.a jVar = (z6.a) sVar.a("android.permission.RECORD_AUDIO");
                if (jVar == null) {
                    jVar = new a7.j("android.permission.RECORD_AUDIO", null, 23);
                    sVar.b(jVar.n(), jVar);
                }
                zA = w7.g.a(activity, "麦克风", n3.l.I(jVar));
                break;
            case 1:
                o oVar2 = w7.g.f14171a;
                zA = w7.g.a(activity, "悬浮窗", n3.l.I(x6.a.i()));
                break;
            default:
                o oVar3 = w7.g.f14171a;
                zA = w7.g.a(activity, "悬浮窗", n3.l.I(x6.a.i()));
                break;
        }
        return Boolean.valueOf(zA);
    }
}
