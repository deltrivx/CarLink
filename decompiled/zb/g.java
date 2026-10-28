package zb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f15819d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15822c;

    static {
        e eVar = e.f15816a;
        f fVar = f.f15817b;
        f15819d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z10, e eVar, f fVar) {
        i9.l.e(eVar, "bytes");
        i9.l.e(fVar, "number");
        this.f15820a = z10;
        this.f15821b = eVar;
        this.f15822c = fVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(\n    upperCase = ");
        sb2.append(this.f15820a);
        sb2.append(",\n    bytes = BytesHexFormat(\n");
        this.f15821b.a("        ", sb2);
        sb2.append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f15822c.a("        ", sb2);
        sb2.append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
