package a8;

import b8.m2;
import b8.n2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f264f;

    public /* synthetic */ v0(Object obj, Object obj2, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, int i7) {
        this.f259a = i7;
        this.f263e = obj;
        this.f264f = obj2;
        this.f260b = b1Var;
        this.f261c = b1Var2;
        this.f262d = b1Var3;
    }

    @Override // h9.a
    public final Object invoke() {
        m2 m2Var;
        int i7 = this.f259a;
        f1.b1 b1Var = this.f262d;
        f1.b1 b1Var2 = this.f261c;
        f1.b1 b1Var3 = this.f260b;
        t8.z zVar = t8.z.f12851a;
        Object obj = this.f264f;
        Object obj2 = this.f263e;
        switch (i7) {
            case 0:
                n8.q qVar = (n8.q) obj2;
                String str = ((l8.j0) obj).f8198c;
                m0 m0Var = new m0(qVar, this.f260b, this.f261c, this.f262d, 1);
                qVar.getClass();
                n8.q.h(str, m0Var);
                break;
            case 1:
                h9.k kVar = (h9.k) obj2;
                n2 n2Var = (n2) obj;
                if (((List) b1Var3.getValue()).isEmpty() || ((List) b1Var2.getValue()).isEmpty()) {
                    hc.c cVar = n8.c.f8897a;
                    n8.c.j(0, "执行或触发不能为空");
                } else {
                    String str2 = (String) b1Var.getValue();
                    if (str2.length() == 0 && ((m2Var = (m2) u8.p.m0((List) b1Var2.getValue())) == null || (str2 = m2Var.f1615b) == null)) {
                        str2 = "新建任务";
                    }
                    kVar.invoke(n2.a(n2Var, str2, (List) b1Var3.getValue(), (List) b1Var2.getValue(), false, 17));
                }
                break;
            case 2:
                e8.h1 h1Var = (e8.h1) obj;
                ((h9.k) obj2).invoke(new m2(h1Var.f4552a, h1Var.f4553b, ((String) b1Var3.getValue()) + "-" + ((String) b1Var2.getValue()) + " " + (((Boolean) b1Var.getValue()).booleanValue() ? "之内" : "之外"), new b8.v1((String) b1Var3.getValue(), (String) b1Var2.getValue(), ((Boolean) b1Var.getValue()).booleanValue())));
                break;
            default:
                b1Var2.setValue((String) b1Var3.getValue());
                t8.o oVar = n8.d.f8898a;
                n8.d.g((String) ((t8.j) obj2).f12830a, (String) b1Var3.getValue());
                ((h9.k) obj).invoke((String) b1Var2.getValue());
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return zVar;
    }
}
