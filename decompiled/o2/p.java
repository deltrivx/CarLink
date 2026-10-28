package o2;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f9401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f9402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f9403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f9404f;

    public p(String str) {
        this.f9399a = 1;
        this.f9404f = str;
        this.f9400b = new o(1, null);
        this.f9401c = new o(0, null);
        this.f9402d = new o(1, null);
        this.f9403e = new o(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(p[] pVarArr) {
        this.f9399a = 0;
        this.f9404f = pVarArr;
        int length = pVarArr.length;
        o[] oVarArr = new o[length];
        for (int i7 = 0; i7 < length; i7++) {
            oVarArr[i7] = ((p[]) this.f9404f)[i7].b();
        }
        this.f9400b = new o(1, new k1(oVarArr, 0));
        int length2 = ((p[]) this.f9404f).length;
        o[] oVarArr2 = new o[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            oVarArr2[i10] = ((p[]) this.f9404f)[i10].d();
        }
        this.f9401c = new o(0, new n(oVarArr2, 0));
        int length3 = ((p[]) this.f9404f).length;
        o[] oVarArr3 = new o[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            oVarArr3[i11] = ((p[]) this.f9404f)[i11].c();
        }
        this.f9402d = new o(1, new k1(oVarArr3, 1));
        int length4 = ((p[]) this.f9404f).length;
        o[] oVarArr4 = new o[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            oVarArr4[i12] = ((p[]) this.f9404f)[i12].a();
        }
        this.f9403e = new o(0, new n(oVarArr4, 1));
    }

    public final o a() {
        switch (this.f9399a) {
            case 0:
                break;
        }
        return this.f9403e;
    }

    public final o b() {
        switch (this.f9399a) {
            case 0:
                break;
        }
        return this.f9400b;
    }

    public final o c() {
        switch (this.f9399a) {
            case 0:
                break;
        }
        return this.f9402d;
    }

    public final o d() {
        switch (this.f9399a) {
            case 0:
                break;
        }
        return this.f9401c;
    }

    public final String toString() {
        switch (this.f9399a) {
            case 0:
                return u8.l.F0((p[]) this.f9404f, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.f9404f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }
}
