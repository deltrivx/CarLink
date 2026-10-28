package e6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(t5.a aVar, int i7) {
        super(aVar);
        this.f4436c = i7;
    }

    @Override // e6.f
    public final String m() throws n5.i {
        switch (this.f4436c) {
            case 0:
                a2.b bVar = (a2.b) this.f4440b;
                if (((t5.a) this.f4439a).f12760b < 48) {
                    throw n5.i.f8833c;
                }
                StringBuilder sb2 = new StringBuilder();
                p(sb2, 8);
                int iX = a2.b.x(48, 2, (t5.a) bVar.f12b);
                sb2.append("(392");
                sb2.append(iX);
                sb2.append(')');
                sb2.append(bVar.v(50, null).f4445b);
                return sb2.toString();
            case 1:
                a2.b bVar2 = (a2.b) this.f4440b;
                if (((t5.a) this.f4439a).f12760b < 48) {
                    throw n5.i.f8833c;
                }
                StringBuilder sb3 = new StringBuilder();
                p(sb3, 8);
                int iX2 = a2.b.x(48, 2, (t5.a) bVar2.f12b);
                sb3.append("(393");
                sb3.append(iX2);
                sb3.append(')');
                int iX3 = a2.b.x(50, 10, (t5.a) bVar2.f12b);
                if (iX3 / 100 == 0) {
                    sb3.append('0');
                }
                if (iX3 / 10 == 0) {
                    sb3.append('0');
                }
                sb3.append(iX3);
                sb3.append(bVar2.v(60, null).f4445b);
                return sb3.toString();
            default:
                StringBuilder sb4 = new StringBuilder();
                sb4.append("(01)");
                int length = sb4.length();
                a2.b bVar3 = (a2.b) this.f4440b;
                sb4.append(a2.b.x(4, 4, (t5.a) bVar3.f12b));
                q(sb4, 8, length);
                return bVar3.u(sb4, 48);
        }
    }
}
