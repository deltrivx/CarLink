package a8;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f275d;

    public /* synthetic */ x(h9.k kVar, f1.b1 b1Var, f1.b1 b1Var2, int i7) {
        this.f272a = i7;
        this.f273b = kVar;
        this.f274c = b1Var;
        this.f275d = b1Var2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f272a) {
            case 0:
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                String strB = j0Var.f8197b.b();
                f1.b1 b1Var = this.f274c;
                b1Var.setValue(strB);
                this.f273b.invoke((String) b1Var.getValue());
                this.f275d.setValue(Boolean.FALSE);
                break;
            case 1:
                g3.w wVar = (g3.w) obj;
                this.f274c.setValue(wVar);
                f1.b1 b1Var2 = this.f275d;
                boolean zA = i9.l.a((String) b1Var2.getValue(), wVar.f5889a.f1353b);
                b3.h hVar = wVar.f5889a;
                b1Var2.setValue(hVar.f1353b);
                if (!zA) {
                    this.f273b.invoke(hVar.f1353b);
                }
                return t8.z.f12851a;
            default:
                String str = (String) obj;
                i9.l.e(str, "newValue");
                this.f273b.invoke(str);
                Pattern patternCompile = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
                i9.l.d(patternCompile, "compile(...)");
                Boolean boolValueOf = Boolean.valueOf(str.length() > 0 && !patternCompile.matcher(str).matches());
                f1.b1 b1Var3 = this.f274c;
                b1Var3.setValue(boolValueOf);
                this.f275d.setValue(((Boolean) b1Var3.getValue()).booleanValue() ? "(请输入合法的 IP 地址)" : "");
                break;
        }
        return t8.z.f12851a;
    }
}
