package e6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t5.a aVar, int i7) {
        super(aVar);
        this.f4435c = i7;
    }

    @Override // e6.f
    public final String m() throws n5.i {
        if (((t5.a) this.f4439a).f12760b != 60) {
            throw n5.i.f8833c;
        }
        StringBuilder sb2 = new StringBuilder();
        p(sb2, 5);
        t(sb2, 45, 15);
        return sb2.toString();
    }

    @Override // e6.e
    public final void r(StringBuilder sb2, int i7) {
        switch (this.f4435c) {
            case 0:
                sb2.append("(3103)");
                break;
            default:
                if (i7 >= 10000) {
                    sb2.append("(3203)");
                } else {
                    sb2.append("(3202)");
                }
                break;
        }
    }

    @Override // e6.e
    public final int s(int i7) {
        switch (this.f4435c) {
            case 0:
                return i7;
            default:
                return i7 < 10000 ? i7 : i7 - 10000;
        }
    }
}
