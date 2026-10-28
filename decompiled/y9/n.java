package y9;

import java.util.ArrayList;
import java.util.HashMap;
import u8.b0;
import u8.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 y9.n[], still in use, count: 1, list:
  (r2v8 y9.n[]) from 0x0295: CONSTRUCTOR (r0v48 b9.b) = (r2v8 y9.n[]) A[MD:(java.lang.Enum[]):void (m)] call: b9.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f15143b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b9.b f15165y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15166a;

    static {
        b9.b bVar = new b9.b(nVarArr);
        f15165y = bVar;
        f15143b = new HashMap();
        i9.b bVar2 = new i9.b(6, bVar);
        while (bVar2.hasNext()) {
            n nVar = (n) bVar2.next();
            f15143b.put(nVar.name(), nVar);
        }
        b9.b bVar3 = f15165y;
        ArrayList arrayList = new ArrayList();
        bVar3.getClass();
        i9.b bVar4 = new i9.b(6, bVar3);
        while (bVar4.hasNext()) {
            Object next = bVar4.next();
            if (((n) next).f15166a) {
                arrayList.add(next);
            }
        }
        p.M0(arrayList);
        p.M0(f15165y);
        n nVar2 = CLASS;
        n3.l.J(ANNOTATION_CLASS, nVar2);
        n3.l.J(LOCAL_CLASS, nVar2);
        n3.l.J(CLASS_ONLY, nVar2);
        n nVar3 = OBJECT;
        n3.l.J(COMPANION_OBJECT, nVar3, nVar2);
        n3.l.J(STANDALONE_OBJECT, nVar3, nVar2);
        n3.l.J(INTERFACE, nVar2);
        n3.l.J(ENUM_CLASS, nVar2);
        n nVar4 = PROPERTY;
        n nVar5 = FIELD;
        n3.l.J(ENUM_ENTRY, nVar4, nVar5);
        n nVar6 = PROPERTY_SETTER;
        n3.l.I(nVar6);
        n nVar7 = PROPERTY_GETTER;
        n3.l.I(nVar7);
        n3.l.I(FUNCTION);
        n nVar8 = FILE;
        n3.l.I(nVar8);
        d dVar = d.CONSTRUCTOR_PARAMETER;
        n nVar9 = VALUE_PARAMETER;
        b0.W0(new t8.j(dVar, nVar9), new t8.j(d.FIELD, nVar5), new t8.j(d.PROPERTY, nVar4), new t8.j(d.FILE, nVar8), new t8.j(d.PROPERTY_GETTER, nVar7), new t8.j(d.PROPERTY_SETTER, nVar6), new t8.j(d.RECEIVER, nVar9), new t8.j(d.SETTER_PARAMETER, nVar9), new t8.j(d.PROPERTY_DELEGATE_FIELD, nVar5));
    }

    public n(boolean z10) {
        super(str, i);
        this.f15166a = z10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f15164x.clone();
    }
}
