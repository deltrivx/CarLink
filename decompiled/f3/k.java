package f3;

import com.baidu.carlife.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f5258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f5259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f5260e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5261a;

    static {
        k kVar = new k(100);
        k kVar2 = new k(Constants.MSG_RESPONSE_SUCCESS);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f5257b = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f5258c = kVar4;
        f5259d = kVar5;
        f5260e = kVar7;
        n3.l.J(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i7) {
        this.f5261a = i7;
        boolean z10 = false;
        if (1 <= i7 && i7 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        h3.a.a("Font weight can be in range [1, 1000]. Current value: " + i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i9.l.f(this.f5261a, ((k) obj).f5261a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f5261a == ((k) obj).f5261a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5261a;
    }

    public final String toString() {
        return a2.f.H(new StringBuilder("FontWeight(weight="), this.f5261a, ')');
    }
}
