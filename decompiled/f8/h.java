package f8;

import f1.b1;
import h9.k;
import i9.l;
import n3.m;
import o2.w;
import t8.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f5498b;

    public /* synthetic */ h(b1 b1Var, int i7) {
        this.f5497a = i7;
        this.f5498b = b1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f5497a;
        z zVar = z.f12851a;
        b1 b1Var = this.f5498b;
        switch (i7) {
            case 0:
                ((Boolean) obj).getClass();
                i iVar = i.f5499a;
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                o oVar = n8.d.f8898a;
                n8.d.e("TEST_LOGS_SAVE", ((Boolean) b1Var.getValue()).booleanValue());
                return zVar;
            case 1:
                ((k) b1Var.getValue()).invoke((x1.b) obj);
                return zVar;
            case 2:
                m5.k kVar = (m5.k) obj;
                l.e(kVar, "it");
                b1Var.setValue("#" + kVar.f8480b);
                return zVar;
            case 3:
                b1Var.setValue((w) obj);
                return zVar;
            case 4:
                b1Var.setValue((w) obj);
                return zVar;
            case 5:
                b1Var.setValue((w) obj);
                return zVar;
            case 6:
                b1Var.setValue(new m(((m) obj).f8746a));
                return zVar;
            case 7:
                b1Var.setValue((w0.z) obj);
                return zVar;
            default:
                Float f10 = (Float) obj;
                f10.getClass();
                return Float.valueOf(((Number) ((k) b1Var.getValue()).invoke(f10)).floatValue());
        }
    }
}
