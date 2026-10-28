package e6;

import com.tencent.bugly.BuglyStrategy;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4438d;

    public c(t5.a aVar, String str, String str2) {
        super(aVar);
        this.f4437c = str2;
        this.f4438d = str;
    }

    @Override // e6.f
    public final String m() throws n5.i {
        if (((t5.a) this.f4439a).f12760b != 84) {
            throw n5.i.f8833c;
        }
        StringBuilder sb2 = new StringBuilder();
        p(sb2, 8);
        t(sb2, 48, 20);
        int iX = a2.b.x(68, 16, (t5.a) ((a2.b) this.f4440b).f12b);
        if (iX != 38400) {
            sb2.append('(');
            sb2.append(this.f4437c);
            sb2.append(')');
            int i7 = iX % 32;
            int i10 = iX / 32;
            int i11 = (i10 % 12) + 1;
            int i12 = i10 / 12;
            if (i12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i12);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i7 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i7);
        }
        return sb2.toString();
    }

    @Override // e6.e
    public final void r(StringBuilder sb2, int i7) {
        sb2.append('(');
        sb2.append(this.f4438d);
        sb2.append(i7 / BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH);
        sb2.append(')');
    }

    @Override // e6.e
    public final int s(int i7) {
        return i7 % BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
    }
}
