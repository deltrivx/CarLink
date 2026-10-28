package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f237c;

    public /* synthetic */ t(f1.b1 b1Var, f1.b1 b1Var2, int i7) {
        this.f235a = i7;
        this.f236b = b1Var;
        this.f237c = b1Var2;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.f235a) {
            case 0:
                String str2 = (String) obj2;
                i9.l.e(str, "name");
                i9.l.e(str2, "label");
                this.f236b.setValue(str);
                this.f237c.setValue(str2);
                break;
            default:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                i9.l.e(str, "file");
                this.f236b.setValue(bool);
                this.f237c.setValue(str);
                break;
        }
        return t8.z.f12851a;
    }
}
