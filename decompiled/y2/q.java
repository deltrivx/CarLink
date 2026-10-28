package y2;

import java.util.ArrayList;
import java.util.List;
import t8.z;
import y1.l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f15031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f15038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f15039j;
    public static final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f15040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f15041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f15042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f15043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f15044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f15045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f15046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f15047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f15048t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15049a;

    static {
        int i7 = 2;
        f15031b = new q(i7, 0);
        f15032c = new q(i7, 1);
        f15033d = new q(i7, 2);
        f15034e = new q(i7, 3);
        f15035f = new q(i7, 4);
        f15036g = new q(i7, 5);
        f15037h = new q(i7, 6);
        f15038i = new q(i7, 7);
        f15039j = new q(i7, 8);
        k = new q(i7, 9);
        f15040l = new q(i7, 10);
        f15041m = new q(i7, 11);
        f15042n = new q(i7, 12);
        f15043o = new q(i7, 13);
        f15044p = new q(i7, 14);
        f15045q = new q(i7, 15);
        f15046r = new q(i7, 16);
        f15047s = new q(i7, 17);
        f15048t = new q(i7, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i7, int i10) {
        super(i7);
        this.f15049a = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        t8.e eVar;
        switch (this.f15049a) {
            case 0:
                return (s1.d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListK0 = u8.p.K0(list);
                arrayListK0.addAll(list2);
                return arrayListK0;
            case 2:
                return (s1.o) obj;
            case 3:
                return (z) obj;
            case 4:
                return (z) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (z) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                g gVar = (g) obj;
                int i7 = ((g) obj2).f14983a;
                return gVar;
            case 10:
                return (l0) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListK1 = u8.p.K0(list3);
                arrayListK1.addAll(list4);
                return arrayListK1;
            case 13:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f14969a) == null) {
                    str = aVar2.f14969a;
                }
                if (aVar == null || (eVar = aVar.f14970b) == null) {
                    eVar = aVar2.f14970b;
                }
                return new a(str, eVar);
            case 17:
                return obj == null ? obj2 : obj;
            default:
                m mVar = (m) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                j jVar = ((m) obj).f15020d;
                u uVar = r.f15067s;
                Object objG = jVar.f15011a.g(uVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = mVar.f15020d.f15011a.g(uVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
